package j99_Lambda.CodeChallenge_221205;

import java.util.stream.IntStream;

public class C6_Lambdada_ForLoop_Aralik_Kontrolu {

    public static void main(String[] args) {

//S10: 21 den baslayan 7 nin katlarinin tek olanlari ilk 10 teriminin yaziralim
        IntStream.iterate(21,t->t+7).limit(10).forEach(Methods::yazInteger);//21 28 35 42 49 56 63 70 77 84

    }



    // S1:1 den 30 kadar olan sayilari (30 dahil degil) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //range(int startInclusive, int endExclusive)


    //S2:  1 den 30 kadar olan sayilari (30 dahil ) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //rangeClosed(int startInclusive, int endInclusive)


    //S3 Istenen iki deger(dahil) arasindaki sayilari toplayalim ( *** rangeClosed(a,b) ile cozulebilir)


    //S4: 30 ile 40 arasindaki sayilarin (dahil) ortalamasini bulalim (*** average methoduyla cozulebilir)


    //S5: 325 ile 468 arasinda 8 e bolunen kac sayi vardir? (*** rangeClose(a,b). filter().count()-Data type: long  ile cozulebilir )


    //S6: 325 ile 468 arasinda 8 e bolunen sayilari yazdiralim (*** rangeClosed(a,b) filter() forEach() ile cozulebilir)


    // S7:325 ile 468 arasinda 8 e bolunen sayilarin toplamini bulalim (*** rangeClosed(a,b) filter(). sum() ile cozulebilir)


    // S8: 7 ile 15 (dahil) arasindaki tek sayilarin carpimini bulalim (*** rangeClosed(a,b). Methods::tekMi. reduce(1, carpim) ile cozulebilir)


    //S9: pozitif tek sayilarin ilk 10 elemanin yazdiralim (*** IntStream. limit(10).filter(Tek Sayi). forEach(sout) ile cozulebilir)





    //S11: 21 den baslayan 7 nin katlarinin ilk 20 teriminin toplayalim


}
//iterate bize sayilari istedigimiz sekilde yineletmeyi saglar yani buradaki ornekte 7ser7ser artmayi saglar
//iterate icin bir baslangic degeri girilmeli ve artisin nasil olacagi belirtilmeli nerede biteceginide
// limit() ile belirliyoruz