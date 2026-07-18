class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}
public class FileSystemManager {
    private int height(Node node) {
        if (node == null) return -1;
        
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public void deleteFolderTree(Node node) {
        if (node == null) return;

        deleteFolderTree(node.left);
        deleteFolderTree(node.right);
        
        deleteNode(node);
    }

    private void deleteNode(Node node) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteNode'");
    }
}