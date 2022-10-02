package j09_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {
// TASK--> Kullanıcının girdiği yılın ay sırasına göre ayın ismini print eden bir kod create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen dogdunuz ayı sayi cinsinden tanimlayiniz: ");
        int x = scan.nextInt();

        switch (x) {
            case 1:
                System.out.println("JANUAR");
                break;
            case 2:
                System.out.println("FEBRUAR");
                break;
            case 3:
                System.out.println("MÄRZ");
                break;
            case 4:
                System.out.println("APRIL");
                break;
            case 5:
                System.out.println("MAI");
                break;
            case 6:
                System.out.println("JUNI");
                break;
            case 7:
                System.out.println("JULI");
                break;
            case 8:
                System.out.println("AUGUST");
                break;
            case 9:
                System.out.println("SEPTEMBER");
                break;
            case 10:
                System.out.println("OCTOBER");
                break;
            case 11:
                System.out.println("NOVEMBER");
                break;
            case 12:
                System.out.println("DEZEMBER");
                break;
            default:
                System.out.println("Hatalı bir karakter tanımladınız. Lutfen tekrar deneyiniz");
        }
    }
}
