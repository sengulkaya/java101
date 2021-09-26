/*
Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
*/

package java101;
import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
        System.out.print("Sayı giriniz :");
        int num = Integer.parseInt(kb.nextLine());
        
        System.out.printf("%d sayısı %s!", num, isPrime(num, 2) ? "ASALDIR ": "ASAL değildir");
        
	}
	static boolean isPrime(int num, int divisor) {
		if (num < 2)
			return false;
		if (divisor > num / 2)
			return true;
		if (num % divisor == 0 && divisor != num)
			return false;
		return isPrime(num, divisor + 1);
		
		} 
}