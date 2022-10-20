package j09_Switch_Statement.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        // VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.print("Bitte geben Sie an, Welcher Buchstabe in der Abkürzung \"VIP\"für Sie von Interesse ist: ");
        char c = scan.nextLine().charAt(0);
        switch (c) {
            case ('V'):
            case ('v'):
                System.out.println("Die Erklarung der Abkürzung ist VERY(MEHR)");
                break;
            case ('I'):
            case ('i'):
            case ('ı'):
                System.out.println("Die Erklarung der Abkürzung ist IMPORTANT(WICHTIG)");
                break;
            case ('P'):
            case ('p'):
                System.out.println("Die Erklarung der Abkürzung ist PERSON(MENSCH)");
                break;
            default:
                System.out.println("Sie haben falschen Charakter definiert. Versuchen Sie bitte erneut.");
        }
    }
}