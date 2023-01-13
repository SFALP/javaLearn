package j99_Lambda;
//sorted() => Doğal düzene göre sıralanmış, bu akışın elemanlarında oluşan bir akış döndürür.
//Sorted() methodu tekrarlı kullanılırsa en son kullanılan aktif olur.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_Sort {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 59, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        System.out.println("\n   ***    ");
        ciftElemanKareAscending(sayi);//256 576 1444 1764 2116 4356
        System.out.println("\n   ***    ");
        listTekKareDescPrint(sayi);//5625 4489 3481 3025 2025 1225 1089 625 49 9


    }//main sonu

//TASK: list'in cift elemanlarinin karelerini kucukten buyuge print ediniz
    public static void ciftElemanKareAscending(List<Integer> sayi) {
        sayi.
                stream().//List elemanlari akisa alind
                filter(C01_LambdaExpression::ciftMi).//akistaki elemanlardan cift olankar filtrelendi
                map(t -> t * t).//filtrelenen cift elemanlar, karesiyle update edildi.
                sorted().//akisdaki karesine update edilen elemanlar siralandi (ASC)
                forEach(C01_LambdaExpression::yazdir);//bu islemler yazdirildi.
    }

//TASK: List'in tek elemanlarinin karelerini buyukten kucuge print ediniz.
    public static void listTekKareDescPrint(List<Integer> sayi){
        sayi.
                stream().//liste akisa alindi
                filter(t->t%2==1).//akisa alinan elemanlardan tek olanlari filtrelendi
                map(t->t*t).// filtrelenen elemanlarin karesi alindi
                sorted(Comparator.reverseOrder()).
                //sorted ile siralandi, sonrasinda Comparator.reverseOrder() method call edilerek tersten sort edildi.
                forEach(C01_LambdaExpression::yazdir);//yazdirildi.
    }

}
