package j16_ArrayList.Task_20221015;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task12_Manav {


    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
        System.out.println("JavaManav'a Hosgeldiniz!");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listManav = new ArrayList<>(List.of("\n(0) Elma (1 €/kg)", "\n(1) Portakal (2€/kg)",
                " \n(2) Muz (3€/kg) ", "\n(3) Ayva (4€/kg) ", "\n(4) Mandalina (5€/kg)"));
        ArrayList<Integer> listFiyat = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        double sepet = 0;
        char sec;
        do {
            System.out.println("listManav = " + listManav);
            System.out.println("Ne vereyim abime/ablama :)");
            int meyveSec = sc.nextInt();

            System.out.print("Meyveden kac kg aldiginizi tanimlayiniz: ");
            double kg = sc.nextDouble();
            sepet += kg * listFiyat.get(meyveSec);
            System.out.print("Baska bir talebiniz var midir: (E/H) ");
            sec = sc.next().toLowerCase().charAt(0);
        } while (sec != 'h');
        System.out.println("Toplam (" + (sepet * 1.2) + ")€ ama sana zamsiz fiyatta veriyorum, (" + sepet + ")€ yeter :)");
        System.out.println("Afiyet olsun :)");
        System.out.println("Geeel vatandas geeeeelll!, JavaManav'da OZEL INDIRIM'e geeeelll!");
    }
}