package j16_ArrayList.Tasks_20221018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(5, 3, 4, 6, 7));
        System.out.println("En buyuk 2. eleman: " + secondMax(list));

    }

    public static ArrayList<Integer> secondMax(ArrayList<Integer> list) {
        ArrayList<Integer> yeniList = new ArrayList<>();
        int secondmax = 0;
        Collections.sort(list);
        yeniList.add(list.get(list.size() - 2));
        return yeniList;
    }
}