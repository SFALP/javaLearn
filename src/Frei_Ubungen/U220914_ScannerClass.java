package Frei_Ubungen;

import java.util.Scanner;

public class U220914_ScannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*  1.Lösungweg:
        System.out.println("Lütfen isminizi giriniz: ");
        String isim= input.next();
        System.out.println("İsminiz: " +isim);

        System.out.println("\nLütfen yasinizi giriniz:");
        int y = input.nextInt();
        System.out.println("Yaşınız: "+y);
*/
        //2. Lösungweg
        System.out.println("Lütfen isminizi giriniz:");
        String isim= input.next();
        System.out.println("Lütfen yaşınızı giriniz:");
        int y= input.nextInt();
        System.out.println("Girilen isim: "+isim +"\n\t Girilen yaş: "+y);

    }

}
