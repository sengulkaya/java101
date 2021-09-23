/*
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

 */
package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.println("Üssü alnacak sayıyı giriniz : ");
		int n = Integer.parseInt(kb.nextLine());
		
		System.out.println("Üs olacak sayı : ");
		int r = Integer.parseInt(kb.nextLine());
		
		int result = 1;
		for (int i = 0; i < r; i++) {
			result *= n;
		}
		System.out.println("Cevap : " + result);

	}
}

	
	