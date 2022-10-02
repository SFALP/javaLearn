package j04_AritmaticOperators.tasks;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("Saati saniyeye çeviren programa Hoşgeldiniz!");
        System.out.println("Lütfen saat verisini tanımlayınız: ");
        double h= scan.nextDouble();
        System.out.println("Lütfen dakika verisini tanımlayınız: ");
        int m= scan.nextInt();
        System.out.println("Girilen verilere göre toplam saniye: "+(h*3600)+(m*60));

    }

}
