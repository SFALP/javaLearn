package j16_ArrayList.Task_20221015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*TASK :
2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

 */
public class Task05_ArrayDonusum {
    public static void main(String[] args) {

        String isimArr[][] = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};
        yeniList(isimArr);
    }// main disi

    public static void yeniList(String[][] isimArr) {
        List<String> isimList = new ArrayList<>();//bos list

        for (int i = 0; i < isimArr.length; i++) {//kat kontrolu
            for (int j = 0; j < isimArr[i].length; j++) {//her katin daire kontrolu yapildi
                isimList.add(isimArr[i][j]);//her katin her dairesindeki eleman donguyle alinip bos list'e atandi.
            }
        }
        System.out.println("isimList = " + isimList);//isimList = [Ali, Veli, Ayse, Hasan, Can, Suzan]
        Collections.sort(isimList);//Ascending siralama yapildi.
        System.out.println("Ascending isimList = " + isimList);// AScending isimList = [Ali, Ayse, Can, Hasan, Suzan, Veli]
    }
}