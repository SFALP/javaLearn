package j99_Lambda;

import java.util.OptionalInt;
import java.util.stream.IntStream;

// Stream Iterator = Tekrarli akis
//range(startInclusive,endExclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil)
// endExclusive'e (exclusive) kadar sıralı bir IntStream return eder.

public class C11_StreamIterator {
    public static void main(String[] args) {

        System.out.println("Task01--> Structured(amele): " + toplaAmele(10));//Task01--> Structured(amele): 55
        System.out.println("\n   ***   ");

        System.out.println("Task01--> Functional(cincix): " + toplaCincix(10));//Task01--> Functional(cincix): 55
        System.out.println("\n   ***   ");

        System.out.println("Task02--> Cincix cift topla: " + toplaCift(24));//Task02--> Cincix cift topla: 156
        System.out.println("\n   ***   ");

        System.out.println("Task03--> Cincix ilk 10 cift sayiyi topla: " + toplaIlkXCiftSayi(10));//Task03--> Cincix ilk 10 cift sayiyi topla: 110
        System.out.println("\n   ***   ");

        System.out.println("Task04--> Cincix ilk 10 tek sayiyi topla: " + toplaIlkXTekSayi(10));//Task04--> Cincix ilk 10 tek sayiyi topla: 100
        System.out.println("\n   ***   ");
        System.out.println("Task05-->");//Task05--> 2 4 8 16 32 64 128
        ikininIlkXKuvveti(7);

        System.out.println("\n   ***   ");
        System.out.println("Task06: "+sayininXKuvvetiPrint(3, 5));//Task06: 363

        System.out.println("\n   ***   ");
        System.out.println("Task07: "+faktoryel(6));//Task07: 720

        System.out.println("\n   ***   ");
        System.out.println("Task08: "+istenenSayininXinciKuvvet(7, 5));//Task08: OptionalInt[16807]



    }//main sonu

    //TASK 01 --> Structured Programming(amele) ve Functional Programming(cincix) ile 1'den x'e kadar tamsayilari toplayan bir program create ediniz.
//Structured Programming
    public static int toplaAmele(int x) {
        int toplam = 0;
        for (int i = 0; i <= x; i++) {
            toplam += i;
        }
        return toplam;
    }

    //Cincix code
    public static int toplaCincix(int x) {
        return IntStream.//manuel akis tanimlandi.
                range(1, x + 1).//1 dahil, x+1 haric--> 1,2,3......x int sayilarindan aralik tanimlandi.
                sum();// akisa giren 1,2,3....x tamsayilari toplandi.

    }

    //TASK02: 1'den X'e kadar cift tamsayilari toplayan programi create ediniz
    public static int toplaCift(int x) {
        return IntStream.//manuel akis tanimlandi.
                //range(1, x + 1).//1 dahil, x+1 haric--> 1,2,3......x int sayilarindan aralik tanimlandi.
                        rangeClosed(1, x).//1 dahil, x+1'de dahil. --> 1,2,3......x int sayilarindan olusan aralik tanimlandi.
                        filter(C01_LambdaExpression::ciftMi).//akistaki sayilarin cift olanlari akisa alindi.
                        sum();// akisa giren 1,2,3....x tamsayilari toplandi.

//range ile rangeClosed arasindaki fark: range'de (a,b) b degerini dahil edilmezken, rangeClosed'ta (a,b) b degeri de dahildir.
// range ve rangeClosed'da artis miktari her zaman 1er - 1er'dir.
    }

    //TASK03:Ilk x pozitif cift tam sayiyi toplayan cod create ediniz.
    public static int toplaIlkXCiftSayi(int x) {
        return IntStream.
                iterate(2, t -> t + 2).//once tekrarin baslangic degeri tanimlanir. Bu ornekte bu deger 2'dir.
//sonrasinda ise o sayilarin kac artirilacagi tanimlandi (t+2)--> 2,4,6,8,10,12 ....... Bu tekrar sonsuza gider.
//iterate'de artis miktari kodu yazan kisi tarafindan tanimlanir.
        limit(x).//Bu gidisatin sonrasuza gitmemesi icin de limit tanimlanir. Bu limitin siniri bu ornek icin X'adet sayi kadardir.
//bu ornekte ilk 10 cift sayi ele alinir. 2+4+6+8+10+12+14+16+18+20-->110
        sum();

    }

    //TASK04: Ilk X pozitif tek sayiyi toplayan programi create ediniz.
    public static int toplaIlkXTekSayi(int x) {
        return IntStream.
                iterate(1, t -> t + 2).//once tekrarin baslangic degeri tanimlanir. Bu ornekte bu deger 1'dir.
//sonrasinda ise o sayilarin kac artirilacagi tanimlandi (t+2)--> 1,3,5,7,9,11 ....... Bu tekrar sonsuza gider.
//iterate'de artis miktari kodu yazan kisi tarafindan tanimlanir.
        limit(x).//Bu gidisatin sonrasuza gitmemesi icin de limit tanimlanir. Bu limitin siniri bu ornek icin X'adet sayi kadardir.
//bu ornekte ilk 10 cift sayi ele alinir. 1+3+5+7+9+11+13+15+17+19-->100
        sum();

    }

    // TASK05: 2'nin ilk X kuvvetini ekrana yazdiran code create ediniz.
    public static void ikininIlkXKuvveti(int x) {
        IntStream.
                iterate(2, t -> t * 2).//2'den baslayip 2 ile carpilarak tekrar islemi tanimlandi-> 2,4,8,....
                limit(x).
                forEach(C01_LambdaExpression::yazdir);
    }

//TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
public static int sayininXKuvvetiPrint(int a, int x){
        return IntStream.iterate(a,t->t*a).
                limit(x).sum();
}
//TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.
public static int faktoryel(int x){
        return IntStream.iterate(x,t->t-1).limit(x).reduce(1,(t,u)->t*u);
}



    //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.
    public static OptionalInt istenenSayininXinciKuvvet(int istenenSayi, int x) {
        return IntStream.
                iterate(istenenSayi, t -> t * istenenSayi).//istenenSayi'dan baslayip istenenSayi ile carpilarak tekrar islemi tanimlandi
                limit(x).
                skip(x-1).//akisdaki x'den onceki elemanlar atlandi.
                findFirst();//ilk eleman alindi

    }
}
