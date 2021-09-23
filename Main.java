/*
 Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. 
 Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.
 artık yıllar 4 rakamının katı olan yıllardır:
 100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
 if (year is not divisible by 4) then (it is a common year)
else if (year is not divisible by 100) then (it is a leap year)
else if (year is not divisible by 400) then (it is a common year)
else (it is a leap year)
 */
package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		for (;;) {
			System.out.println("Yıl Giriniz : ");
			int year = Integer.parseInt(kb.nextLine());
			
			if (year <= 0)
				break;
			
			if (year % 4 != 0) 
				System.out.printf("%d bir artık yıl değildir !", year);
			else if (year % 100 == 0) {
				if (year % 400 == 0)
					System.out.printf("%d bir artık yıldır !", year);
				else
					System.out.printf("%d bir artık yıl değildir !", year);
			} else {
				System.out.printf("%d bir artık yıldır !", year);
			}
			System.out.println();
		
	}

}
}
	
	