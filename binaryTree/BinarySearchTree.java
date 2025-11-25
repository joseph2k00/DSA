public class BinarySearchTree {
    Node root;

    private class Node {
        Node left, right;
        int data;

        Node (int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    BinarySearchTree () { this.root = null; }

    public void addNode (int data) {
        Node node = new Node (data);
        if (root == null) {
            System.out.println(data + " added to as root node");
            root = node;
            return;
        }

        Node prevParent = null;
        Node currNode = root;
        while (currNode != null) {
            prevParent = currNode;
            currNode = (data <= currNode.data) ? currNode.left : currNode.right;
        }

        if (data <= prevParent.data) {
            prevParent.left = node;
            System.out.println(data + " added to left of " + prevParent.data);
        } else {
            prevParent.right = node;
            System.out.println(data + " added to right of " + prevParent.data);
        }
    }

    public void search (int data) {
        Node currNode = root;
        while (currNode != null) {
            if (currNode.data == data) {
                System.out.println("Element found");
                return;
            }
            currNode = (data <= currNode.data) ? currNode.left : currNode.right;
        }
        System.out.println("Element not found");
    }

    public static void main (String args[]) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.addNode(0);
        bst.addNode(1);
        bst.addNode(2);
        bst.addNode(3);
        bst.addNode(4);
        bst.addNode(6);
        bst.addNode(6);
        bst.search(7);
        bst.search(4);
    }
}
