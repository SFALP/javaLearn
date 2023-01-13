package j36_Map;

import java.util.HashMap;

public class C05_clear_size_isEmpty {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
//map.size(); --> Girilen map'in entry (giris: eleman) sayisini return eder.
//map.clear(); --> Girilen map'in tum entry (giris: eleman) siler. Boolean return eder.
//map.isEmpty(); --> Girilen map'in entry (giris: eleman) varligini kontrol eder boolean return eder.

        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple Store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

// map sout komutuna parametre olarak print edilir.
        System.out.println("hm = " + hm);//hm = {Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}
// Map'lerin parantezi suslu olur.

        System.out.println("hm.size() = " + hm.size());//hm.size() = 6
        System.out.println("hm.isEmpty() = " + hm.isEmpty());//hm.isEmpty() = false
        hm.clear();//direkt siler, sout ile calismaz.

        System.out.println("Sildikten sonra hm.size() = " + hm.size());//Sildikten sonra hm.size() = 0
        System.out.println("Sildikten sonra hm.isEmpty() = " + hm.isEmpty());//Sildikten sonra hm.isEmpty() = true

    }
}
