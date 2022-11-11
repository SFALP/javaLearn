package j22_DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {
// Period --> 2 tarih arasinda gecen ve tekrarlanabilen zamani tutar.

        LocalDate bugun = LocalDate.now();
        LocalDate geburtsTag = LocalDate.of(2000, 1, 1);

        Period fark = Period.between(geburtsTag, bugun);
        System.out.println("fark = " + fark);//P22Y9M25D
        System.out.println("fark.toTotalMonths() = " + fark.toTotalMonths());//fark.toTotalMonths() = 273
        // (Fark datasinin ay cinsinden degeridir.)

        System.out.println("fark.getDays() = " + fark.getDays());//fark.getDays() = 25
        // (Fark datasinin gun cinsinden degeri)
        System.out.println("   ***    ");
        Period period5Gun = Period.ofDays(5);// 5 gunde bir tekrarlayan period
        System.out.println("period5Gun = " + period5Gun);//period5Gun = P5D
        Period period7Ay = Period.ofMonths(7);// 7 ayda bir tekrarlayan period
        System.out.println("period7Ay = " + period7Ay);//period7Ay = P7M
        Period periodX = Period.ofMonths(7).ofDays(21);
        // Period'da coklu tanimlamada sondaki baz alinir, digerleri ezilir.

        System.out.println("periodX = " + periodX);//periodX = P21D

        System.out.println();
        bugun = bugun.plus(period5Gun);//5 gunluk period eklendi.
        System.out.println("bugun = " + bugun);//bugun = 2022-10-31
        bugun = bugun.minus(period7Ay);//bugune 7aylik periad geri gidildi
        System.out.println("bugun = " + bugun);//bugun = 2022-03-31
        bugun = bugun.plus(periodX);
        System.out.println("bugun = " + periodX);//bugun = P21D

// TASK: 5.9.2022'de baslayan kurs 9 ay olduguna gore kursun bitis tarihini print eden cod yaziniz.
        System.out.println("   *** TASK ***   ");
        LocalDate kursBaslangic = LocalDate.of(2022, 9, 05);
        System.out.println("kursBaslangic = " + kursBaslangic);//kursBaslangic = 2022-09-05
        Period period9Ay = Period.ofMonths(9);
        System.out.println("kursBaslangic.plus(period9Ay) = " + kursBaslangic.plus(period9Ay));//kursBaslangic.plus(period9Ay) = 2023-06-05
        System.out.println("Kurs bitis = " + kursBaslangic.plus(period9Ay).format(DateTimeFormatter.ISO_DATE));
//Kurs bitis = 2023-06-05
//ISO: International Organization for Standardization
    }
}