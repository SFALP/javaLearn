package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task10_TekSayiYaz {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen bir sayi tanimlayiniz: ");
        int s1 = sc.nextInt();

        int i = 0;

        if (s1 > 0) {
            System.out.println(i + " sayisiyla, girilen (" + s1 + ") sayisi arasindaki tek sayilar: ");
            while (i <= s1) {
                if (i % 2 == 1) {
                    System.out.print(i + " ");
                }
                i++;
            }
        } else if (s1 < 0) {
            System.out.println(i + " sayisiyla, girilen (" + s1 + ") sayisi arasindaki tek sayilar: ");
            while (i > s1) {
                if (i % 2 == 0) {
                    System.out.print((i - 1) + " ");
                }
                i--;
            }
        } else
            System.out.println("Girilen sayi ile 0 sayisi esit oldugundan bu iki sayi arasinda herhangi bir deger bulunmamaktadir.");
    }
}