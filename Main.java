/*
Armstrong Sayıları Bulan Program
ArmstrongSayılarıBulanProgram

Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.



Örnek : 1643 = 1 + 6 + 4 + 3 = 14

 */
package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.println("Sayı giriniz : ");
		int n = Integer.parseInt(kb.nextLine());
		
		int sum = 0;
		int temp = n;
		while (temp % 10 != 0) {
			sum += temp % 10;
			temp /= 10;
		}
		System.out.printf("%d sayısının basamak sayılarının toplamı : %d", n, sum);

	}
}

	
	