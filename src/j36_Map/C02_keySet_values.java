package j36_Map;

import java.util.HashMap;

public class C02_keySet_values {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
//map.keySet(); --> map key degerlerini set'e atayip return eder.
//map.values(); --> map value degerlerini collection'a atayip return eder.
        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple Store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

// map sout komutuna parametre olarak print edilir.
        System.out.println("hm = " + hm);

        System.out.println("hm.keySet() = " + hm.keySet());//hm.keySet() = [Apple Store, Saturn, Ebay, MediaMarkt, Amazon, Vatan]
        System.out.println("hm.values() = " + hm.values());//hm.values() = [333 Euro, 300 Euro, 234 Euro, 183 Euro, 296 Euro, 111 Euro]
// Koseli paratez varsa collection calisiyordur.

//Task--> hm, key ve value degerlerini satır satır print ediniz.(With loop-for each)

        for (String s: hm.keySet()) {//key
            System.out.println("hm.keySet() = " +s);
        }
        System.out.println();
        for (String w:hm.values()) {//value
            System.out.println("hm.value() = " + w);
        }


    }
}
