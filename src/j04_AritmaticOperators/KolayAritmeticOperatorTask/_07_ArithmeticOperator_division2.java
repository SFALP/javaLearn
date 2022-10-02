package j04_AritmaticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _07_ArithmeticOperator_division2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında, (num1, num2),
            num1'i num2'ye bölün ve sonucu int sonuc'a eşitleyin.
            int sonucu yazdırın. */
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayıların bölme işleminin yapıldığı programa Hoşgeldiniz!");
        System.out.println("1.tamsayıyı giriniz(Sıfır hariç): ");
        int i= scan.nextInt();
        System.out.println("2.tamsayıyı giriniz(Sıfır hariç): ");
        int j= scan.nextInt();
        System.out.println("1.Sayı/2.Sayı:" +(i/j)+" . Teşekkürler :)");




    }
}
