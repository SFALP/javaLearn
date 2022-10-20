package Practice_.Day07_221011;

import java.util.Scanner;

/*
   Ask user enter a positive number and check if it is prime or not
   Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
    */
public class Q09_Loop_AsalSayi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Asal sayi kontrolu programina Hosgeldiniz!");
        System.out.println("Lutfen 2'den buyuk bir tamsayi belirleyiniz: ");
        int sayi = sc.nextInt();

        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                System.out.println("Sayi asal degildir");
            }else System.out.println("Sayi asaldir");

        }
    }
}