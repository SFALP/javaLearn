package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.
        Scanner sc = new Scanner(System.in);
        System.out.print("Die Zahl = ");
        int sayi = sc.nextInt();
        int x = (sayi / 10) % 10;
        System.out.println("x = " + x);
        switch (x) {
            case 0:
                System.out.println("NULL");
                break;
            case 1:
                System.out.println("EIN");
                break;
            case 2:
                System.out.println("ZWEI");
                break;
            case 3:
                System.out.println("DREI");
                break;
            case 4:
                System.out.println("VIER");
                break;
            case 5:
                System.out.println("FÜNF");
                break;
            case 6:
                System.out.println("SECHS");
                break;
            case 7:
                System.out.println("SIEBEN");
                break;
            case 8:
                System.out.println("ACHT");
                break;
            case 9:
                System.out.println("NEUN");
                break;
            default:
                System.out.println("Teşekkürler");
        }
    }
}