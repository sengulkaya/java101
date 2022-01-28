package java101;

import java.util.Arrays;

public class App {
    public static void main(String[] args)
    {
        int[] arr = new int[] {16,21,11,8,12,22};
        arr = new MergeSort().sort(arr);
        for (int i : arr)
            System.out.printf("%d ", i);


    }
}
class MergeSort {
    public int[] sort(int[] arr)
    {
        if (arr.length == 1)
            return arr;

        int mid = arr.length / 2;
        int[] leftArr = Arrays.copyOfRange(arr, 0, mid);
        int[] rightArr = Arrays.copyOfRange(arr, mid, arr.length);
        sort(leftArr);
        sort(rightArr);
        int l = 0;
        int r = 0;
        int index = 0;
        while (l < leftArr.length && r < rightArr.length)
        {
            if (leftArr[l] < rightArr[r]) {
                arr[index++] = leftArr[l++];
                continue;
            } else if (rightArr[r] < leftArr[l]) {
                arr[index++] = rightArr[r++];
                continue;
            } else {
                arr[index++] = rightArr[r++];
                arr[index++] = leftArr[l++];
            }
        }
        if (l == leftArr.length) {
            while (r < rightArr.length)
            {
                arr[index++] = rightArr[r++];
            }
        } else if (r == rightArr.length) {
            while (l < leftArr.length)
            {
                arr[index++] = leftArr[l++];
            }
        }
        return arr;

    }
}
