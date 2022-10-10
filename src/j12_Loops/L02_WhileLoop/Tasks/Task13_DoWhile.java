package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task13_DoWhile {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */

Scanner sc=new Scanner(System.in);

char a;
        do {
            System.out.println("JavaCAN");
            System.out.println("Lutfen bir karakter tanimlayiniz: ");
            a=sc.nextLine().toUpperCase().trim().charAt(0);
        }while (a!='X');
        System.out.println("JAVATAR");
    }
}