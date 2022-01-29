package app;

public class BinarySearchTree {
    BSTNode root;
    public BinarySearchTree(int[] arr)
    {
        for (int i : arr)
            add(root, i);
    }
    public void printBinarySearchTree(BSTNode node)
    {
        if (node == null) {
            return;
        }
        printBinarySearchTree(node.left);
        System.out.printf("%d ", node.data);
        printBinarySearchTree(node.right);
    }
    public void add(BSTNode node, int data)
    {
        BSTNode newNode = new BSTNode(data);
        if (root == null) {
            root = newNode;
            return;
        } else {
            if (node.data < data) {
                if (node.right == null) {
                    node.right = newNode;
                    return;
                }
                add(node.right, data);
            } else {
                if (node.left == null) {
                    node.left = newNode;
                    return;
                }
                add(node.left, data);
            }
        }

    }
}

class BSTNode {
    BSTNode right;
    BSTNode left;
    int data;
    public BSTNode(int data)
    {
        this.data = data;
    }
}
