Node delete(Node root, int key) {
    if (root == null)
        return null;

    if (key < root.val) {
        root.left = delete(root.left, key);
    }
    else if (key > root.val) {
        root.right = delete(root.right, key);
    }
    else {

        if (root.left == null && root.right == null)
            return null;

        if (root.left == null)
            return root.right;

        if (root.right == null)
            return root.left;

        Node successor = root.right;

        while (successor.left != null)
            successor = successor.left;

        root.val = successor.val;

        root.right = delete(root.right, successor.val);
    }

    return root;
}