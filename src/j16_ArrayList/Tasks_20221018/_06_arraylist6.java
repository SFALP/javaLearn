package j16_ArrayList.Tasks_20221018;

import java.util.ArrayList;
import java.util.List;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {
        ArrayList<Integer> listArr = new ArrayList<>(List.of(5, 4, 6, 2, 1));
        System.out.println("Istenen kritere Array'de uyan eleman: " + hillNum(listArr));

    }

    public static int hillNum(ArrayList<Integer> listArr) {
        int sayi = 0;
        for (int i = 1; i < listArr.size() - 1; i++) {
            if (listArr.get(i) > listArr.get(i + 1) && listArr.get(i) < listArr.get(i - 1)) {
                sayi = listArr.get(i);
            }
        }
        return sayi;
    }
}