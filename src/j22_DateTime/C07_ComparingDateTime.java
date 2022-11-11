package j22_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C07_ComparingDateTime {//Vergleichen
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate falanGun=bugun.minusDays(2);
        LocalDate filanGun=bugun.plusDays(3);
        LocalDate geburtsTag=LocalDate.of(1991, Month.APRIL,22);

        System.out.println("bugun = " + bugun);//bugun = 2022-10-26
        System.out.println("falanGun = " + falanGun);//falanGun = 2022-10-24
        System.out.println("filanGun = " + filanGun);//filanGun = 2022-10-29
        System.out.println();
// Bu degerleri karsilastirmak icin:
// TRICK: .is ile baslayan methodlar boolean return eder.

        System.out.println("bugun.isBefore(falanGun) = " + bugun.isBefore(falanGun));//bugun.isBefore(falanGun) = false
        System.out.println("bugun.isBefore(filanGun) = " + bugun.isBefore(filanGun));//bugun.isBefore(filanGun) = true
        System.out.println("falanGun.isBefore(filanGun) = " + falanGun.isBefore(filanGun));//falanGun.isBefore(filanGun) = true

        System.out.println();
        System.out.println("bugun.isAfter(falanGun) = " + bugun.isAfter(falanGun));//bugun.isAfter(falanGun) = true
        System.out.println("falanGun.isAfter(filanGun) = " + falanGun.isAfter(filanGun));//falanGun.isAfter(filanGun) = false
        System.out.println("bugun.isLeapYear() = " + bugun.isLeapYear());//bugun.isLeapYear() = false  //Artik yil kontrolü--> Leapyear

int fark=bugun.compareTo(falanGun);
        System.out.println("fark = " + fark);//fark = 2
        int fark2=falanGun.compareTo(filanGun);
        System.out.println("fark2 = " + fark2);//fark2 = -5
        System.out.println("bugun.compareTo(geburtsTag) = " + bugun.compareTo(geburtsTag));//bugun.compareTo(geburtsTag) = 31
// 2022.10.26 ile 1991.04.22 karsilastirildi.

        /*     ComperaTo komutu işlevi:
2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için    */

    }
}
