package j22_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {

        LocalTime gece=LocalTime.of(23,20);
        LocalTime oglen=LocalTime.of(13,30);

        Duration fark=Duration.between(gece,oglen);
        //Buradaki gece-oglen siralamasinin yeri degistikce asagidaki sonuclar eksi veya arti cikabilir.
        System.out.println("fark = " + fark);//fark = PT-9H-50M
        //PT: Periyot anlamindadir. H: Hour, M: Minute

// Fark'i kendimiz isletmek icin;
        System.out.println("fark.getSeconds() = " + fark.getSeconds());//fark.getSeconds() = -35400
        System.out.println("fark.getNano() = " + fark.getNano());//fark.getNano() = 0 (CALISMADI)
        System.out.println("fark.toHours() = " + fark.toHours());//fark.toHours() = -9
        System.out.println("fark.toMinutes() = " + fark.toMinutes());//fark.toMinutes() = -590

    }
}