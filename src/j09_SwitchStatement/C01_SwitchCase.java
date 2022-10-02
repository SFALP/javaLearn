package j09_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {

    /*
 Switch Case deyimi islev bakimindan if deyimine çok benzemektedir.
 Çok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
 programi izlemek zorlasacaktir. Programimizin bir degerini bir çok degerle
 karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
 ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
 Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
 Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
 çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
 Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.

 ahan da TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ.. CISSS
*/
    public static void main(String[] args) {
// TASK: Kullanıcının girdiği rakamı yazıyla print eden kod create ediniz.
        Scanner scann = new Scanner(System.in);
        System.out.println("Lütfen bir rakam tanımlayınız: ");
        int a = scann.nextInt();

        System.out.println("IF ELSEIF Çözümü");
        if (a == 0) {
            System.out.println("Girilen rakam SIFIR");
        } else if (a == 1) {
            System.out.println("Girilen rakam BİR");
        } else if (a == 2) {
            System.out.println("Girilen rakam İKİ");
        } else if (a == 3) {
            System.out.println("Girilen rakam ÜÇ");
        } else if (a == 4) {
            System.out.println("Girilen rakam DÖRT");
        } else if (a == 5) {
            System.out.println("Girilen rakam BEŞ");
        } else if (a == 6) {
            System.out.println("Girilen rakam ALTI");
        } else if (a == 7) {
            System.out.println("Girilen rakam YEDİ");
        } else if (a == 8) {
            System.out.println("Girilen rakam SEKİZ");
        } else if (a == 9) {
            System.out.println("Girilen rakam DOKUZ");
        } else
            System.out.println("Hatalı veri tanımlanmıştır. Lütffen tekrar deneyiniz");

        System.out.println("********* SWITCH CASE Çözümü **********");

        switch (a) {
            case 0:
                System.out.println("Eingetragene Nummer ist (" + a + ") NULL");
                break;
            case 1:
                System.out.println("Eingetragene Nummer ist (" + a + ") EIN");
                break;
            case 2:
                System.out.println("Eingetragene Nummer ist (" + a + ") ZWEI");
                break;
            case 3:
                System.out.println("Eingetragene Nummer ist (" + a + ") DREI");
                break;
            case 4:
                System.out.println("Eingetragene Nummer ist (" + a + ") VIER");
                break;
            case 5:
                System.out.println("Eingetragene Nummer ist (" + a + ") FÜNF");
                break;
            case 6:
                System.out.println("Eingetragene Nummer ist (" + a + ") SECHS");
                break;
            case 7:
                System.out.println("Eingetragene Nummer ist (" + a + ") SIEBEN");
                break;
            case 8:
                System.out.println("Eingetragene Nummer ist (" + a + ") ACHT");
                break;
            case 9:
                System.out.println("Eingetragene Nummer ist (" + a + ") NEUN");
                break;
            default:
                System.out.println("Diese Zahl ist nicht eine Ziffer. Versuchen Sie bitte erneut.");

        }
    }
}
