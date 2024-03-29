package j36_Map;

import java.util.HashMap;

public class C10_remove {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
//map.remove(); --> Girilen entry map'de varsa siler ve true return eder, yoksa false doner.
// parametre olarak entry degil, sadece key deger girilirse key varsa siler ve key value'si return eder, yoksa null return eder.

        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple Store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

// map sout komutuna parametre olarak print edilir.
        System.out.println("hm = " + hm);//hm = {Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}
        System.out.println("hm.remove(\"Amazon\",\"296 Euro\") = " + hm.remove("Amazon", "296 Euro"));
//hm.remove("Amazon","296 Euro") = true
        System.out.println("hm.remove(\"Amazon\", \"ebik\") = " + hm.remove("Amazon", "ebik"));
//hm.remove("Amazon", "ebik") = false
        System.out.println("hm.remove(\"Gabik\",\"296 Euro\") = " + hm.remove("Gabik", "296 Euro"));
//hm.remove("Gabik","296 Euro") = false
        System.out.println("hm.remove(\"Ebay\") = " + hm.remove("Ebay"));
//hm.remove("Ebay") = 234 Euro
        System.out.println("hm.remove(\"111 Euro\") = " + hm.remove("111 Euro"));
//hm.remove("111 Euro") = null
    }
}