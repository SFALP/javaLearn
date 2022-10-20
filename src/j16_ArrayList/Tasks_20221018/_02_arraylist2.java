package j16_ArrayList.Tasks_20221018;

import java.util.ArrayList;
import java.util.List;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        System.out.println("Array'in elemanlari toplami: " + getSum(arr));
    }

    public static int getSum(ArrayList<Integer> arr) {
        int toplam = 0;
        for (int a : arr) {
            toplam += a;
        }
        return toplam;
    }
}