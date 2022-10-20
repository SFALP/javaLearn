package j15_Arrays.Odev_20221013;

import java.util.Arrays;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */
        int sayi[] = {14, 19, 5, 21};
        System.out.println("Olusturulan array: " + Arrays.toString(sayi));
        int minEleman = sayi[0];
        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i] < minEleman) {
                minEleman = sayi[i];
            }
        }System.out.println("Arrayin min elemani: " + minEleman);
    }
}