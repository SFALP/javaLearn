package j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin

        Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
        Eger 10 dan buyuk ise "Buyuksun!" yazdirin
        Eger 10 dan kucuk ise "Normalsin!" yazdirin

        Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
        Eger -10 dan buyuk ise "Negatifsin!" yazdirin
        Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
            */
    Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayı tanımlayınız");
        double a= scan.nextDouble();

        if (a>0){
            if (a>10){
                System.out.println("Buyuksun!");
            }else
                System.out.println("Normalsin!");
        } else if (a<0) {
            if (a<-10) {
                System.out.println("Cok negatifsin");
            }else System.out.println("Negatifsin");
        } else
            System.out.println("Girilen sayi notrdur.");

    }
}