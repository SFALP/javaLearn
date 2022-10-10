package j12_Loops.L01_ForLoop.Task;

import java.util.Scanner;

public class Task10_Nest_For_HarfSay {
/*
Girilen bir ifadenin istenen harf sayisini print eden cod create ediniz.
Input: selam JavaCAN'lar
Output: a sayisi: 3
 */

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bir cumle tanimlayiniz: ");
        String a= sc.nextLine().toLowerCase();
        System.out.println("Saydirmak istediginiz harfi tanimlayiniz: ");
        char b=sc.next().toLowerCase().trim().charAt(0);

        int harfSayisi=0;//ilk deger 0 atandi ki saymaya etki etmesin.
        for (int i = 0; i <a.length() ; i++) {
if (a.charAt(i)==b){
    harfSayisi++;
}else System.out.println("");
        }
        System.out.println("Girdiginiz cumle: ("+a+") Cumle icinde sayilmasini istediginiz harf: "+b+", "+harfSayisi+" adet bulunmaktadir.");
    }
}