package j10_String_Manipulations;

import java.util.Scanner;

public class Ex99_Contains {
    public static void main(String[] args) {
//TASK: Girilen bir cümlede aranan kelimenin olup olmadığını kontrol eden bir code create ediniz. (Ternary kullanıız)

        Scanner scan = new Scanner(System.in);
        System.out.println("Metin içinde sözcük araştırma algoritmasına Hoşgeldiniz!");
        System.out.println("Lütfen ilk metninizi yazınız:");
        String x = scan.nextLine().toUpperCase();

        System.out.print("Lutfen metin icinde arastirmak istediginiz sozcugu yaziniz:");
        String y = scan.nextLine().toUpperCase();

        System.out.println(x.contains(y) ? ("Aradığınız sözcük genel metin içinde bulunmaktadır") : ("Malesef, aradığınız sozcugu bulamadık. Lutfen tekrar deneyiniz."));
        System.out.println("Teşekkür ederiz :=)");
    }
}