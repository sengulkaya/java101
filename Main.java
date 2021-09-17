package java101;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		HashMap<String, Double> manavMap = new HashMap<>();
		int armut, elma, domates, muz, patlıcan;
		double total;
		
		manavMap.put("armut", 2.14);
		manavMap.put("elma", 3.67);
		manavMap.put("domates", 1.11);
		manavMap.put("muz", .95);
		manavMap.put("patlıcan", 5.);
		
		
		
		System.out.printf("Armut Kaç Kilo ? : ");
		armut = Integer.parseInt(kb.nextLine());
		
		System.out.printf("Elma Kaç Kilo ? : ");
		elma = Integer.parseInt(kb.nextLine());
		
		System.out.printf("Domates Kaç Kilo ? : ");
		domates = Integer.parseInt(kb.nextLine());
		
		System.out.printf("Muz Kaç Kilo ? : ");
		muz = Integer.parseInt(kb.nextLine());
		
		System.out.printf("Patlıcan Kaç Kilo ? : ");
		patlıcan = Integer.parseInt(kb.nextLine());
		
		
		
		
		total = manavMap.get("armut") * armut + manavMap.get("elma") * elma + manavMap.get("domates") * domates +
				manavMap.get("muz") * muz + manavMap.get("patlıcan") * patlıcan;
		System.out.printf("Toplam Tutar : %.2f TL", total); 

		
	}

}