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

		final String [] zodiacSigns = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare",
				 "Öküz", "Kaplan", "Tavşan", "Ejderha" , "Yılan", "At", "Koyun"};
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Doğum Yılınızı Giriniz : ");
		int year = Integer.parseInt(kb.nextLine());
		System.out.printf("Çin Zodyağı Burcunuz : %s", zodiacSigns[year % 12]);
	}

}
	