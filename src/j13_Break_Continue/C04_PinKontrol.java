package j13_Break_Continue;

import java.util.Scanner;

public class C04_PinKontrol {
    // TASK: String data type bir pin datasinin 3 giris hakkini kontrol eden bir code create ediniz.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int girisHakki = 3;
        String dogruPin = "JavaCAN";

        while (true) {
            System.out.println("Pin kodunuzu tanimlayiniz: ");
            String pin = sc.nextLine();
            if (pin.equals(dogruPin)) {
                System.out.println("Dogru pini buldunuz. Sonuc basarili :=)");
                break;
            } else {
                System.out.println("Yanlis sifre, tekrar deneyiniz.");
                girisHakki--;
                System.out.println("kalan deneme hakkiniz: "+girisHakki);
            }
            if (girisHakki == 0) {
                System.out.println("Hakkiniz bitti , islem yapilamamaktadir. :(");
                break;
            }
        }
    }
}