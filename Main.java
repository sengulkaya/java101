/*
 * Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
 *  eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
 *   unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , 
 *   şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
 *    sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 * ;
 */
package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int math, physics, turkish, chem, music;
		int total = 0;
		int count = 0;
		
		
		System.out.print("Your math grade?");
		math = Integer.parseInt(kb.nextLine());
		if (math > 0 && math < 100) {
			total += math;
			count++;
		}
		
		
		System.out.print("Your physics grade?");
		physics = Integer.parseInt(kb.nextLine());
		if (physics > 0 && physics < 100) {
			total += physics;
			count++;
		}
		
		
		System.out.print("Your chem grade?");
		chem = Integer.parseInt(kb.nextLine());
		if (chem > 0 && chem < 100) {
			total += chem;
			count++;
		}
		
		
		System.out.print("Your turkish grade?");
		turkish = Integer.parseInt(kb.nextLine());
		if (turkish > 0 && turkish < 100) {
			total += turkish;
			count++;
		}
		
		
		
		System.out.print("Your music grade?");
		music = Integer.parseInt(kb.nextLine());
		if (music > 0 && music < 100) {
			total += music;
			count++;
		}
		

		double average = total / (double)count;
		if (average <= 55.) {
			System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere.");
		} else {
			System.out.println("Tebrikler, sınıf geçtiniz.");
		}
		System.out.printf("Ortalamanız : %.2f", average);
	}

}