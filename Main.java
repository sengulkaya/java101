package java101;
import java.util.Scanner;
import java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int a, b;
		double c, u, alan;
		
		System.out.printf("a kenar uzunlugunu giriniz? : ");
		a = Integer.parseInt(kb.nextLine());
		
		System.out.printf("b kenar uzunluğunu giriniz? : ");
		b = Integer.parseInt(kb.nextLine());
		
		c = Math.sqrt(a * a + b * b);
		
		System.out.printf("c kenar uzunluğunu : %.2f%n", c);
		System.out.printf("Hipotenüs : %.2f%n", c);
		/*
		 * 
		 * Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2u
		 * 𝑢 = (a+b+c) / 2
		 * Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
		 *
		 */
		u = (a + b + c) / (double)2;
		alan  = Math.sqrt(u * (u - a) * (u - b) * (u - c));
		System.out.printf("Üçgenin alanı : %.2f%n", alan);
		
		
	}

}