package j04_Aritmatic_Operators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _03_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

    /*     /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         farkını print eden code create ediniz. */
Scanner scan= new Scanner(System.in);
        System.out.println("Sayı farkını hesaplayan programa Hoşgeldiniz!");
        System.out.println("1.tamsayıyı giriniz: ");
        int i= scan.nextInt();
        System.out.println("2.tamsayıyı giriniz: ");
        int j= scan.nextInt();
        System.out.println("1.sayı - 2.Sayı:" +(i-j)+" . Teşekkürler :)");
        System.out.println("2.sayı - 1.Sayı:" +(j-i)+" . Teşekkürler :)");
        System.out.println("İki sayının farkının mutlak değeri: " +Math.abs(j-i)+" . Teşekkürler :)");


    }
}
