package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task02_IkiSayiArasindakiler {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("İki sayi arasindaki sayilarin gorulecek programa Hosgeldiniz!");
        System.out.print("Lutfen ilk tamsayiyi tanimlayiniz: ");
        int x1 = sc.nextInt();
        System.out.print("Lutfen ikinci tamsayiyi tanimlayiniz: ");
        int x2 = sc.nextInt();

        if (x1 < x2 || x2 < x1) {
            if (x1 < x2) {
                System.out.println("Tanimlanan 1.sayi (" + x1 + ") sayisi ile 2.sayi (" + x2 + ") arasindaki tamsayilar: ");
                for (int i = x1; i < x2; i++) {
                    System.out.print(+i + " ");
                }

            } else {
                System.out.println("Tanimlanan 1.sayi (" + x1 + ") sayisi ile 2.sayi (" + x2 + ") arasindaki tamsayilar: ");
                for (int i = x1; i > x2; i--) {
                    System.out.print(+i + " ");
                }
            }
        } else System.out.println("Esit iki deger tanimlanmistir, Bu iki deger arasinda tamsayi bulunmamaktadir.");
    }
}