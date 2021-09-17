package java101;
import java.util.Scanner;
import static java.lang.Math.*;
import java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		/*
		 * Kilo (kg) / Boy(m) * Boy(m)
		 * 
		 */

		double height, weight, vücutKitleİndeks;
		
		Scanner kb = new Scanner(System.in);
		
		
		for (;;) {
			System.out.printf("Lütfen boyunuzu (metre cinsinde) giriniz :");
			height = Double.parseDouble(kb.nextLine());
			
			System.out.printf("Lütfen kilonuzu giriniz : ");
			weight = Double.parseDouble(kb.nextLine());
			
			if (height <= 0 || weight <= 0)
				break;
			
			vücutKitleİndeks = weight /(height * height);
			System.out.printf("Vücut Kitle İndeksiniz : %f%n", vücutKitleİndeks);
			
		}
	
		
	}

}