/*
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
 ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.


 */
package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		int total = 0;
		int n;
		Scanner kb = new Scanner(System.in);
		
		do {
			System.out.println("Sayı giriniz : ");
			n = Integer.parseInt(kb.nextLine());
			if (n % 4 == 0) {
				total += n;
			}
			
		} while (n % 2 == 0);
		
		System.out.printf("Total : %d%n", total);

	}
}
	
	