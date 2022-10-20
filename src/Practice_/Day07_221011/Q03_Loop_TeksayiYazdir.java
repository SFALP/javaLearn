package Practice_.Day07_221011;

/*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
   */

import java.util.Scanner;

public class Q03_Loop_TeksayiYazdir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen bir tamsayi tanimlayiniz: ");
        int x = sc.nextInt();

        int a = 0;
        if (x > 0) {
            for (int i = 0; i <= x; i++) {
                if (i % 2 == 1) {
                    System.out.println(i + " ");
                    a++;
                }
            }
            System.out.println("Sayi adedi: " + a);
        } else if (x < 0) {
            for (int i = x; i <= 0; i++) {
                if (i % 2 == 1) {
                    System.out.println(i + " ");
                }
                a++;
            }
            System.out.println("Sayi adedi: " + a);

        } else System.out.println("0 girdiginiz icin arada bir sayi bulunmamaktadir.");
    }
}
/* HOCA COZUMU
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sayi giriniz :");
        int sayi = scanner.nextInt();
        int count = 0;//sayac tek olan sayilari sayan degisken
        while(sayi>0){
            if(sayi%2==1){
                System.out.print(sayi + " ");
                    count++;
            }
            sayi--;
        }
        System.out.println();
        System.out.println("count = " + count);
    }
}

 */