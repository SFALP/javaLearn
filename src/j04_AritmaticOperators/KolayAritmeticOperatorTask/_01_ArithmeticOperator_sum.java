package j04_AritmaticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         toplamını print eden code create ediniz. */
Scanner scan= new Scanner(System.in);
        System.out.println("Sayı toplama programına Hoşgeldiniz!");
        System.out.println("1.tamsayıyı giriniz: ");
        int i= scan.nextInt();
        System.out.println("2.tamsayıyı giriniz: ");
        int j= scan.nextInt();
        System.out.println("İki sayının toplamı:" +(i+j)+" . Teşekkürler :)");

    }
}
