/*

 */

package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		 Scanner kb = new Scanner(System.in);
		 System.out.println("Basamak sayısı: ");
		 int n = Integer.parseInt(kb.nextLine());
		 
		 for (int i = n; i > 0; i--) {
			 int numOfBlanks;
			 for (int j = 0; j < n - i; j++) {
				 System.out.print(' ');
			 }
			 for (int k = 0; k < 2 * i - 1; k++) {
				 System.out.print('*');
			 }
			 System.out.println();
		 }
	}
}


	
	