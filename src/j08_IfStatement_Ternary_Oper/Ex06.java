package j08_IfStatement_Ternary_Oper;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        /*
        TASK1 --> Kullanıcının cinsiyeti kadın ise 60 yaşından buyuk ve prim gunu 6000'den fazla ise emekliliğini,
                 Kullanıcının cinsiyeti ERKEK ise 65 yaşından buyuk ve prim gunu 7000'den fazla ise emekliliğini,
                 kontrol edip kalan yıl ve prim gününü print eden kodu create ediniz.                 .

        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Emeklilik durum sorgulama programına Hoşgeldiniz! ");
        System.out.println("\nLütfen cinsiyetiniz erkek ise E, kadın ise K tanımlayınız");
        char c = scan.next().charAt(0);

        if (c == 'K' || c == 'k') {
            System.out.println("Lütfen yasinizi tanımlayınız: ");
            int y = scan.nextInt();
            if (y >= 60) {
                System.out.print("Lütfen prim gününüzü giriniz: ");
                int p = scan.nextInt();
                if (p > 6000) {
                    System.out.println("Emekliliğe hak kazandınız. Tebrikler :=)");
                } else
                    System.out.println("Emekliliğiniz için " + (6000 - p) + " gün daha sigortalı çalışmalısınız.");
            } else
                System.out.println("Emekli olmanız için " + (60 - y) + " yıl daha var.");
        } else if (c == 'E' || c == 'e') {
            System.out.println("Lütfen yasinizi tanımlayınız: ");
            int y = scan.nextInt();
            if (y >= 65) {
                System.out.print("Lütfen prim gününüzü giriniz: ");
                int p = scan.nextInt();
                if (p > 7000) {
                    System.out.println("Emekliliğe hak kazandınız. Tebrikler :=)");
                } else
                    System.out.println("Emekliliğiniz için " + (7000 - p) + " gün daha sigortalı çalışmalısınız.");
            } else
                System.out.println("Emekli olmanız için " + (65 - y) + " yıl daha var.");

        } else
            System.out.println("Cinsiyet verisi doğru girilmediği için işlem yapılamayacaktır. Lütfen tekrar deneyiniz");

    }
}
