package Practice_.Day10_221024;
 /*
Iki tane atilan zarin toplamlarinin 9 olmasi durumanda "Kazandiniz" yazisini yazdirin,
 aksi takdirde "Tekrar deneyiniz" yazisi yazmali

 */

public class C6_ZarSorusu {
    public static void main(String[] args) {

        int toplam = 0;

        for (int i = 0; i <= 1; i++) {
            int min = 1;
            int max = 6;
            int zar = (int) (Math.random() * ((max - min) + 1)) + min;
            toplam += zar;
            System.out.println("Zar (" + (i + 1) + "): " + zar);
        }
        if (toplam == 9) {
            System.out.println("Kazandiniz :=)");
        } else System.out.println("Tekrar deneyiniz :(");
    }
}