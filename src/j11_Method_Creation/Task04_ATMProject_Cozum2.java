package j11_Method_Creation;

import java.util.Scanner;

public class Task04_ATMProject_Cozum2 {
    /* TASK:  Bakiye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
         ATM app. code create ediniz. */
    static Scanner scan = new Scanner(System.in);
    static int bakiye = 1000;

    public static void main(String[] args) {

        System.out.println("********* Willkommen bei Ihrem JAVA ATM *********");
        System.out.println("Lutfen ATM'de yapmak istediginiz islemi asagida belirlenen sayilara uygun olarak seciniz:");
        System.out.println("Bakiye ogrenmek icin: 1\nPara yatirmak icin: 2\n Para cekmek icin: 3\nCikis islemi icin: 4");
        secim();//method call yapildi.

    }// main disi

    public static void secim() {
        System.out.print("agam ne yapacaksan sec:  ");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                bakiyeVer();
                break;
            case 2:
                paraYatir();
                break;
            case 3:
                paraCek();
                break;
            case 4:
                cikisYap();
                break;
            default:
                System.out.println("agam daha secim yapamirsen, bi de para istirsen...");
                karar();
        }
    }

    public static void cikisYap() {
        System.out.println("agam yine bekleriz, cikisiniz yapilmistir, selametle guzel insan :=)");
    }

    public static void paraCek() {
        System.out.println("agam ne kadar para istersin: ");
        int cekilecekMiktar = scan.nextInt();
        if (cekilecekMiktar <= bakiye) {
            bakiye -= cekilecekMiktar;
            System.out.println("agam para cebinde gozun aydin :)");
            System.out.println("Bakiyen: " + bakiye);
        } else System.out.println("agam neddinnn olmayan parayi istersin :(");
        karar();
    }

    public static void paraYatir() {
        System.out.println("agam elin tutulmaz, ne kadar para yatireceksin: ");
        int yatirilacakMiktar = scan.nextInt();
        bakiye += yatirilacakMiktar;
        System.out.println("agam para hesbinda, yeni bakiyen: " + bakiye);
        karar();
    }

    public static void bakiyeVer() {
        System.out.println("agam bakiyen: " + bakiye);
        karar();
    }

    public static void karar() {
        System.out.println("agam isleme devaammkeee --> 1\n yeter --> 0 \n");
        int karar = scan.nextInt();
        if (karar == 1) {
            secim();
        } else if (karar == 0) cikisYap();
        else System.out.println("agam adam gibi bisey gir: ");
    }
}