package j36_Map;
// task -> urun fiyatları toplamını hesaplayan code create ediniz..

import java.util.HashMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Amazon", 296);
        map.put("Ebay", 301);
        map.put("Saturn", 326);
        map.put("MediaMarkt", 340);
        map.put("Apple Store", 320);
        int fiyatToplam = 0;
        for (Map.Entry<String, Integer> a : map.entrySet()) {//["Amazon"=296, "Ebay"=301 ....]
            fiyatToplam += a.getValue();
        }
        System.out.println("Fiyat Toplam = " + fiyatToplam);//Fiyat Toplam = 1583
        System.out.println();
int fiyatToplam2=0;
        System.out.println("2.YOL");
        for (Integer w:map.values()) {
            fiyatToplam2+=w;
        }
 
 
        System.out.println("Fiyat Toplam2 = " + fiyatToplam2);//Fiyat Toplam2 = 1583
    }
}