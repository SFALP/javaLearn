package Practice_.Day11_221031;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
Q02_ZoneDateTime
// Baska ülke veya bolgelerin saat dilimine gore zamani alma
// Asia/Tokyo nun saat dilimine gore saat ?
// zoneId Link :https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
 */
public class Q02_ZoneTime {
    public static void main(String[] args) {
        ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Asia/Tokyo saat = " + zdt);//Asia/Tokyo saat = 2022-11-01T00:19:20.955675500+09:00[Asia/Tokyo]

        DateTimeFormatter form=DateTimeFormatter.ofPattern("dd.MM.yyyy  HH:mm");
        System.out.println("Asia/Tokyo saati formatli = " + zdt.format(form));//Asia/Tokyo saati formatli= 01.11.2022  00:21
        System.out.println(form.format(zdt));// 2.YOL
    }
}