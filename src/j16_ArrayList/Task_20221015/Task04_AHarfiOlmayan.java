package j16_ArrayList.Task_20221015;

import java.util.ArrayList;
import java.util.Arrays;

/* TASK :

 * Input olarak verilen listteki isimlerden
 * icinde 'a' harfi bulunanlari silen bir code create ediniz.
 *
 * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
 * OUTPUT : [Veli,Omer]
 */
public class Task04_AHarfiOlmayan {
    public static void main(String[] args) {

        ArrayList<String> listIsim=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        ArrayList<String> aOlmayanlistIsim=new ArrayList<>();//bos list

        for (int i = 0; i < listIsim.size(); i++) {

            if (!listIsim.get(i).toLowerCase().contains("a")){//listin her bir elemani a bulundurmuyorsa
aOlmayanlistIsim.add(listIsim.get(i));//yeni list'e a olmayan eleman eklendi.

            }


        }
        System.out.println("aOlmayanlistIsim = " + aOlmayanlistIsim);//[Veli, Omer]
// 2.YOL
        listIsim.clear();//listIsim bosaltıldı
listIsim.addAll(aOlmayanlistIsim);
        System.out.println("listIsim = " + listIsim);//listIsim = [Veli, Omer]

    }
}
