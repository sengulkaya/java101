/*
Kaç tane sayı gireceksiniz: 4
Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
En büyük sayı: 100
En küçük sayı: -22 
 */

package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		 Scanner kb = new Scanner(System.in);
		 
		 System.out.println("Sayı giriniz: ");
		 int n = Integer.parseInt(kb.nextLine());
		 int min = 0;
		 int max = 0;
		 while (n-- > 0) {
			 System.out.println("Sayı giriniz: ");
			 int a = Integer.parseInt(kb.nextLine());
			 if (a < min)
				 min = a;
			 if (a > max)
				 max = a;
			 
		 }
		 
        System.out.printf("En büyük sayı:%d%n", max);
        System.out.printf("En küçük sayı:%d%n", min);

	}
}


	
	