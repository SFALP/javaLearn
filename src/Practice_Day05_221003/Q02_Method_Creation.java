package Practice_Day05_221003;

import java.util.Scanner;

public class Q02_Method_Creation {

    /* Write a method named isEven that accepts an integer argument.
 The method should return true if the argument is even, or false otherwise.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Girilen sayinin tek veya cift oldugunu ogrenme programina hosgeldiniz");
        System.out.println("Girilen sayi cift ise sonuc; true, tek ise false olacaktır.");
        System.out.print("Bir tamsayi tanimlayiniz: ");
        int a = scan.nextInt();

        System.out.println(ciftKontrol(a));
    }

    public static boolean ciftKontrol(int a) {
        return a%2==0 ? true : false;

    }
}