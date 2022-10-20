package Practice_.Day04_220927;

import java.util.Scanner;

public class Q13_StringManipulation {
    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 4 karakterli bir ifade tanimlayiniz: ");
String a=scan.nextLine().toLowerCase();

if (a.length()==4){
    System.out.print("Girilen ifade: "+a);
    System.out.print("Girilen ifadenin tersten yazilmis hali: "+a.charAt(3)+a.charAt(2)+a.charAt(1)+a.charAt(0));
}else
    System.out.println("Girilen ifade 4 harften farkli oldugu icin islem yapilamamaktadir. Lutfen tekrar deneyiniz.");

    }
}