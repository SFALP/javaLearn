package j04_AritmaticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _06_ArithmeticOperator_division1 {

    public static void main(String[] args) {

        /*    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         bölümünü print eden code create ediniz. */
Scanner scan=new Scanner(System.in);
        System.out.println("Sayıların bölme işleminin yapıldığı programa Hoşgeldiniz!");
        System.out.println("1.tamsayıyı giriniz(Sıfır hariç): ");
        int i= scan.nextInt();
        System.out.println("2.tamsayıyı giriniz(Sıfır hariç): ");
        int j= scan.nextInt();
        System.out.println("1.Sayı/2.Sayı:" +(i/j)+" . Teşekkürler :)");
        System.out.println("2.Sayı/1.Sayı:" +(j/i)+" . Teşekkürler :)");


    }
}
