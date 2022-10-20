package j16_ArrayList.Tasks_20221018;

import java.util.ArrayList;
import java.util.List;

public class _07_arraylist7 {

    /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(8, 7, 9, 6, 7));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(6, 7, 12, 3, 1));
        System.out.println("Ikı array'in ortak elemani/lari: " + common_values(arr1, arr2));
    }

    public static ArrayList<Integer> common_values(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> listCommon = new ArrayList<>();
        System.out.println("***** FOR EACH ILE COZUM *****");
        for (int value : arr1) {
            for (int deger : arr2) {
                if (value == deger && !listCommon.contains(value)) {
                    listCommon.add(deger);
                }
            }

        }
        return listCommon;
    }
}
//   System.out.println("***** FOR ILE COZUM ******");// ELEMAN TEKRARI OLMAKTADIR, %100DOGRU DEGILDIR
//   for (int i = 0; i < arr1.size(); i++) {
//       for (int j = 0; j < arr2.size(); j++) {
//           if (arr1.get(i) == arr2.get(j) && !listCommon.contains(j)) {
//               listCommon.add(arr1.get(i));
//           }
//       }
//   }
//   return listCommon;