package InterviewQuestions.Day04_221128;

import java.util.Scanner;

/*
   Write a method named isEven that accepts an integer argument.
   The method should return true if the argument is even, or false otherwise.
   */
public class Q02_PrintEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi = sc.nextInt();
        System.out.println(ciftMi(sayi));

    }//main sonu

    public static boolean ciftMi(int sayi) {
        if (sayi % 2 == 0) return true;
        else return false;
    }
}