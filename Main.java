package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int math, physics, chem, turkish, history, music;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Your math grade?");
		math = Integer.parseInt(kb.nextLine());
		System.out.printf("Your math grade: %d%n", math);
		
		System.out.print("Your physics grade?");
		physics = Integer.parseInt(kb.nextLine());
		System.out.printf("Your physics grade: %d%n", math);
		
		System.out.print("Your chem grade?");
		chem = Integer.parseInt(kb.nextLine());
		System.out.printf("Your chem grade: %d%n", math);
		
		System.out.print("Your turkish grade?");
		turkish = Integer.parseInt(kb.nextLine());
		System.out.printf("Your turkish grade: %d%n", math);
		
		System.out.print("Your history grade?");
		history = Integer.parseInt(kb.nextLine());
		System.out.printf("Your history grade: %d%n", math);
		
		
		System.out.print("Your music grade?");
		music = Integer.parseInt(kb.nextLine());
		System.out.printf("Your music grade: %d%n", math);
		
		int total = math + physics + chem + turkish + history + music;
		double average = total / (double)6;
		System.out.printf("Your average grade: %.2f%n", average);
		System.out.println("Your average grade: " + average);
		
		System.out.printf("%s",average > 60 ? "Sýnýfý Geçti" : "Sýnýfta Kaldý");
		
	}

}