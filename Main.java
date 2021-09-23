/*
HarmonikSayılarıBulanProgram
Harmonik Seri Bulan Program
 */
package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.print("n değerini giriniz : ");
        int n = kb.nextInt();
        double result = 0;
        for (int i = 1; i <= n; i++){
            result += (1./i);
        }
        System.out.println(result);

	}
}

	
	