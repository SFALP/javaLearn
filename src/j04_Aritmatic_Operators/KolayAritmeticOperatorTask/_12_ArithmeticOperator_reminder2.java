package j04_Aritmatic_Operators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _12_ArithmeticOperator_reminder2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında (num1 ve num2),
            num1'in num2'ye bölümünden kalanı int sonuc'a eşitleyiniz.
            int sonuc'u yazdırınız.  */

        Scanner scan=new Scanner(System.in);
        System.out.println("Tamsayıların modunun alınması işleminin yapıldığı programa Hoşgeldiniz!");
        System.out.println("1.tamsayıyı giriniz: ");
        int i= scan.nextInt();
        System.out.println("2.tamsayıyı giriniz: ");
        int j= scan.nextInt();
        int s=i%j;

        System.out.println("1.tamsayının 2.tamsayıya göre modu: "+s+".Teşekkürler :)");



    }
}
