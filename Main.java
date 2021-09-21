/*Aynı örneği switch-case kullanmadan yapınız.
 * Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
 */
package java101;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		
		Scanner kb = new Scanner(System.in);
		int day;
		String month;
		
		System.out.println("Doğduğunuz ay? : ");
		month = kb.nextLine();
		
		System.out.println("Doğduğunuz gün? : ");
		day = Integer.parseInt(kb.nextLine());
		if (month.equals("Mart")) {
			if (day < 21) {
				System.out.println("Balık Burcu : 20 Şubat - 20 Mart");
			} else {
				System.out.println("Koç Burcu : 21 Mart - 20 Nisan");
			}
		} else if (month.equals("Nisan")) {
			if (day < 21) {
				System.out.println("Koç Burcu : 21 Mart - 20 Nisan");
			} else {
				System.out.println("Boğa Burcu : 21 Nisan - 21 Mayıs");
			}
		} else if (month.equals("Mayıs")) {
			if (day < 22) {
				System.out.println("Boğa Burcu : 21 Nisan - 21 Mayıs");
			} else {
				System.out.println("İkizler Burcu : 22 Mayıs - 22 Haziran");
			}
		} else if (month.equals("Haziran")) {
			if (day < 23) {
				System.out.println("İkizler Burcu : 22 Mayıs - 22 Haziran");
			} else {
				System.out.println("Yengeç Burcu : 23 Haziran - 22 Temmuz");
			}
		} else if (month.equals("Temmuz")) {
			if (day < 23) {
				System.out.println("Yengeç Burcu : 23 Haziran - 22 Temmuz");
			} else {
				System.out.println("Aslan Burcu : 23 Temmuz - 22 Ağustos");
			}
		} else if (month.equals("Ağustos")) {
			if (day < 23) {
				System.out.println("Aslan Burcu : 23 Temmuz - 22 Ağustos");
			} else {
				System.out.println("Başak Burcu : 23 Ağustos - 22 Eylül");
			}
		} else if (month.equals("Eylül")) {
			if (day < 23) {
				System.out.println("Başak Burcu : 23 Ağustos - 22 Eylül");
			} else {
				System.out.println("Terazi Burcu : 23 Eylül - 22 Ekim");
			}
		} else if (month.equals("Ekim")) {
			if (day < 23) {
				System.out.println("Terazi Burcu : 23 Eylül - 22 Ekim");
			} else {
				System.out.println("Akrep Burcu : 23 Ekim - 21 Kasım");
			}
		} else if (month.equals("Kasım")) {
			if (day < 22) {
				System.out.println("Akrep Burcu : 23 Ekim - 21 Kasım");
			} else {
				System.out.println("Yay Burcu : 22 Kasım - 21 Aralık");
			}
		} else if (month.equals("Aralık")){
			if (day < 22) {
				System.out.println("Akrep Burcu : 23 Ekim - 21 Kasım");
			} else {
				System.out.println("Oğlak Burcu : 22 Aralık - 21 Ocak");
			}
		} else if (month.equals("Ocak")) {
			if (day < 22) {
				System.out.println("Oğlak Burcu : 22 Aralık - 21 Ocak");
			} else {
				System.out.println("Kova Burcu : 22 Ocak - 19 Şubat");
			}
		} else if (month.equals("Şubat")) {
			if (day < 20) {
				System.out.println("Kova Burcu : 22 Ocak - 19 Şubat");
			} else {
				System.out.println("Balık Burcu : 20 Şubat - 20 Mart");
			}
		}
	
}	