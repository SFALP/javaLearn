package j22_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class C03_LocalDateTime {// hem tarih hem zaman istenen Class

    public static void main(String[] args) {

//  LocalDateTime --> tarih (yil-ay-gun) ve zaman (saat-dakika-saniye mlsn) bilgilerini tutar.

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("ldt = " + ldt);//ldt = 2022-10-25T22:01:27.174741500

        LocalDate d=LocalDate.of(2016,3,13);//tarih atamasi yapildi
        LocalTime t=LocalTime.of(14,45,37);//zaman atamasi yapildi.

        LocalDateTime trhZmn=LocalDateTime.of(d,t);// yukarida atanan belirli tarihler bu kod yapisiyla birlestirildi.
        System.out.println("trhZmn = " + trhZmn);// Birlestirilen hali: trhZmn = 2016-03-13T14:45:37

LocalDateTime ldt1=LocalDateTime.of(2018, Month.MAY,19,20,30);
        System.out.println("ldt1 = " + ldt1);//ldt1 = 2018-05-19T20:30

        System.out.println();
        System.out.println("trhZmn.getDayOfMonth() = " + trhZmn.getDayOfMonth());//trhZmn.getDayOfMonth() = 13
        System.out.println("trhZmn.getDayOfWeek() = " + trhZmn.getDayOfWeek());//trhZmn.getDayOfWeek() = SUNDAY
        System.out.println("trhZmn.getHour() = " + trhZmn.getHour());//trhZmn.getHour() = 14

        System.out.println("trhZmn.plusWeeks(3).minusDays(5).plusHours(13).minusMinutes(72) = " + trhZmn.plusWeeks(3).minusDays(5).plusHours(13).minusMinutes(72));
// ust satirda yapilan islemler (sırasiyla): 3 hafta ileri, 5 gun geri, 13 saat ileri, 72 dakika geri gidildi.
// Sonuc: trhZmn.plusWeeks(3).minusDays(5).plusHours(13).minusMinutes(72) = 2016-03-30T02:33:37
    }
}