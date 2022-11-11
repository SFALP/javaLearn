package Practice_.Day09_221018;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q08_ArrayList_KullaniciAdiTanimla {


    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */
        Random rand = new Random();
        int n = rand.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen bir kullanici isim belirleyiniz: ");
        String isim = sc.nextLine();
        isim = isim.trim().toLowerCase().replaceAll(" ", "");
        ArrayList<String> listIsim = new ArrayList<>(List.of("a", "b", "c"));

        if (!listIsim.contains(isim)) {
            System.out.println("Kullanici adiniz: " + isim);
        } else {
            System.out.println("Bu kullanici adi sistemimizde kayitlidir. Random olusturulan kullanici adiniz: ");
            System.out.println(isim + n);
        }
    }
}