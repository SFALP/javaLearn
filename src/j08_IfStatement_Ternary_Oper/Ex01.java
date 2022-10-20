package j08_IfStatement_Ternary_Oper;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
// TASK 1--> Girilen sayının negatif veya pozitifliğini kontrol eden code oluşturunuz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı tanımlayınız: ");
        double x = scan.nextDouble();

        if (x > 0) { //sayının pozitif olması şarta bağlandı
            System.out.println("Girilen sayı pozitiftir");
        } else if (x < 0) {//Sayının 0'dan büyük olmaması halinde sıfırdan küçük olması şarta bağlandı
            System.out.println("Girilen sayı negatiftir");
        }else //sayının sıfırdan büyük veya küçük olmaması halinde kalan durum (0'a eşit olması) şarta bağlandı.
            System.out.println("Girilen sayı nötrdür");
    }
}
