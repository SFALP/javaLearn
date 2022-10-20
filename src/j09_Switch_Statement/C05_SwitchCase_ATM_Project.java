package j09_Switch_Statement;

import java.util.Scanner;

public class C05_SwitchCase_ATM_Project {
    public static void main(String[] args) {
/*
Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir ATM app. code create ediniz.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("********* Willkommen bei Ihrem JAVA ATM *********");
        System.out.println("Lutfen ATM'de yapmak istediginiz islemi asagida belirlenen sayilara uygun olarak seciniz:");
        System.out.println("Bakiye ogrenmek icin: 1\nPara yatirmak icin: 2\n Para cekmek icin: 3\nCikis islemi icin: 4");
        int x = scan.nextInt();
        int g = 1000;

        switch (x) {
            case 1:
                System.out.println("Mevcut bakiyeniz: = " + g);
// NŞA'da bu satıra breake yazabiliriz. Yazarsak bakiye sorma işlemi sonrasında kodu bitirir. Break yazılırsa müşteriye yatıracağı veya çekeceği para miktarı sorulmamış olacaktır.
            case 2:
                System.out.println("Yatirmak istediginiz tutari tanimlayiniz: ");
                int m = scan.nextInt();
                g += m;//g ve m değerleri toplandı.
                System.out.println("Yeni bakiyeniz: " + g);
// NŞA'da bu satıra breake yazabiliriz. Yazarsak para yatırma işlemi tamamlandıktan sonra kodu bitirir. Break yazılırsa müşteriye çekeceği para miktarı sorulmamış olacaktır.
            case 3:
                System.out.println("Cekmek istediginiz tutari tanimlayiniz: ");
                int z = scan.nextInt();
                System.out.println(z <= g ? "İşleminiz yapılıyor, Lütfen bekleyiniz... " : "(Bakiyenizde yeterli bakiye bulunmamaktadır. Lütfen " + g + " tl tutarından fazla para çekemezsiniz)");
                g -= z;//g değerinden z değeri çıkarıldı.
                System.out.println(g > 0 ? ("Yeni bakiyeniz: " + g) : ("İyi günler dileriz.")); //Bu satırda g değerinin 0'dan büyük olması durumuna göre müşteriye çıktı verildi.
                break;
            case 4:
                System.out.println("Yine bekleriz :=)");
                break;

            default:
                System.out.println("Hatalı bir seçim yaptınız. Lutfen tekrar deneyiniz");
        }
    }
}