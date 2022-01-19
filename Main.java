/*
Proje 1
[22,27,16,2,18,6] -> Insertion Sort

Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
[22,27,16,2,18,6]->
[16,22,27,2,18,6]->
[2,16,22,27,18,6]->
[2,16,18,22,27,6]->
[2,6,16,18,22,27]
Big-O gösterimini yazınız.
O(n^2)
Time Complexity:
Average case: Aradığımız sayının ortada olması
Worst case: Aradığımız sayının sonda olması
Best case: Aradığımız sayının dizinin en başında olması.
Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.
Average case kapsamına girer.

[7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.
1 - [7,3,5,8,2,9,4,15,6]->
2 - [3,7,5,8,2,9,4,15,6]->
3 - [3,5,7,8,2,9,4,15,6]->
4 - [3,5,7,8,2,9,4,15,6]->
5 - [2,3,5,7,8,9,4,15,6]->
6 - [2,3,5,7,8,9,4,15,6]->
7 - [2,3,4,5,7,8,9,15,6]->
8 - [2,3,4,5,6,7,8,9,15]
*/

package java101;




class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr =  new int[] {7,3,5,8,2,9,4,15,6};


		for (int i : arr)
			System.out.printf("%d ", i);
		System.out.println();

		InsertionSort.sort(arr);


		for (int i : arr)
			System.out.printf("%d ", i);


	}
	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = 0;
			for (int j = i; j > 0; j--) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}

		}


	}

}
