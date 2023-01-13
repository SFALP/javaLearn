package j36_Map;

import java.util.HashMap;

public class C06_putAll {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
//map.putAll(map1); --> Girilen map'i, istenen map'e ekler.

        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple Store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

// map sout komutuna parametre olarak print edilir.
        System.out.println("hm = " + hm);//hm = {Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}

// Map'lerin parantezi suslu olur.
        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("Kofteci Yusuf", "Kaburga Izgara");
        hm1.put("starbucks", "flat White");
        hm1.put("Gulluoglu", "Cennet Camuru");
        hm1.put("Nusret", "Dana Spagetti");
        hm1.put("Clarusway", "bolcana offer");
        hm1.put("JavaCAN", "JavaNAZ");

        System.out.println("hm1 = " + hm1);
//hm1 = {starbucks=flat White, JavaCAN=JavaNAZ, Clarusway=bolcana offer, Nusret=Dana Spagetti,
// Kofteci Yusuf=Kaburga Izgara, Gulluoglu=Cennet Camuru}

        hm.putAll(hm1);//ekleme islemi yapildi
        System.out.println("hm = " + hm);
//hm = {starbucks=flat White, Apple Store=333 Euro, JavaCAN=JavaNAZ, Saturn=300 Euro, Clarusway=bolcana offer,
// Ebay=234 Euro, Nusret=Dana Spagetti, MediaMarkt=183 Euro, Kofteci Yusuf=Kaburga Izgara, Amazon=296 Euro,
// Gulluoglu=Cennet Camuru, Vatan=111 Euro}

        System.out.println("hm1 = " + hm1);
//hm1 = {starbucks=flat White, JavaCAN=JavaNAZ, Clarusway=bolcana offer, Nusret=Dana Spagetti, Kofteci Yusuf=Kaburga Izgara, Gulluoglu=Cennet Camuru}

        System.out.println();
        System.out.println("2.YOL - Cincik Kod");
HashMap<String, String> hm2=new HashMap<>(hm1);//hm2 map tanimlandi hem de entry olarak hm1 parametre olarak entry atandi
        System.out.println("hm2 = " + hm2);
//hm2 = {starbucks=flat White, JavaCAN=JavaNAZ, Clarusway=bolcana offer, Nusret=Dana Spagetti, Kofteci Yusuf=Kaburga Izgara, Gulluoglu=Cennet Camuru}
    }
}