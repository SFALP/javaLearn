package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C13_replaceAll_fill {
    public static void main(String[] args) {

        // replaceAll(); listte belirli bir elemani belirli bir deger ile update eder.
        ArrayList<Integer> listSayi=new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));

        System.out.println("replace oncesi listSayi = " + listSayi);//replace oncesi listSayi = [1, 24, 23, 14, 19, 60, 1, 55, 27, 1, 38]

        Collections.replaceAll(listSayi, 1,20);//listSayi'da 1 yerine 20 atandi.
        System.out.println("replace sonrasi listSayi = " + listSayi);
//replace sonrası listSayi = [20, 24, 23, 14, 19, 60, 20, 55, 27, 20, 38]

        // fill(); --> list'te yer alan tum elemanlari belirli bir degerle update eder.

        Collections.fill(listSayi,33);
        System.out.println("fill sonrasi listSayi = " + listSayi);//fill sonrasi listSayi = [33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33]
    }
}