package Practice_.Day07_221011;

import java.util.Scanner;

/*  Problem Tanımı
   Girilen bir sayı kadar satır ve sütünu olan ve
   sağ kenara dayalı üçgeni basan kodu yazınız.

   Ekran Çıktısı
   Bir sayi giriniz: 5
          *
         **
        ***
       ****
      *****

*/
public class Q04_Loop_YildizYazdir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen bir tamsayi tanimlayiniz: ");
        int a = sc.nextInt();
        for (int satir = 1; satir <= a; satir++) {//satir kontrolü
            for (int bosluk = a - satir; bosluk >= 0; bosluk--) {//bosluk kontrolu
                System.out.print(" ");
            }
            for (int sutun = 1; sutun <= satir; sutun++) {//sutun kontrolu, yildiz yazdirir
                System.out.print("*");
            }
            System.out.println();
        }

        for (int satir = 1; satir <= a; satir++) {
            for (int sutun = 1; sutun <= satir; sutun++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
