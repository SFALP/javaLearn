package Practice_.Day07_221011;
/*
 Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
 ve x girildiğinde ise "Program bitti" yazan programı yazınız.
 */

import java.util.Scanner;

public class Q07_Loop_ProgramCalistir {
    public static void main(String[] args) {


        char a;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Bir harf tanimlayiniz: ");
            a = sc.next().toLowerCase().trim().charAt(0);

        } while (a != 'x');

    }
}
