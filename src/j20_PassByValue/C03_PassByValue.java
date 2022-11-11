package j20_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
/*
Java, non-primitiv(Class-Array-List) data turlerinde obj kendisi degil de
datalari degisirse objenin referans ve kendisi degismedigi icin datalarin
degisikligini kalici yapar.
 */
//Pass by referans istisnadir.

//TASK: list elemanlari 24,20,87 iki farkli method ile list elemanlarini update edip
// print eden code create ediniz.

//1. method-> for each kullansin.
//2. method-> set(index,value) yontemiyle yapsin

        ArrayList<Integer> list = new ArrayList<>(List.of(24, 20, 87));
        System.out.println("Method oncesi list = " + list);

        listUpdate1(list);//bu method'da listin degeri gecici degisiyor
        listUpdate2(list);//bu method'da list set ediliyor

        System.out.println("Method sonrasi list = " + list);
        //Method sonrasi list = [48, 40, 174] -> Bu pass by referans'tir.

    }//main sonu

    public static void listUpdate1(ArrayList<Integer> list) {
        for (Integer v : list) {
            v *= 2;
        }
        System.out.println("list = " + list);
    }

    public static void listUpdate2(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);

        }
        System.out.println("list = " + list);
    }
}
