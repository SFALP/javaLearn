package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class C04_entrySet {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
//map.entrySet(); --> Girilen map'in key value tum datalarini Set'e atayip return eder.

        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple Store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

// map sout komutuna parametre olarak print edilir.
        System.out.println("hm = " + hm);
// Map'lerin parantezi suslu olur.

        System.out.println("hm.entrySet() = " + hm.entrySet());// Collection'larin parantezi ise koseli olur.
//hm.entrySet() = [Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro]

        for (Map.Entry<String, String> e:hm.entrySet()) {//entrySet ile gelen key value loop icin Entry<key, value> data type
            System.out.println("e.getValue() = " + e.getValue());
/*
e.getValue() = 333 Euro
e.getValue() = 300 Euro
e.getValue() = 234 Euro
e.getValue() = 183 Euro
e.getValue() = 296 Euro
e.getValue() = 111 Euro

 */
        }

    }
}