class SearchInBST {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    boolean search(Node root, int target) {
        Node current = root;

    while (current != null) {
        if (current.val == target)
            return true;

        if (target < current.val)
            current = current.left;
        else
            current = current.right;
    }

    return false;
}
}