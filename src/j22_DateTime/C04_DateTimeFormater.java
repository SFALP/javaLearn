package j22_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormater {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("ldt = " + ldt);//ldt = 2022-10-25T22:24:46.324159100

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd - MMMM // YY :=)");
        System.out.println("dtf.format(ldt) = " + dtf.format(ldt));
//dtf'de belirlenen format ile ldt degeri yazdirildi. SONUC: dtf.format(ldt) = 25 - Ekim // 22 :=)

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd - MMMM - YYYY ");//gun ay ismi ve yil formati tanimlandi
        System.out.println("dtf1.format(ldt) = " + dtf1.format(ldt));//dtf1.format(ldt) = 25 - Ekim - 2022

        System.out.println();
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm:ss: a");//saat dakika saniye am/pm formati tanimlandi.
        // Pm icin hicbirsey yazmaya gerek yoktur, oglenden sonrasi PM belirtmeden 24 saat formatinda yazar.
        System.out.println("dtf2.format(ldt) = " + dtf2.format(ldt));//dtf2.format(ldt) = 10:24:08: ÖS

/*
format->
GUN
d : basta 0 varsa 0 yazmadan gun numarasi yazılır
dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
DDD : yilin kacinci gunu oldugunu yazar
E, EE, EEE : gun isminin ilk 3 harfi
EEEE : gun isminin tamamini

AY (Ay icin M, dakika icin m kullanilir)
M : basta 0 varsa 0 yazmadan ay numarasi yazılır
MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi yazılır
MMM : Ay isminin ilk 3 harfi yazılır
MMMM : Ay isminin tamami yazılır

YY : yilin son iki rakamini
YYYY : Yilin tamamini yazılır

Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

HH : saatin tamami, tek rakamli saat olursa 02 gibi
H  : tek rakamli saat olursa sadece saati yazar

hh :  12 saat dilimine gore 2 rakam olarak yazılır
h : 12 saat dilimine gore tek rakam olanlari tek olarak yazılır

m : minute tek rakamlari tek yazlır
mm: tek rakamlari 08 gibi yazılır

a yazarsak AM veya PM degerini yazar


*/


    }
}
