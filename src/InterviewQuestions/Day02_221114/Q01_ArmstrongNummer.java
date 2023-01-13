package InterviewQuestions.Day02_221114;
/*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
      gösteren program yazınız
*/

import java.util.Scanner;

public class Q01_ArmstrongNummer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi = sc.nextInt();

        armstrong(sayi);


    }

    public static void armstrong(int sayi) {
        int sayininKupleriToplami = 0;
        int basamaktakiSayi = 0;
        int girilenSayi = sayi;

        while (sayi > 0) {
            basamaktakiSayi = sayi % 10;
            sayininKupleriToplami += (basamaktakiSayi * basamaktakiSayi * basamaktakiSayi);
            sayi = sayi / 10;

        }
        if (girilenSayi == sayininKupleriToplami) {
            System.out.println("Girilen (" + girilenSayi + ") sayisi armstrong sayidir");
        } else System.out.println("Girilen (" + girilenSayi + ") sayisi arstrong sayi degildir");
    }
}

