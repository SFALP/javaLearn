package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Random;
import java.util.Scanner;
// bilgisayara 1 ile 100 arasinda bir sayi tutturun
// kullanicidan bu sayiyi tahmin etmesini isteyin
// girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
// kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

public class Task06_SayiBulmaca {

    public static void main(String[] args) {

        System.out.println("0-100 arasi sayi tahmin oyununa Hosgeldiniz!");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int myRand = r.nextInt(100);
        int i = 1;//tahmin sayisi
        int x = 0;//tahmin edilen sayi

        while (x != myRand) {
            System.out.print("\nLutfen " + i + ". tahmininizi giriniz: ");
            x = sc.nextInt();
            if (x < myRand) {
                System.out.println("Girdiğiniz " + x + " sayisi, gizli sayidan kucuktur. Lutfen tekrar deneyiniz");
            } else if (x > myRand) {
                System.out.println("Girdiginiz " + x + " sayisi, gizli sayidan BUYUKtur. Lutfen tekar deneyiniz.");

            } else System.out.println("\nTEBRIKLER! ("+myRand+") sayisini, ("+(i-1)+"). tahmininizde buldunuz :=)");
            i++;
        }
    }
}