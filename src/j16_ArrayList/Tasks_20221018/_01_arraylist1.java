package j16_ArrayList.Tasks_20221018;

import java.util.ArrayList;
import java.util.List;

public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {
        System.out.println("Count = "+getCount());
    }
    public static Integer getCount(){
        int say=0;
        String meyve="Orange";
        ArrayList<String> listMeyve= new ArrayList<>(List.of("Orange", "Kiwi", "Peach", "Banana", "Orange"));
        for (int i = 0; i < listMeyve.size(); i++) {

            if (listMeyve.get(i) == meyve ) {
                say++;
            }
        }
        return say;
    }
}