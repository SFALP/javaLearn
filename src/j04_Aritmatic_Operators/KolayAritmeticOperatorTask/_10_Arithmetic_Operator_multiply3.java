package j04_Aritmatic_Operators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _10_Arithmetic_Operator_multiply3 {

    public static void main(String[] args) {

        /* Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        Bu int'leri birbiriyle çarpın ve sonuca eşitleyin.
        int sonuc u yazdırın. */

Scanner scan=new Scanner(System.in);
        System.out.println("Sayıların çarpma işleminin yapıldığı programa Hoşgeldiniz!");
        System.out.println("1.tamsayıyı giriniz: ");
        int i= scan.nextInt();
        System.out.println("2.tamsayıyı giriniz: ");
        int j= scan.nextInt();
        System.out.println("3.tamsayıyı giriniz: ");
        int k= scan.nextInt();
        System.out.println("4.tamsayıyı giriniz: ");
        int l= scan.nextInt();

        int s= i*j*k*l;
        System.out.println("Bu 4 sayının çarpımı:" +s+" . Teşekkürler :)");


    }
}
