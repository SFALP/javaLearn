package j22_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate javaTag = LocalDate.now();//sistemden bugunun yıl-ay-gun degerini atama yapar.

        System.out.println("javaTag = " + javaTag);//javaTag = 2022-10-25
        System.out.println("javaTag.getYear() = " + javaTag.getYear());//javaTag.getYear() = 2022
        System.out.println("javaTag.getMonthValue() = " + javaTag.getMonthValue());//javaTag.getMonthValue() = 10
        System.out.println("javaTag.getMonth() = " + javaTag.getMonth());//javaTag.getMonth() = OCTOBER
        System.out.println("javaTag.getDayOfYear() = " + javaTag.getDayOfYear());//javaTag.getDayOfYear() = 298
        System.out.println("javaTag.getDayOfMonth() = " + javaTag.getDayOfMonth());//javaTag.getDayOfMonth() = 25
        System.out.println("javaTag.getDayOfWeek() = " + javaTag.getDayOfWeek());//javaTag.getDayOfWeek() = TUESDAY

// OZEL Bir tarihe gitmek icin -->
        LocalDate date1 = LocalDate.of(1923, 10, 29);
        LocalDate date2 = LocalDate.of(1923, Month.OCTOBER, 29);

// Verilen bir tarihin oncesi ve sonrasina nasil gidilir? ---->>>
// (.minus) ile gecmise gidilirken (.plus) ile gelecege gidilir.
        System.out.println();
        System.out.println("date1.plusDays(12) = " + date1.plusDays(12));//date1.plusDays(12) = 1923-11-10
        System.out.println("date2.plusMonths(3) = " + date2.plusMonths(3));//date2.plusMonths(3) = 1924-01-29
        System.out.println("javaTag.plusWeeks(6) = " + javaTag.plusWeeks(6));//javaTag.plusWeeks(6) = 2022-12-06
        System.out.println("javaTag.minusMonths(5) = " + javaTag.minusMonths(5));//javaTag.minusMonths(5) = 2022-05-25
        System.out.println("javaTag.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2) = " + javaTag.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2));
        //javaTag.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2) = 2020-10-28
// 2 ust satirda sirasiyla; bugune 43 gun ekleyip, 2 ay geri gittik, 3 hafta ileri gidip, 2 sene geri gittik.

    }
}