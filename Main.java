/*
 * Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
 * Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
 * Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
 * N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16 
 *   Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
*/

package java101;
import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
        System.out.print("N Sayısı :");
        int N = Integer.parseInt(kb.nextLine());
        
        System.out.println("Çıktısı : ");
        int num =  N;
        recursiveDeseneGöreMetotOluşturma(N, num);
        
        
	}
	static void recursiveDeseneGöreMetotOluşturma(int N, int num) 
	{
		if (N == num) {
			recursiveDeseneGöreMetotOluşturmaSubtract(N, num);
		}
		
	}
	static void recursiveDeseneGöreMetotOluşturmaSubtract(int N, int num) 
	{
		System.out.printf("%d ", num);
		if (num > 0)
			num -= 5;
		else {
			recursiveDeseneGöreMetotOluşturmaAdd(N, num);
			return;
		}
		recursiveDeseneGöreMetotOluşturmaSubtract(N, num);
		
	}
	static void recursiveDeseneGöreMetotOluşturmaAdd(int N, int num) 
	{
		if (num == N) {
			System.out.printf("%d ", num);
			return;
		} else {
			System.out.printf("%d ", num);
			num += 5;
			recursiveDeseneGöreMetotOluşturmaAdd(N, num);
		}
			
			
			
		
	} 
}