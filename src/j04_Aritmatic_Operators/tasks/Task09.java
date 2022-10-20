package j04_Aritmatic_Operators.tasks;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("Çiftlikteki hayvanların ayak sayısını öğrenme programına Hoşgeldiniz!");
        System.out.println("Çiftlikteki inek sayısını tanımlayınız: ");
        int i= scan.nextInt();
        System.out.println("Çiftlikteki koyun sayısını tanımlayınız");
        int j= scan.nextInt();
        System.out.println("Çiftlikteki tavuk sayısını tanımlayınız");
        int k= scan.nextInt();
        System.out.println("Çiftlikteki toplam ayak sayısı: "+(i*4+4*j+k*2));


    }

}
