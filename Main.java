/*
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
Bir sayı giriniz: 28
28 Mükemmel sayıdır
Bir sayı giriniz: 1
1 Mükemmel sayı değildir.
Bir sayı giriniz: 496
496 Mükemmel sayıdır
 */

package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		 Scanner kb = new Scanner(System.in);
		 
		 System.out.println("Sayı giriniz: ");
		 int n = Integer.parseInt(kb.nextLine());
		 int i = 0;
		 int total = 0;
		 while (++i < n) {
			 if (n % i == 0)
				 total += i;
		 }
		 if (total == n)
			 System.out.printf("%d is a perfect number", n);
		 else
			 System.out.printf("%d is NOT a perfect number", n);
	}
}


	
	