package j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {

        // Array copy... copyOfArray (arr,newLength);-> girilen arrayin newLength kadar ilk elemanini kopyalar.

        int sayi[]={63,21,47,27,35,12,36,31,46,24};

        int yeniArr[]= Arrays.copyOf(sayi,5);// yeni array 5 uzunlugunda oldu.

        System.out.println("sayi arr'den 5 eleman kopyalama islemi yeni arr: "+Arrays.toString(yeniArr));//[63, 21, 47, 27, 35] yazar, ilk 5 alinir.
//Aralik kopyalamak icin copyOfRange kullanilir.
int baskaArr[]=Arrays.copyOfRange(sayi,3,8);// 3 dahil 8 haric olan indexler kopyalanir.
        // Bu sekilde baskaArr isimli arrayin elemanlari oluşturulur.
        System.out.println("sayi isimli Array'den kopyalanarak olusturulan baskaArr isimli arrayin elemanlar: "+Arrays.toString(baskaArr));//[27, 35, 12, 36, 31]

// Array'i belirli bir eleman ile update(set) etme aksiyonu için fill() isimli Method kullanilir. Icine bir array bir index alinarak yapilir.
Arrays.fill(sayi,99);//sayi arrayinin tum degerlerini 99'da atar.
        System.out.println("Sayi isimli Array'in 99'a fullenmis hali: "+Arrays.toString(sayi));//

        // Belli bir araliktaki elemanlari sabit bir sayiya atamak icin:
        Arrays.fill(sayi,3,7,33);//Bunun anlami: sayi array'inin 3. 4. 5. ve 6. indexlerini 33'le sabitle anlamina gelir.
        System.out.println(Arrays.toString(sayi));//[99, 99, 99, 33, 33, 33, 33, 99, 99, 99]


    }
}
