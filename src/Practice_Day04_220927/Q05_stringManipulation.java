package Practice_Day04_220927;

import java.util.Scanner;

public class Q05_stringManipulation {
    public static void main(String[] args) {

        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
                 * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
        */
Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 1.kelimeyi tanimlayiniz: ");
        String a= scan.nextLine();
System.out.println("Lutfen 2.kelimeyi tanimlayiniz: ");
        String b= scan.nextLine();
System.out.println("Lutfen 3.kelimeyi tanimlayiniz: ");
        String c= scan.nextLine();
System.out.println("Lutfen 4.kelimeyi tanimlayiniz: ");
        String d= scan.nextLine();
        System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)+" "+b+" "+c+" "+d+".");
    }
}