package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        /*        Girilen String'in son karakterini silen kod create ediniz.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ifade yaziniz");
        String a = scan.nextLine();
        System.out.println(a.substring(0, a.length() - 1));
                   }
}