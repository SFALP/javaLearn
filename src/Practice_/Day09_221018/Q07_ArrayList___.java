package Practice_.Day09_221018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q07_ArrayList___ {
    /*
     * Kullanicidan int  list uzunlugunu isteyin
     * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
     * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
     *
     * n = 5 icin (listin uzunlugu);
     * input { 1 , 2 , 2 , 3 , 4}
     * output {2}
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lutfen arrayin uzunlugunu tanimlayiniz: ");
        int arr[] = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Lutfen arrayin (" + (i + 1) + "). elemanini tanimlayiniz: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Olusturulan array: " + Arrays.toString(arr));
        ArrayList<Integer> yeniList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    yeniList.add(i);
                }
            }
        }
        System.out.println("Array'de tekrarli elemanlar: " + yeniList);

    }
}
