package java101;
import java.util.Scanner;
import static java.lang.Math.*;
import java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		/*
		 * Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
		 * Alan Formülü : π * r * r;
		 * Çevre Formülü : 2 * π * r;
		 * Ödev
		 * Yarıçapı r, merkez açısısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
		 * 𝜋 sayısını = 3.14 alınız.
		 * Formül : (𝜋 * (r*r) * 𝛼) / 360
		 * 
		 * */



		
		Scanner kb = new Scanner(System.in);
		int r;
		double cevre, alan;
		double a;
		double daireDilimininAlanı;
		
		
		for (;;) {
			System.out.println("Yarıçap değerini giriniz : ");
			r = Integer.parseInt(kb.nextLine());
			
			System.out.println("Merkez açısısının ölçüsünü giriniz : ");
			a = Integer.parseInt(kb.nextLine());
			
			System.out.printf("Yarıçap : %d%n", r);
			System.out.printf("Merkez açı ölçüsü : %.0f%n", a);
			
			if (r <= 0)
				break;
			
			cevre = 2 * Math.PI * r;
			alan = PI * pow(r, 2);
			daireDilimininAlanı = alan * a / 360;
			
			System.out.printf("Dairenin cevresi : %.2f%n", cevre);
			System.out.printf("Dairenin alanı : %.2f%n", alan);
			System.out.printf("Merkez açısısının ölçüsü %.0f olan daire diliminin alanı : %.2f%n", a, daireDilimininAlanı);
			
		}
	
		
	}

}