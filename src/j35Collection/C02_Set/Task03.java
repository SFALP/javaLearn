package j35Collection.C02_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
    Task
    totalCount() isminde bir method oluşturun.
    Parametresi  'Integer Hashset' olmalı

    HashSetteki eleman sayısını alın.
    totalCount'u döndürün.
    Örnek:
    hashset ; 4,2,3,1,7
    cevap: 5
     */
public class Task03 {
    public static void main(String[] args) {
        HashSet<Integer> hsInt=new HashSet<>(Arrays.asList(4,2,3,1,7));
        System.out.println("Tanimlanan Hashset: "+hsInt);

        System.out.println("Tanimlanan HashSet'in eleman sayisi: "+totalCount(hsInt));

    }

    public static int totalCount(HashSet<Integer> hsInt) {
            return hsInt.size();
    }
}
    /* F1661-Gulsum COZUMU:
    HashSet<Integer> hs=new HashSet<>(Arrays.asList(4,2,3,1,7));
        System.out.println(totalCount(hs));
    }

    private static int totalCount(HashSet<Integer> hs) {

        return hs.size();

     */

