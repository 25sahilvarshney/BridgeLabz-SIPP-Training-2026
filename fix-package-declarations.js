const fs = require('fs');
const path = require('path');
const root = path.join(process.cwd(), 'Collection_AND_DSA');
function sanitizeSegment(seg) {
  let normalized = seg.replace(/[^0-9A-Za-z_]+/g, '_');
  normalized = normalized.replace(/_+/g, '_');
  normalized = normalized.replace(/^_+|_+$/g, '');
  if (!normalized) normalized = '_';
  if (!/^[A-Za-z_]/.test(normalized)) normalized = '_' + normalized;
  return normalized;
}
function expectedPackage(filePath) {
  const rel = path.relative(root, filePath);
  const dir = path.dirname(rel);
  const segments = dir === '.' ? [] : dir.split(path.sep).filter(Boolean).map(sanitizeSegment);
  return ['Collection_AND_DSA', ...segments].join('.');
}
function currentPackage(text) {
  const match = text.match(/^[ \t]*package\s+([A-Za-z0-9_.]+)\s*;/m);
  return match ? match[1] : null;
}
function insertPackage(text, pkgLine) {
  const trimmed = text.replace(/^\uFEFF/, '');
  const match = trimmed.match(/^([ \t]*(?:\/\*[\s\S]*?\*\/\s*|\/\/.*(?:\r?\n|$))*)/);
  const prefix = match ? match[0] : '';
  return prefix + pkgLine + '\n\n' + trimmed.slice(prefix.length);
}
function updateFile(filePath) {
  const text = fs.readFileSync(filePath, 'utf8');
  const expected = expectedPackage(filePath);
  const pkgLine = `package ${expected};`;
  const current = currentPackage(text);
  if (current === expected) return null;
  const updated = current ? text.replace(/^[ \t]*package\s+[A-Za-z0-9_.]+\s*;/m, pkgLine) : insertPackage(text, pkgLine);
  fs.writeFileSync(filePath, updated, 'utf8');
  return { file: path.relative(process.cwd(), filePath), from: current || '(none)', to: expected };
}
function walk(directory) {
  const results = [];
  const entries = fs.readdirSync(directory, { withFileTypes: true });
  for (const entry of entries) {
    const fullPath = path.join(directory, entry.name);
    if (entry.isDirectory()) {
      results.push(...walk(fullPath));
    } else if (entry.isFile() && fullPath.endsWith('.java')) {
      const change = updateFile(fullPath);
      if (change) results.push(change);
    }
  }
  return results;
}
const changes = walk(root);
console.log(JSON.stringify(changes, null, 2));
