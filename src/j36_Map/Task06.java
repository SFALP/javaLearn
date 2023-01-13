package j36_Map;

import java.util.HashMap;
import java.util.Scanner;

/*
map1() isminde bir method oluşturun.
Parametresi   bir Integer -String map  ve bir int
return tipi String
Tamsayı değerlerini (int) döndürün.
ÖRNEK:
Map:
                1 ,  "Lion"
                2 ,  "Tiger"
                3 ,  "Elephant"
                4 ,  "Cat"
                5  , "Dog"
Integer 3
Cevap Elephant olmalı.
 */
public class Task06 {
    public static void main(String[] args) {

        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(1, "Lion");
        mp.put(2, "Tiger");
        mp.put(3, "Elephant");
        mp.put(4, "Cat");
        mp.put(5, "Dog");

        Scanner sc=new Scanner(System.in);
        System.out.print("Agam [1-5] arasi sayi tanimlayiver bakalim: ");
        int sayi=sc.nextInt();
        System.out.println("map1(mp,sayi) = " + map1(mp, sayi));

    }

    public static String map1(HashMap<Integer, String> mp, int sayi) {
    String str=mp.get(sayi);//sayi integer oldugu icin KEY degerine karsilik olan value karsimiza gelir.

        return str;//direkt--> return mp.get(sayi) olarak da yazilabilirdi.
    }
}