package j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
/*
 Kullanicidan 100 uzerinden notunu isteyin.
 Not'u harf sistemine cevirip yazdirin.
 50’den kucukse "D",
 =50  <60 arasi "C",
 =60  <80 arasi "B",
 =80’nin uzerinde ise "A"
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 100 üzerinden almış olduğunuz notunuzu tanımlayınız");
        double a = scan.nextDouble();
/* ÇÖZÜM 1:
        if(a>=80 && a<=100){
            System.out.println(+a+" Notunuzun karşılığı A'dır. Teşekkürler :)");
        } else if (a>=60 && a<80) {
            System.out.println(+a+" Notunuzun karşılığı B'dir. Teşekkürler :)");
        } else if (a>=50 && a<60) {
            System.out.println(+a+" Notunuzun karşılığı C'dir. Teşekkürler :)");
        }else System.out.println(+a+" Notunuzun karşılığı D'dir. Teşekkürler :)");
*/
// ÇÖZÜM 2:
/*            if (a<0 || a>100){
                System.out.println("Girilen bilgi 0 - 100 arasında olmadığından mantıklı bir sonuç alamamaktasınız.");
            } else if (a<50) {//50'den küçük not alma kontrolü
                System.out.println("Girilen notun karşılığı D'dir.");
            } else if (a<60) {//60'tan küçük not alma kontrolü
                System.out.println("Girilen notun karşılığı C'dir.");
            }else if (a<80) {//80'ten küçük not alma kontrolü
                System.out.println("Girilen notun karşılığı B'dir.");
            }else {//80 ve büyük not alma kontrolü (aslında 80-100 arasında çalışır)
                System.out.println("Girilen notun karşılığı A'dir.");
            }

*/
// ÇÖZÜM 3:
        if (a < 0) {
            System.out.println("Negatif değerde not tanımlanamaz. Lütfen tekrar deneyiniz.");
        } else if (a < 50) {//50'den küçük not alma kontrolü
            System.out.println("Girilen notun karşılığı D'dir.");
        } else if (a >= 50 && a < 60) {//60'tan küçük not alma kontrolü
            System.out.println("Girilen notun karşılığı C'dir.");
        } else if (a >= 60 && a < 80) {//80'ten küçük not alma kontrolü
            System.out.println("Girilen notun karşılığı B'dir.");
        } else if (a >= 80 && a <= 100) {//80 ve büyük not alma kontrolü (aslında 80-100 arasında çalışır)
            System.out.println("Girilen notun karşılığı A'dir.");
        } else {//100'den büyük olma durumu kontrol edilir.
            System.out.println("100'den büyük değerde not tanımlanamaz. Tekrar deneyin");
        }

    }
}