package j12_Loops.HaftaninTaskiii_20221010;

import java.util.Scanner;

public class T05_0aKadarSayiTopla {

    public static void main(String[] args) {
        /*
         * Kullanıcıya sayı girmesini söyleyin. Kullanıcı sıfır girdiğinde,
         * ekrana o ana kadar girmiş olduğu
         * tüm sayıların toplamını yazdırınız.
         * Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdırın
         */

        Scanner scan = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int x = 0;
        System.out.println("Girilen sayilarin adedi ve toplamini bulan programa Hosgeldiniz!");


        do {
            System.out.println("Lutfen (" + (num + 1 + "). sayiyi tanimlayiniz: "));
            x = scan.nextInt();
            sum += x;
            num++;
        } while (x != 0);
        System.out.println("Girdiginiz (" + num + ") sayinin toplami: " + sum);
        System.out.println("Tesekkurler :)");
    }
}