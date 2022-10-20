package j15_Arrays.Odev_20221013;

import java.util.Arrays;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*  elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */
        int sayi[] = {25, 30, 30, 35, 100};
        int toplam = 0;

        for (int i = 0; i < sayi.length; i++) {
            toplam += sayi[i];
        }
        System.out.println("Olusturulan array: " + Arrays.toString(sayi));
        System.out.println("Array'in elemanlarinin toplami: " + toplam);
    }
}