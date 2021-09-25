/*
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

Senaryoelemanların harmonik serisi
Taban değeri giriniz :2
Üs değerini giriniz : 0
Sonuç : 1
Taban değeri giriniz : 2
Üs değerini giriniz : 3
Sonuç : 8
Taban değeri giriniz : 5
Üs değerini giriniz : 3
Sonuç : 125
*/

package java101;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
        System.out.print("Taban değeri giriniz :");
        int taban = Integer.parseInt(kb.nextLine());
        
        System.out.print("Üs değeri giriniz :");
        int üs = Integer.parseInt(kb.nextLine());
        
        int result = pow(taban, üs);
        System.out.printf("pow(%d, %d) = %d", taban, üs, result);
        
	}
	static int pow(int taban, int üs) {
		if (üs == 0)
			return 1;
		return taban * pow(taban, üs - 1);
	}   
}