package j10_String_Manipulations.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
   Girilen passwordun aşagıdakişartları sağlamasını kontrol eden coden create ediniz
    a)Ilk karakteri buyuk harf olmalı
    b)Son karakteri sayi olamlı
    c)en az 6 karakter uzunlugunda olmalı
IF - charAt(0) - toUpperCase - charAt(str.lengt-1)>='0' && <'10' - str.lengt>5 yapıları kullanılmalıdır.
 */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sifre olusturunuz: ");
        String p = scan.nextLine();

        if ((p.charAt(0) >= 'A' && p.charAt(0) <= 'Z') && (p.charAt(p.length() - 1) >= '0' && p.charAt(p.length() - 1) <= '9')
                && (p.length() > 5)) {
// İlk kriter büyük harf olmasını sağlar.
            // 2.kriter, son karakterin sayi olmasını saglar.
            // 3.kriter, sifrenin 6 karakterden fazla olmasini saglar.
            System.out.println("Sifreniz kabul edilmistir.");
        } else
            System.out.println("Sifreniz kriterlere uymamaktadir. Lutfen tekrar deneyiniz");
    }
}