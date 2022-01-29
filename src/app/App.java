package app;

/*
*Root = 7 (Eğer sırasıyla diziyi node olarak eklediğimizi varsayarsak.
                        7
                      /   \
                     5      8
                   /   \     \
                  1     6     9
                 / \
                0   3
                   / \
                  2   4
*Average Case : O(logn)
*Worst Case : O(n)
*Insertion : O(logn)

 */

public class App {
    public static void main(String[] args)
    {
        int[] arr = new int[] {7, 5, 1, 8, 3, 6, 0, 9, 4, 2};
        BinarySearchTree binarySearchTree = new BinarySearchTree(arr);

        binarySearchTree.printBinarySearchTree(binarySearchTree.root);
    }
}
