package j08_IfStatement_Ternary_Oper;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
// TASK 1: (LEAP YEAR Problemi)
/* girilen bir yılın artık yıl(LEAP YEAR) olmasını kontrol eden code create ediniz..
    artık yıl:
    Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
    Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
    Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Artık yıl kontrol etme programına Hoşgeldiniz");
        System.out.println("Lütfen bir yıl tanımlayınız: ");
        int a = scan.nextInt();

        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) {//Şartlar sırasıyla açıklanacak olursa; (1)yıl 4'ün tam katı?, (2)yıl 100'ün katı olmamalı, (3)yıl 400'ün tam katı olmalı
            System.out.println("Bu yıl artık yıldır :=).");
        } else {
            System.out.println("Girilen yıl artık yıl değildir :=(. Teşekkürler");
        }
    }
}
