package InterviewQuestions.Day04_221128;

import java.util.Scanner;

/*
       create one int
       do while int is less then 100
       print the number
       increment by 5
       for example: 0   5   10  15  20
    */
public class Q01_UsingDoWhilePrintNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi giriniz :");
        int sayi = scanner.nextInt();

        do {
            System.out.print(sayi + " "); // istenen stilde yazdirma
            sayi += 5; // increment degeri
        } while (sayi < 100); //sartimiz var

    }
}