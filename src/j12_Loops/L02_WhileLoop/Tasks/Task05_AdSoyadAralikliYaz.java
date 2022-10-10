package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task05_AdSoyadAralikliYaz {

    public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen isminizi tanimlayiniz: ");
        String a1 = sc.nextLine().toLowerCase().trim();
        System.out.print("Lutfen soyisminizi tanimlayiniz: ");
        String a2 = sc.nextLine().toUpperCase().trim();

        int i1 = a1.length() - 1;
        int i2 = a2.length() - 1;
        System.out.println("Girilen AD: ");
        for (int i = 0; i <= i1; i++) {
            System.out.print(a1.charAt(i) + " ");
        }
        System.out.println("\nGirilen SOYAD: ");
        for (int j = 0; j <= i2; j++) {
            System.out.print(a2.charAt(j) + " ");
        }
    }
}