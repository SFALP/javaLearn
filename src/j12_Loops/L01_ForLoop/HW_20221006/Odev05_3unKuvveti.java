package j12_Loops.L01_ForLoop.HW_20221006;

import java.util.Scanner;

public class Odev05_3unKuvveti {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Girilen sayinin 3'un kuvveti olup-olmadiginin kontrol edildigi programa Hosgeldiniz!");
        System.out.print("Lutfen pozitif bir sayi tanimlayiniz: ");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("Sorgulama sonucunuz: " + PowerofThree(a));

        } else
            System.out.println("Kural disi bir sayi tanimlandigi icin isleme devam edemiyorum. Lutfen tekrar deneyiniz.");

    }

    public static boolean PowerofThree(int a) {
        boolean x = false;
        for (int i = 3; i <= a; i++) {
            if (a == Math.pow(3, i)) {
                if (a % i == 0) {
                    x = true;
                    System.out.println("Girilen (" + a + ") sayisi 3'un (" + i + ").kuvvetidir");
                }
            }
        }
        System.out.println("Girilen (" + a + ") sayisi 3'un kuvveti degildir.");
        return x;
    }
}