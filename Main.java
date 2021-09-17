package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	
		Scanner kb = new Scanner(System.in);
		
		
		double kdvOraný, kdvTutarý, kdvliTutar;
		int ücret;
		System.out.print("Ücret tutarýný giriniz : ");
		ücret = Integer.parseInt(kb.nextLine());
		kdvOraný = 0;
		if (ücret > 0 && ücret < 1000) {
			kdvOraný = .18;
		} else if (ücret > 1000) {
			kdvOraný = .08;
		}
		
		
		System.out.printf("KDV oraný: %%%.0f%n", kdvOraný * 100);
		kdvTutarý = ücret * kdvOraný;
		System.out.printf("KDV tutarý: %.2f%n", kdvTutarý);
		kdvliTutar = ücret * kdvOraný + ücret;
		System.out.printf("KDV'li tutar: %.2f%n", kdvliTutar);
		
	}

}