package j16_ArrayList.Task_20221015;

import java.util.ArrayList;
import java.util.Scanner;

/* TASK :
 Kullanıcıdan alacağınız 6 elemanlı bir dizinin
 sadece tek elemanlarını ayrı diziye bir metodda atayarak
  yazdırınız.

 */
public class Task06_ArraydaTekElemanYaz {
    public static void main(String[] args) {

        int sayiArr[] = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < sayiArr.length; i++) {
            System.out.print("Lutfen arrayin (" + (i + 1) + "). elemani tanimlayiniz: ");
            sayiArr[i] = sc.nextInt();
        }
        System.out.println("tekEleman(sayiArr) = " + tekEleman(sayiArr));

    }//main sonu

    public static ArrayList<Integer> tekEleman(int[] sayiArr) {

        ArrayList<Integer> tekSayilar = new ArrayList<>();//tek sayilarin atanacagi bos list
        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i] % 2 == 1) {//array elemanlarinin tek olma sarti kontrol edildi
                tekSayilar.add(sayiArr[i]);//tek olma sarti saglayan array elemani list'e atandi
            }
        }
        return tekSayilar;
    }
}
