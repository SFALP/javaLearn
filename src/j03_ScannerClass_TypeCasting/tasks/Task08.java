package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        System.out.println("Not hesaplama programına Holgeldiniz!");
        Scanner scan=new Scanner(System.in);
        System.out.println("1.Vize notunuzu giriniz: ");
        double x=scan.nextDouble();
        System.out.println("2.Vize notunuzu giriniz:");
        double y= scan.nextDouble();
        System.out.println("Final notunuzu giriniz:");
        double z= scan.nextDouble();

        double a= ((x+y)/2*0.3) + (z*0.7);
        System.out.println("Dönem sonu notunuz: "+a);


    }
}
