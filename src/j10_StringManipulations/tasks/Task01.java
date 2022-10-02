package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Schreiben Sie bitte mit dem Tastatur einen Satz:");
        String a = scan.nextLine().toLowerCase();
        if (a.contains(" ")) {
            System.out.println("Es gibt eine oder mehrere Lücken in Ihren geschriebenen Satze");
        } else
            System.out.println("In Ihren geschriebenen Satze wurde es keine Lücke gefunden.");
    }
}