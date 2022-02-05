package app;
    /*
    Ödev - Desene Göre Metot Oluşturma
    Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

    Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
     Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
     Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
     */

public class App {
    public static void main(String[] args) {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("n: ");
        int n = Integer.parseInt(kb.nextLine());
        System.out.println("We will increase n by m. m: ");
        int m = Integer.parseInt(kb.nextLine());
        int num = n;
        recursivelyDecrease(n, num, m);
    }
    public static void recursivelyDecrease(int n, int num, int m)
    {
        if (num <= 0)
        {
            recursivelyIncrease(n, num, m);
            return;
        }

        System.out.printf("%d ", num);
        num -= m;
        recursivelyDecrease(n, num, m);
    }
    public static void recursivelyIncrease(int n, int num, int m)
    {
        if (num == n)
        {
            System.out.printf("%d ", num);
            return;
        }

        System.out.printf("%d ", num);
        num += m;
        recursivelyIncrease(n, num, m);
    }
}
