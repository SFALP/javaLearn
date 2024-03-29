package InterviewQuestions.Day05_221205;

import java.util.Scanner;

// Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
// Not :govde sabit sayi olsun
    /* tac uzunlugu -> 6 iken
    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    ^^^^^^
    |||
    |||
    |||
    |||
    |||
     */
public class Q09_TreeShape {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("agacin tac uzunlugunu giriniz :");
        int tacUzunluk = scan.nextInt();

        String yaz = ""; //bu degiskeni tanimladik , for loop icinde kullanmak icin
        for (int i = 0; i < tacUzunluk; i++) {
            yaz += "^"; //bu kod satiri sayesinde nested for loop a ihtiyac duymadan yazdik
            System.out.println(yaz);
        }

        for (int i = 0; i < 5; i++) //govde sabit sayi oldugundan kendimiz  i <5 kismini yazdik
            System.out.println("|||");
    }
}
