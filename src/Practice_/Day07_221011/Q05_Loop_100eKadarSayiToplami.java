package Practice_.Day07_221011;
/* Kullanicidan sayilar girmesini isteyin
 * ve girdigi sayilari toplayip yazdirin.
 * yeni sayi isteyin
 * girilen sayilarin toplami 100 'u gecerse
 * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
 *
 */

import java.util.Scanner;

public class Q05_Loop_100eKadarSayiToplami {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int toplam=0;
        int adet=0;

        while (toplam<=100){
            System.out.print("Lutfen ("+(adet+1)+"). sayininiz tanimlayiniz: ");
            int x=sc.nextInt();
            toplam+=x;
            adet++;
        }
        System.out.println("Toplam ("+adet+") tane sayi girdiniz ve bu sayilarin toplami: "+toplam);
    }
}
