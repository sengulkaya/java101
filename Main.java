/*
9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
*/
package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		 Scanner kb = new Scanner(System.in);
		 System.out.println("n ? : ");
		 int n = Integer.parseInt(kb.nextLine());
		 
		 int previous = 0;
		 int current = 1;
		 int next;
		 
		 for (int i = 1; i < 3; i++) {
			 System.out.printf("%d ", i - 1);
		 }
		 
		 for (int i = 3; i <= n; i++) {
			 next = previous + current;
			 previous = current;
			 current = next;
			 System.out.printf("%d ", next);
		 }	 
	}
}


	
	