package Practice_.Day09_221018;

import java.util.ArrayList;
import java.util.List;

public class Q11_Arrays_ListEksikElemanBul {
    /*
    aşağıdaki örnekte olduğu gibi 1 den 10 a kadar sayılar oluşan dizide eksik olan sayıyı döndüren metodu oluşturunuz.

     ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
    ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
    ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10

     */
    public static void main(String[] args) {
        ArrayList<Integer> list0 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 5, 6, 7, 8, 10, 9));//4 eksik
        ArrayList<Integer> list2 = new ArrayList<>(List.of(7, 2, 3, 10, 5, 9, 1, 4, 8));//6 eksik
        ArrayList<Integer> list3 = new ArrayList<>(List.of(7, 5, 1, 2, 4, 6, 8, 3, 9));//10 eksik

        eksikbul(list0);
        eksikbul(list1);
        eksikbul(list2);
        eksikbul(list3);
    }
    public static void eksikbul(ArrayList<Integer> list0) {
        int list = 55;
        int toplam = 0;
        for (int x : list0) {
            toplam += x;
        }
        if (list - toplam == 0) System.out.println(list0 + " icin eksik eleman bulunmamaktadir");
        else System.out.println(list0 + "\tList'in eksik sayisi: " + (list - toplam));
    }
}