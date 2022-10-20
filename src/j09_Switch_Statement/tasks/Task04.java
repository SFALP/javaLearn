package j09_Switch_Statement.tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
//		Girilen  ayın  kac cektigini print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Definizieren Sie bitte einen Monat (als die Zahl): ");
        int a = scan.nextInt();
        System.out.println(a > 0 && a < 12 ? ("Herzlich Wilkommen") : (+a + " wurde nicht definiziert, Versuchen Sie bitte nochmal"));
        switch (a) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Diesen Monat hat 31 Tagen");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Diesen Monat hat 30 Tagen");
                break;
            case 2:
                System.out.print("Definizieren Sie bitte das Jahr: ");
                int j = scan.nextInt();
                System.out.println(j % 4 == 0 ? ("Diesen Monat hat 29 Tagen") : ("Diesen Tag hat 28 Tagen"));
            default:
                System.out.println("Thschüss");
        }
    }
}