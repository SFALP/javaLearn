package j36_Map;

import java.util.HashMap;

public class C09_getOrDefault {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
//map.getOrDefault(); --> Girilen Key, map'de varsa Key'e ait value, yoksa default deger return eder.


        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple Store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

// map sout komutuna parametre olarak print edilir.
        System.out.println("hm = " + hm);//hm = {Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}

        System.out.println("hm.getOrDefault(\"Ebay\",\"ebikGabik\") = " + hm.getOrDefault("Ebay", "ebikGabik"));
//hm.getOrDefault("Ebay","ebikGabik") = 234 Euro
//Ebay Key map'de var oldugu icin Ebay key'e ait value: 234 Euro return edildi.

        System.out.println("hm.getOrDefault(\"ebik\",\"gabik\") = " + hm.getOrDefault("ebik", "gabik"));
//hm.getOrDefault("ebik","gabik") = gabik
        System.out.println("Ara goruntuleme icin hm = " + hm);
//Ara goruntuleme icin hm = {Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}

// ebik bu map'de olmadigi icin bu key'de default deger olarak gabik atanip return edildi.

        System.out.println("Son durumda hm = " + hm);
//Son durumda hm = {Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}
    }
}