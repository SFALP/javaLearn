package j35Collection.C02_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
return tipi arraylist olmalı.
ÖRNEĞİN:
İlk Hashset : "Germany" , "England" , "South Africa" , "Brazil" , "USA"
İkinci  hashset  : "Germany" , "China" , "Brazil" , "France" ,  "USA"
Ortak değerleri ArrayListe ekleyiniz.
çıktı:  "Germany" , "Brazil" ,"USA"
ArrayListi yazdırınız.
 */
public class C04_Task03 {
    public static void main(String[] args) {


        HashSet<String> hs1 = new HashSet<>(Arrays.asList("Germany", "England", "South Africa", "Brazil", "Turkiye"));
        HashSet<String> hs2 = new HashSet<>(Arrays.asList("Germany", "Turkiye", "Brazil", "France", "USA"));

        System.out.println("commonValues(hs1,hs2) = " + commonValues(hs1, hs2));//commonValues(hs1,hs2) = [Turkiye, Brazil, Germany]

    }//main sonu

    public static ArrayList<String> commonValues(HashSet<String> hs1, HashSet<String> hs2) {
    hs1.retainAll(hs2);//hs1 ve hs2 kesisen ortak elemanlar hs1'e atandi.
        ArrayList<String> arrList=new ArrayList<>(hs1);//ortak elemanlardan olusan hs1 arrayList'e atandi.

        return arrList;
    }
}