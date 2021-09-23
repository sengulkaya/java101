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
		
		System.out.println("Sayı giriniz : ");
		int num = Integer.parseInt(kb.nextLine());
		int i = 0;
		int sum = 0;
		int count = 0;
		for (;;) {
			if ((i % 3 == 0) && (i % 4 == 0)) {
				sum += i;
				count++;
			}
				
			
			if (i == num)
				break;
			
			i++;
			}
		System.out.printf("Average : %.2f%n", sum / (double)count);

	}
}
	
	