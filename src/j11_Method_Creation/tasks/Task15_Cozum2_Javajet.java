package j11_Method_Creation.tasks;

import java.util.Scanner;
/*  A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz */

public class Task15_Cozum2_Javajet {
    static Scanner sc = new Scanner(System.in);
    static double priceB = 500 * 0.1;
    static double priceC = 700 * 0.1;
    static double priceD = 900 * 0.1;

    public static void main(String[] args) {

        System.out.println("Javajet Airlines bilet satis platformuna Hosgeldiniz!");

        nereye();

        System.out.println("Javajet Airlines, yolculugunuzun saglikli ve huzurlu gecmesini diler,");
        System.out.println(" bir sonraki ucusumuzda gorusmek uzere :=)");
    }//main disi


    private static void nereye() {
        System.out.print("A sehrinden nereye gitmek istersiniz? \n B icin (B)\n C icin (C)\n D icin (D) \n harflerini tanimlayiniz:  ");
        String yer = sc.nextLine().toUpperCase().trim();
        if (yer.equals("B") || yer.equals("C") || yer.equals("D")) {
            System.out.println("Tebrikler!, Harika bir lokasyon sectiniz :)");
            System.out.print("Lutfen yasinizi tanimlayiniz: ");
            double y = sc.nextInt();
            System.out.print("Biletiniz gidis-donus olsun mu?\n Karariniz EVET ise 1, HAYIR ise 0 tuslayiniz: ");
            int d1 = sc.nextInt();

            switch (yer) {
                case "B": {

                    yas(y);
                    tekCift(d1);
                    tutar(yas(y), tekCift(d1), priceB);
                    break;
                }
                case "C": {

                    yas(y);
                    tekCift(d1);
                    tutar(yas(y), tekCift(d1), priceC);
                    break;
                }
                case "D": {

                    yas(y);
                    tekCift(d1);
                    tutar(yas(y), tekCift(d1), priceD);

                    break;
                }
                default:
                    System.out.println("Hatali bir deger tanimladiniz");
                    nereye();
                    break;
            }
        } else {
            System.out.println("A'dan sadece B - C - D lokasyonuna ucusumuz bulunmaktadır.");
            nereye();
        }
    }

    private static void tutar(double yas, double tekCift, double price) {
        double tutar = yas * tekCift * price;
        System.out.println("Tek kisi icin odenmesi gereken tutar: " + tutar + "€");
    }

    public static void karar() {
        System.out.println("Devam etmek icin 1, islemi sonlandirmak icin 0 tuslayiniz: ");
        int z = sc.nextInt();
        if (z == 1) {
            nereye();
        } else if (z == 0) {
            System.out.println("Gorusmek uzere, yine bekleriz.");
        } else {
            System.out.println("Hatalı bir veri tanimladiniz. Lutfen tekrar deneyiniz");
            karar();
        }
    }

    public static double tekCift(int a) {
        double a1 = 1;
        if (a == 1) {
            a1 = 0.8 * 2;
        } else if (a == 0) {
            a1 = 1;
        } else
            System.out.println("Hatali bir deger tanimladiniz.");
        return a1;
    }

    public static double yas(double y) {
        double y1 = 1;
        if (y >= 65) {
            y1 = 0.7;
        } else if (y >= 0 && y <= 12) {
            y1 = 0.5;
        } else if (y > 12 && y <= 24) {
            y1 = 0.9;
        } else {
            System.out.println("Hatali bir veri tanimladiniz.");
        }
        return y1;
    }

}//bitis