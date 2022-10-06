package j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {
// TASK= girilen sayidan 100'e kadar 4'un kati pozitif tamsayilari print eden code create ediniz.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk pozitif bir tamsayi tanimlayiniz");
        int x = sc.nextInt();

        if ( x>=0 && x<100)
            for (int i = x; i <= 100; i++) {
                if (i % 4 == 0) {
                    System.out.print(i +" ");
                }
            }
        else System.out.println("istenen kriterlere uygun bir sayi tanimlamaniz gerekmektedir.");
    }
}