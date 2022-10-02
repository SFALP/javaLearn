package j04_AritmaticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _09_ArithmeticOperator_multiply2 {

    public static void main(String[] args) {

    /*    Oluşturulmuş olan double'lar hakkında,
        Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        Double sonucu yazdırın.   */
Scanner scan=new Scanner(System.in);
        System.out.println("Sayıların çarpma işleminin yapıldığı programa Hoşgeldiniz!");
        System.out.println("1.tamsayıyı giriniz: ");
        double i= scan.nextDouble();
        System.out.println("2.tamsayıyı giriniz: ");
        double j= scan.nextDouble();
        System.out.println("3.tamsayıyı giriniz: ");
        double k= scan.nextDouble();
        System.out.println("4.tamsayıyı giriniz: ");
        double l= scan.nextDouble();

        double s= i*j*k*l;
        System.out.println("Bu 4 sayının çarpımı:" +s+" . Teşekkürler :)");


    }
}
