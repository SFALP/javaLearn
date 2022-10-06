package j12_Loops.L01_ForLoop.Task;

import java.util.Scanner;

public class Task03_Faktoryel {
    public static void main(String[] args) {
/*
TASK: Girilen sayinin faktöryelini hesaplayan method create ediniz.
 */

        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen bir tamsayi tanimlayiniz: ");
        int x = sc.nextInt();

        System.out.println("Girilen sayinin faktöryel degeri: " + fakt(x));
    }

    public static int fakt(int x) {
        if (x >= 0) {
            int value = 1;
            for (int i = x; i >= 1; i--) {
                value *= i;
            }
            return value;
        } else System.out.println("Hatali bir deger tanimlandigi icin islem yapilamamaktadir. Lutfen tekrar deneyiniz");
        return 0;
    }
}
