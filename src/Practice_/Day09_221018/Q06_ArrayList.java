package Practice_.Day09_221018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
 * not kisa metodlar kullamayiniz
 * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
 */
public class Q06_ArrayList {
    public static void main(String[] args) {
        System.out.println("***** HOCA COZUM*********(for each cozum");

        int arr[] = {2, 5, 8, 78, 12, -4, 11, 0};

        int n = 3;
        //bir liste olusturalim
        List<Integer> list = new ArrayList<>();
        for (Integer each : arr) {
            list.add(each);
        }
        List<Integer> maxList = new ArrayList<>();
        int count = 0;
        while (count < n) {//max liste eklenecek eleman sayisi kontrolu
            int max = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > max) { //listedeki herhangi bir eleman, max dan buyukse
                    max = list.get(i); //o max olsun
                }
            }
            maxList.add(max); //o max degeri maxListe ekle
            list.remove(list.indexOf(max));//ayni buyuk sayi olmamasi icin, bulunan en buyuk sayiyi ilk listten siler
            count++;
        }
        System.out.println("Arrayin ilk " + n + " max degerleri " + maxList);


 System.out.println("**********SORT ILE COZUM ( Soruda sort ile cozum istenmemis) *********");

        int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8};
        Scanner sc = new Scanner(System.in);
        System.out.println("En buyuk sayilar siralasinda ilk kac tanesini goruntulemek istiyorsunuz: ");
        int x = sc.nextInt();

        Arrays.sort(arr2);
        System.out.println("Buyuklukte ilk (" + x + ") siradaki elemanlar: ");
        for (int i = arr2.length - 1; i > (arr2.length - 1 - x); i--) {
            System.out.println(arr2[i]);

        }

    }
}
