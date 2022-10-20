package j08_IfStatement_Ternary_Oper.tasks;

import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

        /* Trafik cezasının değerini hesaplayın.
        55 hız sınırıdır.
        Eğer hızınız 55-74 arasında ise:Ceza 100 $'dır.
        Eğer hızınız 75 - 84 arasında ise:Ceza 150 $'dır.
        Eğer hızınız 85 -94 arasında ise:Ceza 320 $'dır.
        Eğer hızınız 94'den daha fazla ise: Ceza 500 $'dır.
        ve ayrıca,
        Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

        Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.
-----------------------------------------
Örn;
currentSpeed(Hızınız) 87
ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;
sonuç 320 olmalıdır.

currentSpeed(Hızınız) 65
ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;
sonuç 300 olmalıdır.  */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen aracın hızını tanımlayınız");
        int currentSpeed = scan.nextInt();
        System.out.println("Şoförün ehliyeti varsa true, yoksa false yazınız: ");
        boolean isDriverLicenceAvailable = scan.nextBoolean();
        int c;
        int e;

//Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (currentSpeed >= 0 && currentSpeed < 55) {
            c = 0;
        } else if (currentSpeed >= 55 && currentSpeed < 75) {
            c = 100;
        } else if (currentSpeed >= 75 && currentSpeed < 85) {
            c = 150;
        } else if (currentSpeed >= 85 && currentSpeed < 95) {
            c = 320;
        } else {
            c = 500;
        }
        if (isDriverLicenceAvailable == true) {
            e = 0;
        } else
            e = 200;
        System.out.println(+(e + c) > 0 ? ("Ödenmesi gereken ceza bedeli toplam: " + (e + c) + " USD") : ("Cezanız yok. İyi yolculuklar :)"));//Bu satırda Ternary kalıbı kullanılmıştır.
    }
}