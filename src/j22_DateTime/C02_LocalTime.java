package j22_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

//      LocalTime--> saat dakika saniye milisaniyetutar.
        LocalTime jetzt=LocalTime.now();//system'den anlik zaman bilgisi atanir.
        System.out.println("jetzt = " + jetzt);//21:42:48.821880900

        System.out.println("jetzt.getHour() = " + jetzt.getHour());//jetzt.getHour() = 21
        System.out.println("jetzt.getMinute() = " + jetzt.getMinute());//jetzt.getMinute() = 44
        System.out.println("jetzt.getNano() = " + jetzt.getNano());//jetzt.getNano() = 639019000
        System.out.println("jetzt.getSecond() = " + jetzt.getSecond());//jetzt.getSecond() = 2

        System.out.println();
// belirli bir zamanda ileri ve geri zamana gidilebilir.
        LocalTime fener=LocalTime.of(19,07,01);// belirli bir saat-dakika-saniyesi olan zaman atandi.
        LocalTime time1=LocalTime.of(13,43,59);

        System.out.println("fener = " + fener);//fener = 19:07:01
        System.out.println("fener.plusMinutes(90) = " + fener.plusMinutes(90));//fener.plusMinutes(90) = 20:37:01
        System.out.println("fener.plusMinutes(150) = " + fener.plusMinutes(150));//fener.plusMinutes(150) = 21:37:01
        System.out.println("fener.minusHours(23) = " + fener.minusHours(23));//fener.minusHours(23) = 20:07:01
        System.out.println("fener.minusMinutes(100).plusHours(2) = " + fener.minusMinutes(100).plusHours(2));
//fener.minusMinutes(100).plusHours(2) = 19:27:01

        System.out.println("\n PERFORMANS TESTI");
        LocalTime forBasi=LocalTime.now();
        System.out.println("forBasi = " + forBasi.getNano());//forBasi = 404941300
        int sayi=0;
        for (int i = 0; i < 100000; i++) {//100.000'e kadar toplama islemi yaptiran for Loop
            sayi+=i;
        }
        LocalTime forSonu=LocalTime.now();
        System.out.println("forSonu = " + forSonu.getNano());//forSonu = 406934100
        System.out.println(forSonu.getNano() - forBasi.getNano());//1992800
    }
}