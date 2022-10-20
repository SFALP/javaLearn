package Practice_.Day05_221003;

import java.util.Scanner;

public class Q05_Method_Creation {
    public static void main(String[] args) {

        //Kullaniciya kac sayi toplamak istedigini sorun.
//Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdiriniz.
//Kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz, ben toplayamam" yazdiriniz.
//2'den kucuk bir sayiyi girerse "En az 2 sayi girmelisiniz" yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen toplamak istediginiz sayi adedini tanimlayiniz: ");
        int a = scan.nextInt();

        sayi(a);

    }

    public static void sayi(int a) {
        if (a < 2) {
            System.out.println("2 veya daha fazla sayi girmeniz gerekmektedir, lutfen tekrar deneyiniz");
        } else if (a == 2) {
            ikisayitopla();
        } else if (a == 3) {
            System.out.println(ucsayitopla() + "\n Tesekkurler iyi gunler :=)");
        } else if (a >= 4) {
            dortSayiTopla();
        } else
            System.out.println("Girilen bu deger tanimlanmadigi icin islem yapilamamaktadir. Simdilik 2 veya 3 sayi toplayabilirsiniz.");
    }

    public static void ikisayitopla() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Toplamak istediginiz ilk sayiyi tanimlayiniz: ");
        int x = scan.nextInt();
        System.out.println("Toplamak istediginiz ikinci sayiyi tanimlayiniz: ");
        int y = scan.nextInt();
        System.out.println("Girilen 2 sayinin toplami: " + (x + y));
        System.out.println("Tesekkurler, iyi gunler :)");
    }

    public static double ucsayitopla() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Toplamak istediginiz ilk sayiyi tanimlayiniz: ");
        double x = scan.nextDouble();
        System.out.println("Toplamak istediginiz ikinci sayiyi tanimlayiniz: ");
        double y = scan.nextDouble();
        System.out.println("Toplamak istediginiz ucuncu sayiyi tanimlayiniz: ");
        double z = scan.nextDouble();
        double sonuc = x + y + z;
        return sonuc;
    }

    public static void dortSayiTopla() {
        System.out.println("4 ve daha fazla sayiyi henuz toplayamiyorum. Anlayisiniz icin tesekkurler :)");
    }
}