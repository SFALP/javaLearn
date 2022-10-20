package j08_IfStatement_Ternary_Oper.tasks;

import java.util.Scanner;

public class _17_if_else_if_statement_find_max {

    public static void main(String[] args) {

      /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */

        Scanner scan = new Scanner(System.in);
        System.out.println("Girilen 3 sayıdan en büyüğünü bulma programına Hoşgeldiniz!");
        System.out.println("Lütfen birinci tamsayıyı tanımlayınız: ");
        int i1 = scan.nextInt();
        System.out.println("Lütfen ikinci tamsayıyı tanımlayınız: ");
        int i2 = scan.nextInt();
        System.out.println("Lütfen üçüncü tamsayıyı tanımlayınız: ");
        int i3 = scan.nextInt();
        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        if (i1 > i2 && i1 > i3) {
            System.out.println("En büyük sayı: " + i1);
        } else if (i2 > i1 && i2 > i3) {
            System.out.println("En büyük sayı: " + i2);
        } else
            System.out.println("En büyük sayı: " + i3);
    }
}
