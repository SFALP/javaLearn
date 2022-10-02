package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task_SeyahatProjesi {

    public static void main(String[] args) {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.
        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
 İşlemlerde direkt bunları cağırabilirsiniz.
        todo İLK OLARAK;
        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---
        (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.
    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri ,
    girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:
      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.

       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.
        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("***** Seyahat şirketimize Hosgeldiniz *****");
        System.out.println("<F>rankfurt : 60 km \n<K>öln : 80\n 20 Km basına 5 euro ucretlendirme yapılır :) ");
        System.out.print("Yolculuk yapacagınız sehri seciniz : ");
        char hedef = scan.next().toUpperCase().charAt(0);//sehir buyuk harfe update edildi
        double a = 5;//km birim fiyat

        switch (hedef) {
            case ('F'):
                System.out.println("Rota Frankfurt");
                double f = (60 / 20) * a;//Frankfurt yol masrafı
                System.out.println("Frankfurt " + f + "€");
                System.out.print("Kaç kişi seyahat etmek istiyorsunuz?(Max 2 kişilik olabilir): ");
                int p = scan.nextInt();
                switch (p) {
                    case 1:
                        System.out.println("1 kişi için ödemeniz gereken tutar: " + f + "€");
                        break;
                    case 2:
                        System.out.println("2 kişi için ödemeniz gereken tutar: " + 2 * f + "€");
                        break;
                    default:
                        System.out.println("Hatalı bir değer tanımladınız. Lütfen tekrar deneyiniz");
                        break;
                }
                if (p == 1) {
                    System.out.println("**** REZERVASYON ÖZETİ ********* \n Frankfurt " + p + " kişilik");
                    System.out.println("Bakiyeniz " + f + "€");
                    System.out.print("Yatıracağınız para miktarını giriniz: ");
                    double g = scan.nextDouble();
                    if (g >= f) {
                        System.out.println("Para üstü tutarınız: " + (g - f));
                        System.out.println("Teşekkür eder, yine bekleriz. iyi yolculuklar dileriz.");
                    } else if (g < f) {
                        System.out.println("Rezervasyon için " + (f - g) + "€ daha yatırmalısınız.");
                        System.out.println("Lütfen işlemi yeniden deneyiniz.");
                    } else
                        System.out.println("Hatalı bir giriş yaptınız. Lütfen tekrar deneyiniz.");
                } else if (p == 2) {
                    System.out.println("**** REZERVASYON ÖZETİ ********* \n Frankfurt " + p + " kişilik");
                    System.out.println("Bakiyeniz " + 2 * f + "€");
                    System.out.print("Yatıracağınız para miktarını giriniz: ");
                    double g = scan.nextDouble();
                    if (g >= 2 * f) {
                        System.out.println("Para üstü tutarınız: " + (g - 2 * f));
                        System.out.println("Teşekkür eder, yine bekler, İyi yolculuklar dileriz.");
                    } else if (g < 2 * f) {
                        System.out.println("Rezervasyon için " + (2 * f - g) + "€ daha yatırmalısınız.");
                        System.out.println("Lütfen işlemi yeniden deneyiniz.");
                    } else
                        System.out.println("Hatalı bir giriş yaptınız. Lütfen tekrar deneyiniz.");
                } else
                    System.out.println("Hatalı bir giriş yaptınız. Lütfen tekrar deneyiniz.");

            case ('K')://KÖLN için yazılan COD
                System.out.println("Rota Köln");
                double k = (80 / 20) * a;//Köln yol masrafı
                System.out.println("Köln " + k + "€");
                System.out.print("Kaç kişi seyahat etmek istiyorsunuz?(Max 2 kişilik olabilir): ");
                int pk = scan.nextInt();
                switch (pk) {
                    case 1:
                        System.out.println("1 kişi için ödemeniz gereken tutar: " + k + "€");
                        break;
                    case 2:
                        System.out.println("2 kişi için ödemeniz gereken tutar: " + 2 * k + "€");
                        break;
                    default:
                        System.out.println("Hatalı bir değer tanımladınız. Lütfen tekrar deneyiniz");
                        break;
                }
                if (pk == 1) {
                    System.out.println("**** REZERVASYON ÖZETİ ********* \n Köln " + pk + " kişilik");
                    System.out.println("Bakiyeniz " + k + "€");
                    System.out.print("Yatıracağınız para miktarını giriniz: ");
                    double g = scan.nextDouble();
                    if (g >= k) {
                        System.out.println("Para üstü tutarınız: " + (g - k));
                        System.out.println("Teşekkür eder, yine bekleriz. iyi yolculuklar dileriz.");
                    } else if (g < k) {
                        System.out.println("Rezervasyon için " + (k - g) + "€ daha yatırmalısınız.");
                        System.out.println("Lütfen işlemi yeniden deneyiniz.");
                    } else
                        System.out.println("Hatalı bir giriş yaptınız. Lütfen tekrar deneyiniz.");
                } else if (pk == 2) {
                    System.out.println("**** REZERVASYON ÖZETİ ********* \n Köln " + pk + " kişilik");
                    System.out.println("Bakiyeniz " + 2 * k + "€");
                    System.out.print("Yatıracağınız para miktarını giriniz: ");
                    double g = scan.nextDouble();
                    if (g >= 2 * k) {
                        System.out.println("Para üstü tutarınız: " + (g - 2 * k));
                        System.out.println("Teşekkür eder, yine bekler, İyi yolculuklar dileriz.");
                    } else if (g < 2 * k) {
                        System.out.println("Rezervasyon için " + (2 * k - g) + "€ daha yatırmalısınız.");
                        System.out.println("Lütfen işlemi yeniden deneyiniz.");
                    } else
                        System.out.println("Hatalı bir giriş yaptınız. Lütfen tekrar deneyiniz.");
                } else
                    System.out.println("Hatalı bir giriş yaptınız. Lütfen tekrar deneyiniz.");
        }
    }
}