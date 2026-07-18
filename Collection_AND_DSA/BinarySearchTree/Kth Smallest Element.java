package Collection_AND_DSA.BinarySearchTree;

class KthSmallestElement {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    static int kthSmallest(Node root, int k) {

        java.util.Deque<Node> stack = new java.util.ArrayDeque<>();

        Node current = root;
        int count = 0;

        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();

            count++;

            if (count == k)
                return current.val;

            current = current.right;
        }

        return -1;
    }
}