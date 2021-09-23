/*
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların
 sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
Java ile kombinasyon hesaplayan program yazınız.
Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
 */
package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.println("Küme kaç elemanlı : ");
		int n = Integer.parseInt(kb.nextLine());
		
		System.out.println("Kaç elemanlı kombinasyon görmek istiyorsunuz? : ");
		int r = Integer.parseInt(kb.nextLine());
		
		System.out.printf("%d elemanlı kümenin %d elemanlı %d kombinasyonu olabilir.", n, r, Factoriel.factoriel(n) / (Factoriel.factoriel(n - r) * Factoriel.factoriel(r)));
		

	}
}
class Factoriel {
	public static int factoriel(int n) {
		if (n <= 0)
			return 1;
			
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
	
	