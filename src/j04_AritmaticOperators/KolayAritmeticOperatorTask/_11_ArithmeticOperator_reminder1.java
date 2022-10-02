package j04_AritmaticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _11_ArithmeticOperator_reminder1 {

    public static void main(String[] args) {

        /*  Verilen int ler hakkında (num1, num2),
            num1 'in   num2'ye bölümünden kalanı, int sonuc'a  eşitleyin.
            int sonucu yazdırın.  */
Scanner scan=new Scanner(System.in);
        System.out.println("Tamsayıların modunun alınması işleminin yapıldığı programa Hoşgeldiniz!");
        System.out.println("1.tamsayıyı giriniz: ");
        int i= scan.nextInt();
        System.out.println("2.tamsayıyı giriniz: ");
        int j= scan.nextInt();
        int s=i%j;
        int r=j%i;

        System.out.println("1.tamsayının 2.tamsayıya göre modu: "+s+".Teşekkürler :)");
        System.out.println("2.tamsayının 1.tamsayıya göre modu: "+r+".Teşekkürler :)");//Bu bilgi extra düzenlenmiştir.

    }
}
