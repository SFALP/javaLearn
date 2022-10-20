package j15_Arrays.Odev_20221013;

import java.util.Arrays;

public class _09_array_second_max {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */
int sayi[]={15,25,22,18,30};
        System.out.println("Olusturulan array: "+ Arrays.toString(sayi));
        Arrays.sort(sayi);
        System.out.println("Ascending array: "+Arrays.toString(sayi));
        System.out.println("Arrayin en buyuk 2. elemani: "+sayi[sayi.length-2]);
    }
}