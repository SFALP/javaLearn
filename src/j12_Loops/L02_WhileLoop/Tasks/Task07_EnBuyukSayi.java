package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task07_EnBuyukSayi {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz
        Scanner oku = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int i = 1;
        while (i <= 5) {
            System.out.print("Lutfen (" + i + "). sayiyi tanimlayiniz: ");
            int a = oku.nextInt();
            if (a > max) {
                max = a;
            }i++;
        }System.out.println("Girilen sayinin en buyugu: " + max);
    }
}