package j15_Arrays.Odev_20221013;

import java.util.Arrays;

public class _07_array_max_value {

public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

int sayi[]={12,2,5,15,8};
        System.out.println("Olusturulan array: "+ Arrays.toString(sayi));
    int maxEleman=sayi[0];
        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i]>maxEleman){
                maxEleman=sayi[i];
            }else System.out.println("Array'in en buyuk elemani: "+maxEleman);
        }
        System.out.println("Arrayin en buyuk elemani: "+maxEleman);
    }
}