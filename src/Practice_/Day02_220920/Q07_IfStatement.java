package Practice_.Day02_220920;

import java.util.Scanner;

public class Q07_IfStatement {
    public static void main(String[] args) {
        /*
        Problem tanimi :
        Kullanicidan  yasini ve kilosunu aliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Kan bağışı durumunu öğrenme programını Hoşgeldiniz!");
        System.out.print("Lütfen yasinizi giriniz: ");
        int a = scan.nextInt();
        if (a >= 18) {
            System.out.println("Lütfen kilonuzu tanımlayınız");
            double k = scan.nextDouble();
            if (k >= 50) {
                System.out.println("Kan bağışı yapabilirsiniz.");
            } else
                System.out.println("50 kilonun altındaki kan bağışı adaylarının sağlığını korumak için kan bağışı kabul edilememktedir.");
        } else
            System.out.println("18 Yaşından küçük olan bireylerin kan bağışı yapması uygun değildir.");
    }
}