package j15_Arrays.Odev_20221013;

import java.util.Arrays;

public class _18_2d_array2 {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.
         */
        int sayi[][] = {{5, 2, 1}, {10, 2, 3, 6}, {1, 2}};
        System.out.println("Olusturulan array: " + Arrays.deepToString(sayi));
        int toplam = 0;
        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[i].length; j++) {
                toplam += sayi[i][j];
            }
        }
        System.out.println("Array elemanlarinin toplami: "+toplam);

    }
}