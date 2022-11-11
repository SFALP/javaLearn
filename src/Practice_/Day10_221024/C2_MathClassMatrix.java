package Practice_.Day10_221024;

import java.util.Random;
import java.util.Scanner;

/*
Ask user to enter a number and print on console number by number matrix.

Example:
Input: 10

Output:
1 0 0 1 1 0 0 0 1 1
0 0 1 0 1 0 1 0 0 0
0 1 0 1 0 0 0 0 0 1
1 1 1 0 0 0 0 1 1 1
1 1 0 1 1 1 0 1 0 0
1 0 0 0 1 1 0 0 0 0
0 0 1 0 0 0 0 1 1 1
1 1 0 1 0 1 0 0 1 0
0 0 1 0 0 0 0 1 1 0
1 1 1 0 0 1 1 1 1 0

*/
public class C2_MathClassMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Matrisin boyutunu tanimlayiniz: ");
        int sayi = sc.nextInt();

        Random random = new Random();
        for (int i = 0; i < sayi; i++) {
            for (int j = 0; j < sayi; j++) {
//                System.out.print((int) (Math.random()*2)+" ");// 1. YOL
                System.out.print(random.nextInt(2) + " ");//2. YOL(RandomClass ile)
            }
            System.out.println();
        }
    }
}
