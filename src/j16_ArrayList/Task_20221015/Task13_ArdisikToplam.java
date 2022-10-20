package j16_ArrayList.Task_20221015;

import java.util.ArrayList;

public class Task13_ArdisikToplam {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {
        Integer arrSayi[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        ArrayList<Integer> listSayi = new ArrayList<>();

        int bas = 0;
        for (int i = 0; i < arrSayi.length; i++) {
            int sayac = 0;
            int toplam = 0;
            for (int j = i; j < ((i + bas) < arrSayi.length - 1 ? i + bas : arrSayi.length - 1); j++) {
                toplam += arrSayi[j];
                sayac++;
            }
            listSayi.add(toplam);
            bas++;
            i += sayac;
        }
        System.out.println("listSayi = " + listSayi);
    }
}