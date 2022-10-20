package j16_ArrayList.Task_20221015;

import java.util.ArrayList;
import java.util.List;

public class Task09_ArrKareYaz {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        ArrayList<Integer> sayi = new ArrayList<>(List.of(12, 13, 14, 15, 16));

        double toplam = 0;
        for (int i = 0; i < sayi.size(); i++) {

            toplam += sayi.get(i) * sayi.get(i);
        }
        System.out.println("Tanimlanan list'in karelerinin toplami: " + toplam);
    }
}