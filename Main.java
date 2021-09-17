package java101;
import java.util.Scanner;
import java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		
		int km = 0;
		double perKm = 2.2;
		double total;
		int fixedCost = 10;
		
		Scanner kb = new Scanner(System.in);
		
		
		for (;;) {
			System.out.printf("Mesafeyi KM cinsinden giriniz : ");
			km = Integer.parseInt(kb.nextLine());
			
			if (km <= 0)
				break;
			
			
			total = km * perKm + fixedCost;
			
			
			System.out.printf("Total : %.2f TL. ", total);
			System.out.printf("You will pay %s TL%n ", total < 20 ? 20 : total);
		}
	
		
	}

}