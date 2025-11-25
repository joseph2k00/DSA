public class BinaryTreeNode {
    int data;
    BinaryTreeNode left, right;
    BinaryTreeNode (int data) {
        this.data = data;
        this.left = this.right = null;
    }

    public static void main(String args[])
    {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);

        System.out.print("Preorder Traversal \t-> ");
        preOrderTraversal(root);
        System.out.println();

        System.out.print("Inorder Traversal \t-> ");
        inOrderTraversal(root);
        System.out.println();
        
        System.out.print("Postorder Traversal \t-> ");
        postOrderTraversal(root);
        System.out.println();
    }

    public static void preOrderTraversal(BinaryTreeNode node) {
        if (node == null) return;
        System.out.print(node.data + ", ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public static void inOrderTraversal(BinaryTreeNode node) {
        if (node == null) return;
        inOrderTraversal(node.left);
        System.out.print(node.data + ", ");
        inOrderTraversal(node.right);
    }

    public static void postOrderTraversal(BinaryTreeNode node) {
        if (node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + ", ");
    }
}
