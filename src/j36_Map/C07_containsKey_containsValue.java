package j36_Map;

import java.util.HashMap;

public class C07_containsKey_containsValue {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
//map.containsKey(); --> Girilen Key degerinin map'de varligini kontrol eder, boolean return eder.
//map.containsValue(); --> Girilen value degerinin map'de varligini kontrol eder, boolean return eder.

        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple Store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

// map sout komutuna parametre olarak print edilir.
        System.out.println("hm = " + hm);//hm = {Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}

        System.out.println("hm.containsKey(\"amazon\") = " + hm.containsKey("amazon"));//hm.containsKey("amazon") = false
        System.out.println("hm.containsKey(\"Amazon\") = " + hm.containsKey("Amazon"));//hm.containsKey("Amazon") = true
        System.out.println("hm.containsValue(\"296 Euro\") = " + hm.containsValue("296 Euro"));//hm.containsValue("296 Euro") = true
        System.out.println("hm.containsValue(\"ebikGabik\") = " + hm.containsValue("ebikGabik"));//hm.containsValue("ebikGabik") = false

    }
}