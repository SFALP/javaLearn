package j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
/*
        TASK -> Kuualanıcının ehliyetinin varlığını kontrol ediniz.
        Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını teslim ediniz
        aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
*/
   Scanner scan = new Scanner(System.in);
   System.out.print("Ehliyetiniz varsa E, yoksa H giriniz: ");
   char c = scan.next().charAt(0);//Kullanıcının girdiği karakterin ilk değerini alır.

   if (c == 'E' || c == 'e') {//Ehliyetin varlığı kontrol edildi
            System.out.println("Kaç yıllık şoförlük deneyiminiz var? ");
            int t = scan.nextInt();
            if (t >= 7) {//Tecrübe yılı kontrol edildi.
                System.out.println("Bugüne kadar tahmini kaç km mesafe yol kat ettiniz? ");
                int x = scan.nextInt();
                if (x >= 100000) {//Km mesafe kontrol edildi.
                    System.out.println("Kontak anahtarı sizindir. iyi yolculuklar :=)");
                } else //Mesafe şartı sağlanamazsa çalışır.
                    System.out.println("Anahtarı almanız için " + (100000 - x) + " kadar mesafe kat etmelisiniz");
            } else//Yıl şartı sağlanamazsa çalışır.
                System.out.println("Kontak anahtarı almanız için " + (7 - t) + " yıla ihtiyacınız bulunmaktadır");//Yıl 7'den büyük olma şartı sağlanmadığı için eksik tecrübe yılı yazdırıldı.

        } else if (c == 'H' || c == 'h') {
            System.out.println("Öncelikle ehliyete sahip olmalısınız. Aracı size teslim edemiyoruz. Anlayışınız için teşekkürler");
        } else
            System.out.println("Girilen ifade tanımsızdır. Lütfen tekrar deneyiniz");
    }
}
