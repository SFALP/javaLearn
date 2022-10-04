package Practice_Day05_221003;

import java.util.Scanner;

public class Q03_Method_Creation {
    public static void main(String[] args) {

        /*
 cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
  */

        Scanner scan =new Scanner(System.in);
        System.out.println("Santimetre tipinde bir olcu tanimlayiniz: ");
        double a= scan.nextDouble();

        System.out.println("Girilen sayinin metre karsiligi: "+metre(a));
        System.out.println("Girilen sayinin kilometre karsiligi: "+kilometre(a));

    }
    public static double metre (double a){
        double s1=a/100;
        return s1;
    }
    public static double kilometre (double a){
        double s2=a/100000;
        return s2;
    }
}
