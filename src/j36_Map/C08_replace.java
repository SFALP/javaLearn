package j36_Map;

import java.util.HashMap;

public class C08_replace {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
//map.replace(); --> Girilen value degeri ilgili Key'de update edilir.


        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple Store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

// map sout komutuna parametre olarak print edilir.
        System.out.println("hm = " + hm);//hm = {Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}

        System.out.println("hm.replace(\"Amazon\",\"314 Euro\") = " + hm.replace("Amazon", "314 Euro"));
//hm.replace("Amazon","314 Euro") = 296 Euro
        System.out.println("Update sonrasi hm = " + hm);
//Update sonrasi hm = {Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Amazon=314 Euro, Vatan=111 Euro}

        System.out.println("hm.replace(\"sefil\",\"Haluk\") = " + hm.replace("sefil", "Haluk"));//olmayan Key icin null return eder
//hm.replace("sefil","Haluk") = null

    }
}
