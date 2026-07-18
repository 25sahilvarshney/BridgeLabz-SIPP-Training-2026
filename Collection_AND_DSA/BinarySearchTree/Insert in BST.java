package Collection_AND_DSA.BinarySearchTree;

class InsertInBST {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    Node insert(Node root, int val) {
        if (root == null)
            return new Node(val);

        if (val < root.val)
            root.left = insert(root.left, val);
        else if (val > root.val)
            root.right = insert(root.right, val);

        return root;
    }

    public static void main(String[] args) {
        InsertInBST tree = new InsertInBST();
        Node root = null;
        root = tree.insert(root, 10);
        root = tree.insert(root, 5);
        root = tree.insert(root, 15);
    }
}