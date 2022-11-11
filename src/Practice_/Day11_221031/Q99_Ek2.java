package Practice_.Day11_221031;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
        Örnek: (12, 31, 15, 32, 54) ==> Çıktı 31 ve 32'tür */

public class Q99_Ek2 {
    public static void main(String[] args) {
        ArrayList<Integer> listSayi = new ArrayList<>(List.of(12, 31, 15, 32, 54));
        Collections.sort(listSayi);
        System.out.println(listSayi);
        ArrayList<Integer> yakinSayi = new ArrayList<>();

        int fark = listSayi.get(1) - listSayi.get(0);

        for (int i = 1; i < listSayi.size() - 1; i++) {
            if (fark > (listSayi.get(i + 1) - listSayi.get(i))) {
                fark = (listSayi.get(i + 1) - listSayi.get(i));
                yakinSayi.add(listSayi.get(i));
                yakinSayi.add(listSayi.get(i + 1));
            }
        }
        System.out.println(yakinSayi);
    }
}