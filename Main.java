/*
 * Koşullar :
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
*/
 
package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		
		Scanner kb = new Scanner(System.in);
		int a, b, c;
		
	
		for (;;) {
			System.out.println("a ?");
			a = Integer.parseInt(kb.nextLine());
			
			System.out.println("b ?");
			b = Integer.parseInt(kb.nextLine());
			
			System.out.println("c ?");
			c = Integer.parseInt(kb.nextLine());
		
			if ((a <= b) && (a <= c)) {
				if (a == b) {
					if (a == c) {
						System.out.printf("a = b = c : %d = %d = %d%n", a, b, c);
						}
					else {
						System.out.printf("a = b < c : %d = %d < %d%n", a, b, c);
					}
				} else if (a == c) {
					System.out.printf("a = c < b : %d = %d < %d%n", a, c, b);
				} else if (b < c) {
					System.out.printf("a < b < c : %d < %d < %d%n", a, b, c);
				} else if (b == c){
					System.out.printf("a < b = c : %d < %d = %d%n", a, c, b);
				} else {
					System.out.printf("a < c < b : %d < %d < %d%n", a, c, b);
				}
			
				}
			else if ((b <= a) && (b <= c)) {
				if (b == a) {
					if (b == c) {
						System.out.printf("a = b = c : %d = %d = %d%n", a, b, c);
					}
					else {
						System.out.printf("a = b < c : %d = %d < %d%n", a, b, c);
					}
				} else if (b == c) {
					System.out.printf("b = c < a : %d = %d < %d%n", b, c, a);
				} else if (a < c) {
					System.out.printf("b < a < c : %d < %d < %d%n", b, a, c);
				} else if (a == c) {
					System.out.printf("b < a = c : %d < %d = %d%n", b, a, c);
				}else {
					System.out.printf("b < c < a : %d < %d < %d%n", b, c, a);
				}
			} else {//(c <= a) && (c <= b)
				if (c == a) {
					if (c == b) {
						System.out.printf("a = b = c : %d = %d = %d%n", a, b, c);
					} else {
						System.out.printf("a = c < b : %d = %d < %d%n", a, c, b);
					}
				} else if (c == b) {
					System.out.printf("b = c < a : %d = %d < %d%n", b, c, a);
				} else if (a < b) {
					System.out.printf("c < a < b : %d < %d < %d%n", c, a, b);
				} else if (a == b) {
					System.out.printf("c < a = b: %d < %d = %d%n", c, a, b);
				}
				else {
					System.out.printf("c < b < a : %d < %d < %d%n", c, b, a);
				}
			}
			}
		
		}
		
		
}	