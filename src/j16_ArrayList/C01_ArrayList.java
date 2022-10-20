package j16_ArrayList;
/*
     Array List genel Tanimi:
​
            ArrayList<Type> arrayListName = new ArrayList<Type>();
            List<Type> arrayListName = new ArrayList<>();
​
             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde Class olmalidir
                - ArrayList<int> hatali bir tanimlamadir. Type Wrapper class dedigimiz object türünden olmalidir
                - primitive'lerin wrapper classlari Büyük harflar baslayan isimleridir
                - int'n wrapper class'i        --> Integer'dir
                - double'un wrapper class'i    --> Double'dir. vs...
​
            2.  - Arrayler tanimlanirken sabit bir .length;'de tanimlanir ve bu length degistirilemez
                - ArrayList'ler tanimlamada .size(); belirmeme zorunlulugu yoktur degistirilebilir.
            3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.
​
    List declarations(tanımlama) :
    Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
     eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.
​
​
    key word: List<Wrapper Class> name=
​
    List'e assaign etme(atama) :
    List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
    List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
    List<wrapper Class> name = new ArrayList<>() *****doğru
    List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru->best practice
    ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru
​
    List'e ilk değer atama (initialize):....
    1.yol : asList();
    ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
    2.yol : Listof();
    ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );
​
    ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
    Array'ler Arrayy.toString(arrayAdi); ile yazdirilabilir.
​
​
    Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.
​
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {

        int sayi = 33;//tek bir data saklayabilen variable
        int sayi1[] = new int[5];// 5 intiger deger saklayabilen yapi
        int sayi2[][] = new int[5][6];// 30 intiger deger saklayabilen yapi
        ArrayList<Integer> sayiList = new ArrayList<>();//istenildigi kadar int deger saklanabilen yapi

        //list create etme ve atama -->>
        ArrayList<Integer> listSayi = new ArrayList<>();//bos integer type list olusturuldu.
//1.yol-> .add() methodu
        System.out.println("listSayi = " + listSayi);//listSayi = []
        listSayi.add(10);//List ilk eleman olarak 10 degeri eklendi.
        System.out.println("listSayi = " + listSayi);//listSayi = [10]
        listSayi.add(39);
        listSayi.add(72);
        listSayi.add(61);
        listSayi.add(41);
        listSayi.add(41);// list eleman tekrarini kabul eder, uniq degildir.
        System.out.println("listSayi = " + listSayi);//listSayi = [10, 39, 72, 61, 41, 41]

// 2.yol-> Arrays.asList(); methodu
        ArrayList<String> listIsim = new ArrayList<>(Arrays.asList("Muharrem", "Nur", "Enise", "Fatih"));
        System.out.println("listIsim = " + listIsim);//listIsim = [Muharrem, Nur, Enise, Fatih]

//3.yol-> List.of(); method
        ArrayList<String> listUlke = new ArrayList<>(List.of("Almanya", "Amerika", "Japonya", "Turkiye", "Kanada", "Ingiltere"));
        listSayi.add(2, 14);// listSayi'da 2.index'e 14 elemanşini ekledi. Eklemeden once 2.indexte yer alan eleman,
        // 14 elemani 2'ye eklendikten sonra 3.index yerine kaydirilir.
        System.out.println("listSayi = " + listSayi);//listSayi = [10, 39, 14, 72, 61, 41, 41]


    }
}
