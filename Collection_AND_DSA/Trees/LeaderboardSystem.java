package Collection_AND_DSA.Trees;

import java.util.ArrayList;
import java.util.List;

public class LeaderboardSystem {
    private void inorder(Node node, List<Integer> result) {
        if (node == null) return;
        
        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }

    public List<Integer> getSortedLeaderboard(Node root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }
}