package j35Collection.C02_Set;

import java.util.*;

public class C02_Task01 {
    public static void main(String[] args) {
/*TASK-->
Deger atamasi yapilan array'i, arraylist'e ceviren method creat ediniz
main icerisinde methodun return ettigi arraylist'i HashSet, LinkedHashSet ve TreeSet'e atayiniz.
 */
        String arr[] = {"Muharrem", "Umit", "Sinan", "Nihan"};
//        arrayListeCevir(arr);

        HashSet<String> hs = new HashSet<>(arrayListeCevir(arr));

        LinkedHashSet<String> lhs = new LinkedHashSet<>(arrayListeCevir(arr));

        TreeSet<String> ts = new TreeSet<>(arrayListeCevir(arr));

        System.out.println("Hurra Set(hs) = " + hs);//[Muharrem, Sinan, Nihan, Umit]
        System.out.println("Erken gelen girer set(lhs) = " + lhs);//[Muharrem, Umit, Sinan, Nihan]
        System.out.println("Alfabetik sira test(ts) = " + ts);//[Muharrem, Nihan, Sinan, Umit]

    }//main sonu

    public static ArrayList<String> arrayListeCevir(String[] arr) {
        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));

        return arrList;
    }
}