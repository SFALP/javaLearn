package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task01_Top333KadarIslemYap {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */

Scanner sc=new Scanner(System.in);
        int toplam=0;
int i=1;
        while (toplam<333) {
            System.out.println("Lutfen sayı ("+i+") icin bir deger tanimlayiniz");
            int a = sc.nextInt();
            toplam += a;
            i++;
        }
        System.out.println("Girilen sayi adedi (" +(i-1)+") ve sayilarin toplamı: "+toplam);
    }
}
