/*
 * Koşullar :
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
*/
 
package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int heat;
		
		System.out.println("Sıcaklık değerini giriniz : ");
		heat = Integer.parseInt(kb.nextLine());
		
		if (heat < 5)
			System.out.println("Kayak yapabilirsiniz");
		else if (heat < 15)
			System.out.println("Sinemaya gidebilirsiniz");
	
		else if (heat < 25) 
			System.out.println("Piknik yapabilirsiniz");
		else 
			System.out.println("Yüzebilirsiniz");
		
			
		
}
}