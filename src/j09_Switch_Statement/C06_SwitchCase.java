package j09_Switch_Statement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
// TASK -> Girilen haftanın gününü hafta içi veya sonu olduğunu print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Günlerin hafta içi veya sonu kontrolü programına Hoşgeldiniz!");
        System.out.print("Haftanın günlerinden bir tanesini yazınız: ");
        String a = scan.nextLine().toLowerCase();

        switch (a) {
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("Girdiğiniz gün hafta içi olarak kabul edilmektedir.");
                break;

            case "cumartesi":
            case "pazar":
                System.out.println("Girdiğiniz gün hafta sonu olarak kabul edilmektedir.");
                break;
            default:// tanımlanamayan durumlarda aşağıdaki ifadeler yazılır.
                System.out.println("Girilen ifade tanımlanmadığı için sonuç alınamamaktadir. Lütfen tekrar deneyiniz.");
                System.out.println("Günü tanımlarken lütfen kısaltma kullanmayınız.");
                break;
        }
    }
}