package j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOperator {
    public static void main(String[] args) {
        /*
 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
       %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
 */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen ürün miktarının adedini tanımlayiniz: ");
        double x=scan.nextDouble();
        System.out.print("Lütfen ürünün birim fiyatını tanımlayiniz: ");
        double y=scan.nextDouble();
        System.out.println("Ödemeniz gereken tutar: ");
        System.out.println(x>100 ? (x*y*0.67) :(x*y));

    }
}
