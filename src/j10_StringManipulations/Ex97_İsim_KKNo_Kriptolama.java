package j10_StringManipulations;

import java.util.Scanner;

public class Ex97_İsim_KKNo_Kriptolama {
    public static void main(String[] args) {
// TASK 2: Girilen ismini(2 veya daha fazla), soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki formatta
// print eden code create ediniz.
// isim-soyisim : M***** B*******
// kart no : **** **** **** 1234

        Scanner scan = new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihren Vornamen an: ");
        String a = scan.nextLine().trim().toUpperCase();
        System.out.print("Bitte geben Sie Ihren Nachnamen an: ");
        String b = scan.nextLine().trim().toUpperCase();
        System.out.print("Bitte geben Sie Ihren Kartnummer (mit 16 Ziffern): ");
        String c = scan.nextLine().trim();

        int x = a.indexOf(" ");
        if (x > 0) {
            System.out.println("Vor&Nach Name: " + a.trim().charAt(0) + a.trim().substring(1, x).replaceAll("\\S", "*") + " " +
                    a.trim().charAt(x + 1) + a.trim().substring(x + 2).replaceAll("\\S", "*") +
                    " " + b.charAt(0) + b.substring(1).replaceAll("\\S", "*"));
            if (c.length() == 16) {
                System.out.println("Die Kartnummer ist: " + c.substring(0, c.length() - 5).replaceAll("\\w", "*") + c.substring(c.length() - 4));
            } else
                System.out.println("Sie sollen mit 16 Ziffern angeben. Versuchen Sie bitte erneut");
        } else {
            System.out.println("Vor&Nachname: " + a.charAt(0) + a.substring(1).replaceAll("\\S", "*") +
                    " " + b.charAt(0) + b.substring(1).replaceAll("\\S", "*"));
            if (c.length() == 16) {
                System.out.println("Die Kartnummer ist: " + c.substring(0, c.length() - 5).replaceAll("\\w", "*") + c.substring(c.length() - 4));
            } else
                System.out.println("Sie sollen mit 16 Ziffern angeben. Versuchen Sie bitte erneut");
            System.out.println("Die Kartnummer ist: " + c.substring(0, c.length() - 5).replaceAll("\\w", "*") + c.substring(c.length() - 4));
// PS: İki isim arasında birden fazla boşluk bırakılması veya hatalı karakter yazılması durumunda hata çıkabilir.
        }
    }
}


