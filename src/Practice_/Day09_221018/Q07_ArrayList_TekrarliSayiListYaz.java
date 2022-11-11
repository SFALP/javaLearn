package Practice_.Day09_221018;

import java.util.ArrayList;
import java.util.Scanner;

public class Q07_ArrayList_TekrarliSayiListYaz {
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
        int x = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            System.out.print("Lutfen arrayin (" + (i + 1) + "). elemanini tanimlayiniz: ");
            list.add(sc.nextInt());
        }
        System.out.println("Olusturulan array: " + list);
        ArrayList<Integer> yeniList = new ArrayList<>();

        System.out.println("Array'de tekrar eden sayilar: " + tekrarliList(list));

    }

    public static ArrayList<Integer> tekrarliList(ArrayList<Integer> list) {
        ArrayList<Integer> listTekrar = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j) && !listTekrar.contains(list.get(i))) {
                    listTekrar.add(list.get(i));
                }
            }
        }
        return listTekrar;
    }
}