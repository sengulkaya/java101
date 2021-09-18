package java101;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int firstNum, secondNum, choice;
		System.out.println("İlk sayıyı giriniz : ");
		firstNum = Integer.parseInt(kb.nextLine());
		
		System.out.println("İkinci sayıyı giriniz : ");
		secondNum = Integer.parseInt(kb.nextLine());
		
		System.out.println("Toplama için 1 seçiniz");
		System.out.println("Çıkarma için 2 seçiniz");
		System.out.println("Çarpma için 3 seçiniz");
		System.out.println("Bölme için 4 seçiniz");
		System.out.println("Seçiminiz : ");
		choice = Integer.parseInt(kb.nextLine());
		System.out.println(choice);
		
		switch (choice) {
		case 1 :
			System.out.printf("Toplam : %d%n", firstNum + secondNum);
			break;
		case 2 :
			System.out.printf("Çıkarma : %d", firstNum - secondNum);
			break;
		case 3 : 
			System.out.printf("Çarpma : %d", firstNum * secondNum);
			break;
		case 4 : 
			if (secondNum != 0)
				System.out.printf("Bölme : %.2f", firstNum / (double) secondNum);
			break;		
		default :
			System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz?");
	
		}
		
		

		
	}

}