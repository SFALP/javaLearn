package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
Scanner scan= new Scanner(System.in);
        System.out.println("Günde ortalama kaç saat uyumaktasınız? ");
        int s= scan.nextInt();
        System.out.println("Aylık uyku süreniz "+ ((s*30)/24)+" gündür.(Not: Ayın 30 gün olduğu kabul edilmiştir)");
        System.out.println("Yılda " +(((s*30)/24)*12) +" gün uyumaktasınız.(Yıl 360 gün üzerinden hesaplanmıştır.)");
        System.out.println("40 yılda " +((((s*30)/24)*12)*40) +" gün uyumaktasınız");
        System.out.println("Teşekkürler :)");

    }
}
