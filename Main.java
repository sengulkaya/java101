/*
Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız. Java 
 */

package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		 Scanner kb = new Scanner(System.in);
		 
		 System.out.println("a ? : ");
		 int a = Integer.parseInt(kb.nextLine());
		 
		 System.out.println("b ? : ");
		 int b = Integer.parseInt(kb.nextLine());
		 
		 int min = Math.min(a, b);
		 int max = Math.max(a, b);
		 int i = 2;
		 int ebob = 1;
		 int ekok = 1;
		 while (max >= i) {
			 if (a % i == 0 && b % i == 0) {
				 ebob = i;
			 }
			 i++;
		 }
        ekok = (a * b) / ebob;
        System.out.printf("Ebob : %d%n", ebob);
        System.out.printf("Ekok : %d", ekok);

	}
}


	
	