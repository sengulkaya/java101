/*
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */
package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		
		int n;
		Scanner kb = new Scanner(System.in);
		System.out.println("Sınır değerini giriniz : ");
		n = Integer.parseInt(kb.nextLine());
		
		for (int i = 1; i <= n; i *= 4) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		for (int i = 1; i <= n; i *= 5) {
			System.out.printf("%d ", i);
		}
		


	}
}
	
	