package j12_Loops.L01_ForLoop.HW_20221006;

import java.util.Scanner;

public class Odev02_RakamSay {
    public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir ifade tanimlayiniz: ");
        String a = sc.nextLine().toLowerCase().trim();
        int harf = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 48 && a.charAt(i) <= 57) {
                harf++;
            }
        }
        System.out.println("Girilen (" + a + ") ifadesindeki rakam sayisi: " + harf);
    }
}