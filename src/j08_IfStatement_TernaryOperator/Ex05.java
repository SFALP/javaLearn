package j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        /*
        TASK1 -->girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayıyı tanımlayınız(sıfır hariç): ");
        double sayi1 = scan.nextInt();
        System.out.println("2. sayıyı tanımlayınız(sıfır hariç): ");
        double sayi2 = scan.nextInt();
        System.out.println("Yapılmasını istediğiniz matematiksel işlemin sayısal değerini sisteme giriniz. \nToplama:1, \nÇıkarma:2, \nÇarpma:3, \nBölme:4");
        int a = scan.nextInt();
// char secim=scan.next().charAt(0) şeklinde de + - * / şeklinde çözülebilir.
        if (a == 1) {
            System.out.println("Girilen sayıların toplamı: " + (sayi1 + sayi2));
        } else if (a == 2) {
            System.out.println(+sayi1 + "-" + sayi2 + "= " + (sayi1 - sayi2));
            System.out.println(+sayi2 + "-" + sayi1 + "= " + (sayi2 - sayi1));
        } else if (a == 3) {
            System.out.println(+sayi1 + "*" + sayi2 + "= " + (sayi1 * sayi2));
        } else if (a == 4) {
            System.out.println(+sayi1 + "/" + sayi2 + "= " + (sayi1 / sayi2));
            System.out.println(+sayi2 + "/" + sayi1 + "= " + (sayi2 / sayi1));
        } else
            System.out.println("Girmiş olduğunuz matematiksel işlem tanımlı değildir. Lütfen tekrar deneyin. Teşekkürler :)");

    }
}
