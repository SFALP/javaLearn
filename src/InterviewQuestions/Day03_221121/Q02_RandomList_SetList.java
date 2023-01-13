package InterviewQuestions.Day03_221121;

import java.util.ArrayList;

// int array list oluşturun 10 elemandan oluşmalı
// random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
// bu metod array list içinde 0' dan 20 ye kadar değer atasın.
// eğer çift sayı atarsa o elemanının yerine 111 yazsın
// eğer çift sayı yoksa çift sayı yoktur mesajını versin.
public class Q02_RandomList_SetList {
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();
        randomEkle(arrList);
    }

    public static void randomEkle(ArrayList<Integer> arrList) {
        for (int i = 0; i < 10; i++) {
            arrList.add((int) (Math.random() * 20));
        }
        System.out.println("Ilk atanan arrList = " + arrList);
        int counter = 0;
        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i) % 2 == 0) {
                counter++;
                arrList.set(i, 111);
            }
        }
        System.out.println("Guncellenen cift sayi adedi: " + counter);
        System.out.println("Duzenlenmis hali: " + arrList);
        if (counter == 0) {
            System.out.println("Cift sayi bulunmamaktadir");
        }
    }
}