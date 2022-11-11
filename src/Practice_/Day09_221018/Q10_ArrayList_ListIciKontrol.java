package Practice_.Day09_221018;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10_ArrayList_ListIciKontrol {
    /*
       A list has elements “H”, “G” and “E”
       Ask user to enter a letter
       If the letter exists in list convert it to "Got it"
       otherwise add it to the list.
       Example : [H, G, E]
                 Enter a letter :  h
                 [Got It, G, E]
                 Enter a letter :  a
                 [H, G, E, A]
       */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> listHarf = new ArrayList<>(List.of("H", "G", "E"));
        System.out.print("Lutfen bir harf tanimlayiniz: ");
        String harf = sc.nextLine().toUpperCase().trim().substring(0, 1);

        if (!listHarf.contains(harf)) {
            listHarf.add(harf);
            System.out.println("listHarf = " + listHarf);

        } else {
            listHarf.set(listHarf.indexOf(harf), "GOT IT");
        }
        System.out.println("listHarf = " + listHarf);
    }
}