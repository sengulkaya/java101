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
		String userName, password, choice;
		
		System.out.println("Username ? : ");
		userName = kb.nextLine();
		
		System.out.println("Password ? : ");
		password = kb.nextLine();
		
		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giriş başarılı!");
			return;
		} else {
			if (userName.equals("patika")) {
				System.out.println("Şifrenizi yanlış girdiniz!");
				System.out.println("Şifrenizi sıfırlamak ister misiniz?");
				System.out.println("Lütfen Yes ya da No ile cevanızı iletin : ");
				choice = kb.nextLine();
				while (choice.equals("Yes")) {
					System.out.println("Yeni şifrenizi giriniz?");
					String newPassword = kb.nextLine();
					if (newPassword.equals(password) || newPassword.equals("java123")) {
						System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
					} else {
						password = newPassword;
						System.out.println("Şifre oluşturuldu");
						return;
					}
					
				}
				
				
			} else if (password.equals("java123"))
				System.out.println("Yanlış username ile giriş yapmaya çalışıyorsunuz!");
			 else
				System.out.println("Hem username hem de şifre yanlış!");
		
		}
		System.out.println("Giriş başarısız...");
	}

}