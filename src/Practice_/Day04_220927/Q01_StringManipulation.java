package Practice_.Day04_220927;

import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {
// Kullanıcıdan isim soy ismini isteyiniz. Sonrasında konsola büyük harfla yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen isminizi tanimlayiniz: ");
        String vorName = scan.nextLine();
        System.out.print("Lutfen soyisminizi tanimlayiniz: ");
        String nachName = scan.nextLine();
        String vollName = vorName.concat(" " + nachName).toUpperCase();
        System.out.println("vollName = " + vollName);
    }
}