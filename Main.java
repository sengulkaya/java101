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
		
		/*
		 * Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
		 * Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
		 * Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
		 * Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
		 * */
		double perKM = .1; 
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Mesafeyi km türünden giriniz : ");
		int km = Integer.parseInt(kb.nextLine());
		
		System.out.println("Yaşınızı giriniz : ");
		int year = Integer.parseInt(kb.nextLine());
		
		System.out.println("Yolculuk tipini giriniz : ");
		int yön = Integer.parseInt(kb.nextLine());
		
		if (!(km > 0 && year > 0 && (yön == 1 || yön == 2))) {
			System.out.println("Hatalı Veri Girdiniz !");
			System.exit(-1);
		}
			
			
		double price = perKM * km;
		

		
		
		if (year < 12) {
			price -= price * .5;
		} else if (year < 24) {
			price -= price * .1;
		} else if (year > 65) {
			price -= price * .3;
		}
		
		
		if (yön == 2) {
			price -= price * .2;
			price *= 2;
		}
		
		System.out.printf("Toplam tutar : %.2f TL%n", price);
	}
}
enum Yolculuk {
	tekYön, gidişDönüş
}