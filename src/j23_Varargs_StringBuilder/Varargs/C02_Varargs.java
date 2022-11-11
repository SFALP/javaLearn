package j23_Varargs_StringBuilder.Varargs;

import java.lang.reflect.Array;
//TASK1: Verilen array elemanlari toplami print eden METHOD create ediniz.
//TASK2: task1'i varargs ile calisiniz.

public class C02_Varargs {
    public static void main(String[] args) {
/*
arr ve varargs toplam:
 */

        int arr[] = {24, 42, 33, 19, 34, 45, 58, 38};

        System.out.println("arrTopla(arr) = " + arrTopla(arr));//293
        System.out.println("Varargs intiger deger toplam = " + varargsTopla(24,42,33,19,34,45,38,58));//293
        System.out.println("Varargs array deger toplam = " + varargsTopla(arr));//293 Bir ust satirla ayni anlamdadir.

// TRICK: varargs method parametreleri array gibi tanimladigi icin
// varargs methoda parametre olarak array'de verilebilir.




    }//main sonu

    public static int arrTopla(int arr[]) {//TASK1 Cozumu
        int toplam = 0;
        for (int w : arr) {
            toplam += w;
        }
        return toplam;
    }

    public static int varargsTopla(int... b) {
        int toplam = 0;
        for (int s : b) {
            toplam += s;
        }
        return toplam;
    }
}