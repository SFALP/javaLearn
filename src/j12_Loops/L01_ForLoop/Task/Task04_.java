package j12_Loops.L01_ForLoop.Task;

import java.util.Scanner;

public class Task04_ {
    public static void main(String[] args) {
/*
Girilen iki sayi arasindaki cift sayilari print eden cod create ediniz
 */

        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen ilk tamsayiyi tanimlayiniz: ");
        int x = sc.nextInt();
        System.out.print("Lutfen ikinci tamsayiyi tanimlayiniz: ");
        int y = sc.nextInt();

        if (x < y) {
            for (int i = x; i <= y; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else System.out.print("");
            }
        } else if (y < x) {
            for (int i = y; i <= x; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else System.out.print("");
            }
        } else System.out.println("Girilen sayilar esittir, bu nedenle baska sayi bulunmamaktadir");
    }
}