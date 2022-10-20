package j04_Aritmatic_Operators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */
Scanner scan=new Scanner(System.in);
        System.out.println("Sayıların çarpma işleminin yapıldığı programa Hoşgeldiniz!");
        System.out.println("1.tamsayıyı giriniz: ");
        double i= scan.nextDouble();
        System.out.println("2.tamsayıyı giriniz: ");
        double j= scan.nextDouble();
        System.out.println("3.tamsayıyı giriniz: ");
        double k= scan.nextDouble();
        double s= i*j*k;
        System.out.println("Bu 3 sayının çarpımı:" +s+" . Teşekkürler :)");



    }
}
