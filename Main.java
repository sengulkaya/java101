package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
		Scanner kb = new Scanner(System.in);
		
		
		double kdvOran�, kdvTutar�, kdvliTutar;
		int �cret;
		System.out.print("�cret tutar�n� giriniz : ");
		�cret = Integer.parseInt(kb.nextLine());
		kdvOran� = 0;
		if (�cret > 0 && �cret < 1000) {
			kdvOran� = .18;
		} else if (�cret > 1000) {
			kdvOran� = .08;
		}
		
		
		System.out.printf("KDV oran�: %%%.0f%n", kdvOran� * 100);
		kdvTutar� = �cret * kdvOran�;
		System.out.printf("KDV tutar�: %.2f%n", kdvTutar�);
		kdvliTutar = �cret * kdvOran� + �cret;
		System.out.printf("KDV'li tutar: %.2f%n", kdvliTutar);
		
	}

}