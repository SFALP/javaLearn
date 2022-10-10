package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task11_SifirHaricTopla {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int say = 1;
        int sum = 0;

        System.out.println("Hosgeldiniz! Oncelikle tamsayi belirlemeniz gerekmektedir. \nProgramı sonlandirmak icin 0'ı tuslamaniz yeterlidir :) ");
        while (a != 0) {
            System.out.print("Suan (" + say + "). sayinizi tanimliyorsunuz: ");
            a = sc.nextInt();
            say++;
            sum += a;
        }
        System.out.println("Tanimladiginiz (" + (say - 1) + ") adet degerin toplami: " + sum);
        System.out.println("0 sayisi girdiginiz icin isleminiz sonlandirildi. Tesekkurler :=)");
    }
}