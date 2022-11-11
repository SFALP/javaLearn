package Practice_.Day09_221018;

import java.util.ArrayList;
import java.util.List;

public class Q09_Arraylist_ArrayIciElemanDegistirme {
    /*
     If the list has 12 as element, change all 12s to 21
     Example: (12, 11, 12, 15, 12, 34, 43) ==> Output is (21, 11, 21, 15, 21, 34, 43)
 */
    public static void main(String[] args) {


        ArrayList<Integer> listSayi = new ArrayList<>(List.of(12, 11, 12, 15, 12, 34, 43));
        System.out.println("Mevcut listSayi = " + listSayi);
        for (int i = 0; i < listSayi.size(); i++) {
            if (listSayi.get(i)==12){
                listSayi.set(listSayi.indexOf(12),21);
            }
        }
        System.out.println("listSayi = " + listSayi);
    }
}