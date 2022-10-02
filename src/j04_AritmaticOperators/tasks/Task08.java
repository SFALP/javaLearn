package j04_AritmaticOperators.tasks;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("Saniyeyi, saat-dakika ve saniye formatına çeviren programa Hoşgeldiniz!");
        System.out.println("\n Lütfen saniye verisini tanımlayınız:");
        int s= scan.nextInt();
        System.out.println(+s+" saniye = "+(s/3600)+" saat "+(s%3600/60)+" dakika ve "+s%60+" saniyedir. Teşekkürler :)");


    }
}
