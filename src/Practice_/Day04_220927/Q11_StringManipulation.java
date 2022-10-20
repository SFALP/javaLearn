package Practice_.Day04_220927;

import java.util.Scanner;

public class Q11_StringManipulation {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi tanimlayiniz: ");
        String a= scan.nextLine();
        System.out.println("Lutfen soyisminizi tanimlayiniz: ");
    String b= scan.nextLine();

if (a.length()>b.length()){
    System.out.println("Uzun olan ifade: "+a);
}else if (b.length()>a.length()){
    System.out.println("Uzun olan ifade: "+b);
}else System.out.println("İki ifadenin de uzunlugu esittir \n( " +a+" ) ( "+b+" )");
    }
}