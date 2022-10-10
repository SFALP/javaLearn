package j12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {

// TASK: Girilen tamsayinin tam bolen sayisini print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen bir tamsayi tanimlayiniz: ");
        int x1 = sc.nextInt();

        int bolenSayi = 1;
        int tamBolenAdedi = 0;

        while (bolenSayi <= x1) {
            if (x1 % bolenSayi == 0) {//a sayisinin bolen sayiya tam bolunmesi sartidir.
                tamBolenAdedi++;
            }
            bolenSayi++;//loop sonsuza dusmemesi icin ve diger sayilarin boldugu kontrol edilmesi icin yazildi.
        }
        System.out.println(x1 + " sayisinin (" + tamBolenAdedi + ") adet tam boleni bulunmaktadir.");
    }

}