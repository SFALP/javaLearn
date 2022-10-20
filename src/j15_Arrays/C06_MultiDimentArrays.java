package j15_Arrays;

import java.util.Arrays;

/*
      Çok Boyutlu Diziler
Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
 Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
 formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
 matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
 satır ve sütun sayısını girmemiz yeterli olacaktır.
* TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

       * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer array
       *  icerdeki  array'lere  inner array denir
       * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
       *  Array'i ancak tum elemenlari atanarak declare edilmeli
       * 3- Multi dimensional array'de bir elemanin indexi icin
       *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
       */
public class C06_MultiDimentArrays {
    public static void main(String[] args) {
//MultiDimentionalArray(mdArray) tanimlama...

        int arr1[][] = new int[3][5];//3 katli her katta 5 dairesi olan bos bir apartman tanimladik.
// bir sitede 10 dairelik 8 katli 6 apartman var. Nasil array olarak tanimlanir? -- Bu 3 boyutlu Arraydir
// TRICK -->> Arrayi uzunluklariyla tanimlamak icin inner(daire) uzunluklari esit olmalidir.
        int site[][][] = new int[6][8][10];// Distan iceriye dogru yazilir.

// Okul programi yaparsak; 24 kisilik 3 sinif ve 21 kisilik 5 sinif olan okul nasil array olarak tanimlanir? cevap:
        int sinif24[][] = new int[3][24];// once genis kapsamli olan yazilir. 3 bos sinif icinde 24 ogrenci var.
        int sinif21[][] = new int[5][21];// once genis kapsamli olan yazilir. 5 bos sinif icinde 21 ogrenci var.

//MdArray eleman ekleme...

        arr1[2][4] = 35;// 2.kat 4.daire degeri 35 atandi.
        arr1[0][3] = 34;// 0.kat 3.daire degeri 34 atandi.
        System.out.println(arr1[0][3]);//34

        //elemanlari girilerek Array tanimlama...-->>
        int arr[][]={
                {1,2,3}, //0.kat
                {10,20},//1.kat
                {101}//2.kat
        };//3 katli apartman
        //101 elemaninin indexi: arr[2][0]

// MdArray elemanlarini print etme...
        //101 nasil print edilir? -->>
        System.out.println(arr[1]);//[I@19dfb72a yazdirir. Bu referans degeridir.
        // arr[1] bir array oldugu icin dogrudan sout komuyu arr[1]'in referansini verir.
        System.out.println(Arrays.toString(arr[1]));//[10, 20] 1.kati oldugu gibi yazdirir.
        System.out.println(arr[1][0]);//10 direkt yazili elemanin degerini verir.

// Bir Array, toString yapisi olmadan yazdirilmak istenirse refereans no verir. Arrayler toString ile yazdirilir.

        //Arrayîn tumunu yazdirmak icin:
        System.out.println(Arrays.deepToString(arr));//[[1, 2, 3], [10, 20], [101]]
        // arr isimli arrayin tum elemanlari yazdirilmis olur.

        System.out.println(Arrays.toString(arr));//[[I@7e0ea639, [I@19dfb72a, [I@3d24753a] bu kod referansi getirir.

// Multidimensional array'leri yazdirmak icin toString methodu kullanilamz
//  toString methodu outer methodu Stringe cevirir
// outer arrayin icinde inner arrayler oldugundan toString methodunda inner array'lerin
// referans degerlerini yazdirilir

//MultiDimensional Array'lerde istenen bir eleman nasil yazdirilir.


    }
}
