class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}
public class FileSystemManager {
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