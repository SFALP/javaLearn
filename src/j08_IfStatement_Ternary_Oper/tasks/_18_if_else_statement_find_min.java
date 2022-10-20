package j08_IfStatement_Ternary_Oper.tasks;

import java.util.Scanner;

public class _18_if_else_statement_find_min {

    public static void main(String[] args) {

    /*    Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
          Bu numarayı yazdırınız.
          Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

          Örn: 10-11-12 > 10  */


        Scanner scan = new Scanner(System.in);
        System.out.println("Girilen 3 sayıdan en küçüğünü bulma programına Hoşgeldiniz!");
        System.out.println("Lütfen birinci tamsayıyı tanımlayınız: ");
        int i1 = scan.nextInt();
        System.out.println("Lütfen ikinci tamsayıyı tanımlayınız: ");
        int i2 = scan.nextInt();
        System.out.println("Lütfen üçüncü tamsayıyı tanımlayınız: ");
        int i3 = scan.nextInt();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        if (i1 < i2 && i1 < i3) {
            System.out.println("En küçük sayı: " + i1);
        } else if (i2 < i1 && i2 < i3) {
            System.out.println("En küçük sayı: " + i2);
        } else
            System.out.println("En küçük sayı: " + i3);
    }
}