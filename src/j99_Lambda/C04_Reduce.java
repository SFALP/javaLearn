package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
kullanımı yaygındır pratiktir.
Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

*/
public class C04_Reduce {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 59, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
//Lambda'nin diger adi--> Stream API olarak da anilir.
        List<Integer> sayi2 = new ArrayList<>(Arrays.asList(1, 3, 5));
        List<Integer> sayi3 = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 6, 12, 8));

        System.out.println("\n   ***    ");
        ciftKareMaxPrint1(sayi);//Optional[4356]
        System.out.println("\n   ***    ");
        ciftKareMaxPrint1(sayi2);//Optional.empty
        System.out.println("\n   ***    ");
        listElemanTopla(sayi);//Listin elemanlari toplami: Optional[636]
        System.out.println("\n   ***    ");
        ciftElemanCarpPrint(sayi3);//List'in cift elemanlarinin carpimi: Optional[2304]
//        Lambda expression: 2304
        System.out.println("\n   ***    ");
        minBul(sayi);
/*
1.YOL--> Min sayi: Optional[3]
2.YOL--> Min sayi: Optional[3]
3.YOL--> Min sayi: Optional[3]
4.YOL->(Lambda Expression) Min sayi: 3
 */
        System.out.println("\n   ***    ");
yirmidortBuyukEnKucukTekSayiPrint(sayi);//24'ten buyuk olan en kucuk tek sayi: Optional[25]
        System.out.println("\n   ***    ");



    }//main sonu
// TASK: List'in cift elemanlarin karelerinin en buyugunu print ediniz

    public static void ciftKareMaxPrint1(List<Integer> sayi) {
        Optional<Integer> maxEleman = sayi.//sayi elemalari alindi
                stream().//elemanlar akisa sunuldu
                filter(C01_LambdaExpression::ciftMi).//cift elemanlar filtrelendi
                map(t -> t * t).//filtrelenen cift akis elemanlari karesiyle update edildi.
                reduce(Math::max);//cift filtrelenen ve karesi alinan akis elemanlari max elemana gore reduce -->azaltildi.
        // forEach--> Bir akista kullanildigi icin burada kullanilmaz


//Optional<Integer> olmasinin sebebi; NŞA'da maxEleman degerine herhangi bir deger atanmak zorundadir.
//eger yazilan kodd bir deger atanamama ihtimali varsa maxEleman'in tipi, int yerine Optional<Integer> kullanilir.'
//Optional<Integer> Class'i Java tarafindan otomatik atanmistir.

        System.out.println(maxEleman);
        System.out.println();

        System.out.println("2.COZUM--> DIREKT SOUT ICINE DE YAZILABILIR");
        System.out.println(sayi.//sayi elemalari alindi
                stream().//elemanlar akisa sunuldu
                filter(C01_LambdaExpression::ciftMi).//cift elemanlar filtrelendi
                map(t -> t * t).//filtrelenen cift akis elemanlari karesiyle update edildi.
                //reduce(Math::max));
                        reduce(Integer::max));//specific class daha hizli calisir

    }

    // TASK: List'teki tum elemanlarin toplamini yazdiriniz.
    public static void listElemanTopla(List<Integer> sayi) {
        Optional<Integer> toplam = sayi.
                stream().
                reduce(Integer::sum);
        System.out.println("Listin elemanlari toplami: " + toplam);
        System.out.println("2.YOL --> Toplam: " + sayi.
                stream().
                reduce(Integer::sum));//2.YOL --> Toplam: Optional[636]

        System.out.println("Lambda Expression: " + sayi.stream().reduce(0, (a, b) -> a + b));//Lambda Expression: 636
/*
a: ilk degerini her zaman atanan identity degerden alir
b: degerini her zaman stream() akisindan alir.
a ilk degerden sonraki degerlerini action(islem body)'dan alir.
 */

    }

    // TASK:List'deki cift elemanlarin carpimini yaziniz.
    public static void ciftElemanCarpPrint(List<Integer> sayi) {

        System.out.println("List'in cift elemanlarinin carpimi: " + sayi.
                stream().
                filter(C01_LambdaExpression::ciftMi).
                reduce(Math::multiplyExact));//List'in cift elemanlarinin carpimi: Optional[2304]

        System.out.println("Lambda expression: " + sayi.
                stream().
                filter(C01_LambdaExpression::ciftMi).
                reduce(1, (t, u) -> t * u));//Lambda expression: 2304
    }

    //TASK: list'in elemanlarindan en kucugunu 4 farkli yontemle print ediniz.
    public static void minBul(List<Integer> sayi) {
        System.out.println("1.YOL--> Min sayi: " + sayi.stream().reduce(Math::min));//1. yol method referation
    //1.YOL--> Min sayi: Optional[3]
        System.out.println("2.YOL--> Min sayi: " + sayi.stream().reduce(Integer::min));//2. yol method referation
    //2.YOL--> Min sayi: Optional[3]
        System.out.println("3.YOL--> Min sayi: " + sayi.stream().reduce(C04_Reduce::byHalukMinBul));//3.yol->method referation
    //3.YOL--> Min sayi: Optional[3]
        System.out.println("4.YOL->(Lambda Expression) Min sayi: " + sayi.stream().reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u));
    //4.YOL->(Lambda Expression) Min sayi: 3
    }

    public static int byHalukMinBul(int a, int b) {//meth referation icin seed(tohum) method
        return a < b ? a : b;
    }
//TASK: List'teki 24Wten buyuk en kucuk tek sayiyi print ediniz.
    public static void yirmidortBuyukEnKucukTekSayiPrint(List<Integer> sayi){
        System.out.println("24'ten buyuk olan en kucuk tek sayi: "+
                sayi.stream().filter(t -> t % 2 == 1 && t > 24).reduce(Integer::min));
        //24'ten buyuk olan en kucuk tek sayi: Optional[25]
// sayi.stream().filter(t -> t > 24 && C01_LambdaExpression::ciftMi).reduce(Integer::min));//CTE-> Cunku exp. ve meth ref aynı parametrede olamaz
    }


}



