package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task12_Harf_Sayi_Karakter_Say {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */
        int index = 0;//index sayisi
        int harf = 0;//harf sayisi
        int rakam = 0;//rakam sayisi
        int karakter = 0;//ozel karakter sayisi

        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen bir ifade tanimlayiniz: ");
        String a = sc.nextLine().toLowerCase().trim();

        do {
            if ((a.charAt(index) >= 'A' && a.charAt(index) <= 'Z') || (a.charAt(index) >= 'a' && a.charAt(index) <= 'z')) {
                harf++;
            } else if (a.charAt(index) <= '9' && a.charAt(index) >= '0') {
                rakam++;
            } else karakter++;
            index++;
        } while (index <= a.length() - 1);

        System.out.println("Girilen metindeki harf sayisi: " + harf);
        System.out.println("Girilen metindeki rakam sayisi: " + rakam);
        System.out.println("Girilen metindeki ozel karakter sayisi: " + karakter);
    }
}