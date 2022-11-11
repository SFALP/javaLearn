package j22_DateTime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C05_ZonedDateTime {
    public static void main(String[] args) {
// herhangi bir ulke-sehir--> local tarih ve zaman verisi tutar.
        // Local, parametre olarak tanimlanmalidir.

        LocalDate trhZone1 = LocalDate.now(ZoneId.of("America/New_York"));//America-New York localinin anlik tarih bilgisi tanimlandi.
        LocalDate trhZone2 = LocalDate.now(ZoneId.of("Japan"));//Japan localinin anlik tarih bilgisi tanimlandi.
        LocalDate trhZone3 = LocalDate.now(ZoneId.of("Turkey"));//Turkey localinin anlik tarih bilgisi tanimlandi.


        System.out.println("USA trhZone1 = " + trhZone1);//USA trhZone1 = 2022-10-26
        System.out.println("Japan trhZone2 = " + trhZone2);//Japan trhZone2 = 2022-10-27
        System.out.println("Turkey trhZone3 = " + trhZone3);//Turkey trhZone3 = 2022-10-26

        ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("America/New_York"));
//        ZonedDateTime zdt2=ZonedDateTime.now(ZoneId.of("America"));
//        Birden cok yerel saat olan ulkelerde yerel saat dilimi de tanimlanmalidir. Aksi halde CTE hatasi verir
        ZonedDateTime zdt3 = ZonedDateTime.now(ZoneId.of("Japan"));

        System.out.println("USA NY zdt1 = " + zdt1);//USA NY zdt1 = 2022-10-26T13:47:18.399215500-04:00[America/New_York]
//        System.out.println("USA zdt2 = " + zdt2);
        System.out.println("zdt3 = " + zdt3);//zdt3 = 2022-10-27T02:47:18.399215500+09:00[Japan]

    }
}