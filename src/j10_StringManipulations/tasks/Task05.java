package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /* Task->
Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi tanimlayiniz: ");
        String a = scan.nextLine();
        System.out.println("Lutfen soyisminizi tanimlayiniz: ");
        String b = scan.nextLine();

        System.out.println(a.toUpperCase().charAt(0) + a.substring(1) + " " + b.toUpperCase().charAt(0) + b.substring(1));
    }
}
