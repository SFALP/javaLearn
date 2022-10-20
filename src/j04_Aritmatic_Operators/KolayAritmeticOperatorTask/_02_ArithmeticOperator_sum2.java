package j04_Aritmatic_Operators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

     /*     /*    kullanıcıdan alınan 4 tane int
         toplamını print eden code create ediniz. */
Scanner scan= new Scanner(System.in);
        System.out.println("Sayı toplama programına Hoşgeldiniz!");
        System.out.println("1.tamsayıyı giriniz: ");
        int i= scan.nextInt();
        System.out.println("2.tamsayıyı giriniz: ");
        int j= scan.nextInt();
        System.out.println("3.tamsayıyı giriniz: ");
        int k= scan.nextInt();
        System.out.println("4.tamsayıyı giriniz: ");
        int l= scan.nextInt();

        System.out.println("Girilen 4 tamsayının toplamı:" +(i+j+k+l)+" . Teşekkürler :)");


    }
}
