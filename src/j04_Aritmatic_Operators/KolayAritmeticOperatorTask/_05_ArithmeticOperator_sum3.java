package j04_Aritmatic_Operators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _05_ArithmeticOperator_sum3 {

    public static void main(String[] args) {

          /*    kullanıcıdan alınan 3 tane int
         toplamını print eden code create ediniz. */
Scanner scan=new Scanner(System.in);
        System.out.println("Sayı toplama programına Hoşgeldiniz!");
        System.out.println("1.tamsayıyı giriniz: ");
        int i= scan.nextInt();
        System.out.println("2.tamsayıyı giriniz: ");
        int j= scan.nextInt();
        System.out.println("3.tamsayıyı giriniz: ");
        int k= scan.nextInt();
        System.out.println("Girilen 3 sayının toplamı:" +(i+j+k)+" . Teşekkürler :)");

    }
}
