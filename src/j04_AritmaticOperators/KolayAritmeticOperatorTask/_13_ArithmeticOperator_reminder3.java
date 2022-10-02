package j04_AritmaticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _13_ArithmeticOperator_reminder3 {

    public static void main(String[] args) {

        /* Verilen iki int hakkında,
            num1'in num2'ye bölümünden kalanı yazdırınız.  */
        Scanner scan=new Scanner(System.in);
        System.out.println("Tamsayıların modunun alınması işleminin yapıldığı programa Hoşgeldiniz!");
        System.out.println("1.tamsayıyı giriniz: ");
        int i= scan.nextInt();
        System.out.println("2.tamsayıyı giriniz: ");
        int j= scan.nextInt();

        System.out.println("1.tamsayının 2.tamsayıya bölümünden kalan: "+(i/j)+".Teşekkürler :)");

    }
}
