/*
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.



Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
*/
package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		 Scanner kb = new Scanner(System.in);
		 System.out.println("Lütfen bir sayı giriniz : ");
		 int n = Integer.parseInt(kb.nextLine());
		 int pop = 0;
		 int reversed = 0;
		 int temp = n;
		 while (temp > reversed) {
			 pop = temp % 10;
			 reversed = 10 * reversed + pop;
			 temp /= 10; 
		 }
		 if (n < 10) {
			 System.out.printf("%d is NOT a Palindrom", n);
			 return;
		 }
		 if (n % 10 == 0) {
			 System.out.printf("%d is NOT a Palindrom", n); 
			 return;
		 }
			 
			 
		 if (reversed == temp) {
			 System.out.printf("%d is a Palindrom", n);
		 } else if ((temp * 10 + pop) == reversed) {
			 System.out.printf("%d is a Palindrom", n);
		 }
		 else {
			 System.out.printf("%d is NOT a Palindrom", n);
		 }
			
		 
		
	}
}


	
	