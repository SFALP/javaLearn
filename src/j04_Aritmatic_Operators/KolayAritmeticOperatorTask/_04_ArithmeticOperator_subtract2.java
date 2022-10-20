package j04_Aritmatic_Operators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _04_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */
Scanner scan=new Scanner(System.in);
        System.out.println("Sayıların farkını hesaplayan programa Hoşgeldiniz!");
        System.out.println("1.tamsayıyı giriniz: ");
        int i= scan.nextInt();
        System.out.println("2.tamsayıyı giriniz: ");
        int j= scan.nextInt();
        System.out.println("3.tamsayıyı giriniz: ");
        int k= scan.nextInt();
        System.out.println("4.tamsayıyı giriniz: ");
        int l= scan.nextInt();
        System.out.println("Bu 4 sayının farkı: (1.sayı - (2.Sayı+3.Sayı+4.Sayı)):" +(i-j-k-l)+" . Teşekkürler :)");

    }
}
