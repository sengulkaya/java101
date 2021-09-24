/*
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
Ödev
Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
*/
package java101;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            sum += 1. / numbers[i];
        }

        System.out.printf("Harmonik Ortalama = %.2f", length / sum);

	}
}


	
	