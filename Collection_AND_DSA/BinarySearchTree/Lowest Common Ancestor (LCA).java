class LowestCommonAncestorLCA {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    static Node lowestCommonAncestor(Node root, int p, int q) {
        Node current = root;

        while (current != null) {
            if (p < current.val && q < current.val) {
                current = current.left;
            } else if (p > current.val && q > current.val) {
                current = current.right;
            } else {
                return current;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(0);
        root.left.right = new Node(4);
        root.right.left = new Node(7);
        root.right.right = new Node(9);
        root.left.right.left = new Node(3);
        root.left.right.right = new Node(5);

        Node lca = lowestCommonAncestor(root, 2, 8);
        System.out.println(lca != null ? lca.val : "null");
    }
}