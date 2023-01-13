package InterviewQuestions.Day03_221121;

import java.util.ArrayList;
import java.util.Arrays;

/*
Problem Tanımı :
getSum isminde bir method oluşturun.
Parametresi ArrayList'tir.
Dizideki tüm $ ları kaldır ve tüm sayıları topla
return yaptğımız veri tipi 'int' olmalıdır.
sonuç 0'dan küçükse, -1 yazdırın.

Örnek1:
ArrayList = $13, $15, $20
Cevap = 48 olmalı

Örnek 2 :
ArrayList= $-13, $0, $0
Cevap = -1 olmalı.
 */
public class Q05_SpecialCharRemoveArray {
    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList("$13", "$15", "$20"));
        ArrayList<String> arrList2 = new ArrayList<>(Arrays.asList("-$13", "$0", "$0"));
        System.out.println("ArrList elemanlarinin toplami: " + getSum(arrList));
        System.out.println("ArrList2 elemanlarinin toplami: " + getSum(arrList2));
    }

    public static int getSum(ArrayList<String> arrList) {
        int toplam = 0;
        for (String e : arrList) {
            String str = e.replaceAll("\\$", "");
            toplam += Integer.parseInt(str);
        }
        if (toplam < 0) {
            return -1;
        } else return toplam;

    }
}
