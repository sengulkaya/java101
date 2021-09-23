/*
Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
 */

package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.print("n değerini giriniz : ");
        int n = Integer.parseInt(kb.nextLine());
        char ch = '*';
        int numOfBlanks = 0;
        for (int i = 1; i <= n; i += 2) {
        	numOfBlanks = (n - i) / 2;
        	for (int j = 0; j < numOfBlanks; j++) {// fillBlank method
        		System.out.print(' ');
        	}
        	for (int j = 0; j < i; j++)
        		System.out.print(ch);
        	
        	for (int j = 0; j < numOfBlanks; j++) {// fillBlank method
        		System.out.print(' ');
        	}
        	System.out.println();
        }
        
        for (int i = n - 2; i > 0; i -= 2) {
        	numOfBlanks = (n - i) / 2;
        	for (int j = 0; j < numOfBlanks; j++) {
        		System.out.print(' ');
        	}
        	for (int j = 0; j < i; j++)
        		System.out.print(ch);
        	
        	for (int j = 0; j < numOfBlanks; j++) {
        		System.out.print(' ');
        	}
        	System.out.println();
        }
  
        
        

	}
}


	
	