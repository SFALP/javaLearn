package Practice_Day06_221010;

/* Kullanicidan iki sayi isteyin.
 Girilen sayilar ve aralarindaki tum
 tamsayilari toplayip, sonucu yazdiran bir program yaziniz
*/

import java.util.Scanner;

public class Q08_ForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ilk tamsayiyi tanimlayiniz: ");
        int a = sc.nextInt();
        System.out.print("Ikinci tamsayiyi tanimlayiniz: ");
        int b = sc.nextInt();
        int top1 = 0;
        int top2 = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                top1 += i;

            }
            System.out.println("Girlen sayilarin toplami: " + top1);
        } else if (b < a) {
            for (int i = b; i <= a; i++) {
                top2 += i;

            }
            System.out.println("Girlen sayilarin toplami: " + top2);
        } else System.out.println("Bu iki sayi esittir. Toplami:  " + (a + b));
    }
}