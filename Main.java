/*
Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
*/
package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		 Scanner kb = new Scanner(System.in);
		 for (int i = 1; i < 101; i++) {
			 if (i % 2 == 0) {
				 if (i == 2) System.out.printf("%d ", i);
				 continue;
			 }
			 if (i % 3 == 0) {
				 if (i == 3) System.out.printf("%d ", i);
				 	continue; 
			 }
			 if (i % 5 == 0) {
				 if (i == 5) System.out.printf("%d ", i);
				 continue;
			 }
				 
			 if (i % 7 == 0) {
				 if (i == 7) System.out.printf("%d ", i);
				 continue;
			 }
				 
			 if (i % 11 == 0) {
				 if (i == 11) System.out.printf("%d ", i);
				 continue;
			 }
			 
			 
			 for (int j = 13; j < i; j += 2) {
				 if (i % j == 0)
					 break;
			 }
			 
			 System.out.printf("%d ", i);
			 
	
		 }
	}
}


	
	