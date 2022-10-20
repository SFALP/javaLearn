package j15_Arrays.Odev_20221013;

import java.util.Arrays;

public class _20_Arrayboth_Ends {

    public static void main(String[] args) {

     /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */
        int sayi[]={1,2,3,4,5};
        System.out.println("Olusturulan array: "+Arrays.toString(sayi));
        int yeniArr[]={sayi[0],sayi[sayi.length-1]};
        System.out.println("Yeni array: "+Arrays.toString(yeniArr));
    }
}