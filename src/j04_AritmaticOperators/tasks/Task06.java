package j04_AritmaticOperators.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */

Scanner scan=new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı tanımlayınız: ");
        int s= scan.nextInt();
        System.out.println("Girilen sayının birler basamağı: "+(s%10));
        System.out.println("Girilen sayının onlar basamağı: "+((s/10)%10));
        System.out.println("Girilen sayının yüzler basamağı: "+(s/100));


    }
}
