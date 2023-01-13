package j36_Map;

import java.util.HashMap;

public class C11_putIfAbsend {//yoksa ekle komutu

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
//map.putIfAbsend(); --> Girilen Key map'de yoksa entry(key,value) map'e ekler ve null return eder,
// girilen key, map'de varsa key'e ait value return eder.


        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple Store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

// map sout komutuna parametre olarak print edilir.
        System.out.println("hm = " + hm);//hm = {Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}

        System.out.println("hm.putIfAbsent(\"ebik\",\"gabik\") = " + hm.putIfAbsent("ebik", "gabik"));
//hm.putIfAbsent("ebik","gabik") = null
        System.out.println("hm.putIfAbsent(\"Ebay\",\"JavaNAZ\") = " + hm.putIfAbsent("Ebay", "JavaNAZ"));//234 Euro-->
        // Ebay key oldugu icin ebay key'e ait value 234 Euro return edildi.
//hm.putIfAbsent("Ebay","JavaNAZ") = 234 Euro

        System.out.println("hm = " + hm);
//hm = {ebik=gabik, Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}

    }
}
