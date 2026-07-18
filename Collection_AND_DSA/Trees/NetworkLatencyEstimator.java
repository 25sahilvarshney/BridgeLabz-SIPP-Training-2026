package Collection_AND_DSA.Trees;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}
public class NetworkLatencyEstimator {
    private int maxDiameter = 0;

    public int longestCommunicationPath(Node root) {
        maxDiameter = 0;
        heightAndUpdateDiameter(root);
        return maxDiameter;
    }

    private int heightAndUpdateDiameter(Node node) {
        if (node == null) return -1;

        int leftHeight = heightAndUpdateDiameter(node.left);
        int rightHeight = heightAndUpdateDiameter(node.right);

        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight + 2);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}