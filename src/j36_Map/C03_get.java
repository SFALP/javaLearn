package j36_Map;

import java.util.HashMap;

public class C03_get {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
//map.get(key); --> Girilen key degerinin value'sini return eder.

        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple Store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

// map sout komutuna parametre olarak print edilir.
        System.out.println("hm = " + hm);

        System.out.println("hm.get(\"Ebay\") = " + hm.get("Ebay"));//hm.get("Ebay") = 234 Euro
        System.out.println("hm.get(\"Haluk\") = " + hm.get("Haluk"));// olmayan bir key tanimlandiginde null return eder.
//hm.get("Haluk") = null

        System.out.println("hm.get(12) = " + hm.get(12));// olmayan bir key tanimlandiginde null return eder.
//hm.get(12) = null. TRICK--Z Key data typ fark etmeksizin, olmayan key icin null return eder.

    }
}
