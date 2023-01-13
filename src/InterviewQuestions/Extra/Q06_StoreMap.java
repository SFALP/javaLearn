package InterviewQuestions.Extra;

import java.util.HashMap;
import java.util.Scanner;

public class Q06_StoreMap {
    /* 1- Kullanıcıdan bir kişinin kimlik numarsını(4 haneli), tam ismini, adresini , telefonunu alın.
   2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
   3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
   4- Tüm kullanicilarin isimlerini ekrana yazdıralım
*/
    public static void main(String[] args) {
        String secim = "";

        HashMap<Integer, HashMap<String, String>> kisiListesi = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        do {
            HashMap<String, String> kisiBilgileri = new HashMap<>();
            System.out.print("Lutfen isim-soyisim giriniz: ");
            kisiBilgileri.put("isim", sc.nextLine());
            sc.nextLine();//dummy niyetiyle olusturuldu. Dongunun saglikli ilerlemesi icin olusturuldu

            System.out.print("Lutfen adres giriniz: ");
            kisiBilgileri.put("Adres", sc.nextLine());

            System.out.print("Lutfen telefon numarasi giriniz: ");
            kisiBilgileri.put("Telefon", sc.nextLine());

            System.out.print("4 haneli bir kimlik no giriniz: ");
            kisiListesi.put(sc.nextInt(), kisiBilgileri);

            System.out.println("kisiBilgileri = " + kisiBilgileri);
            System.out.println("kisiListesi = " + kisiListesi);

            System.out.println("\nDevam etmek istiyor musunuz?(E/H): ");
            secim = sc.next();

        } while (secim.equalsIgnoreCase("E"));

        System.out.print("Goruntulemek istediginiz kisinin kimlik no'sunu giriniz: ");
        System.out.println(kisiListesi.get(sc.nextInt()));
    }
}
