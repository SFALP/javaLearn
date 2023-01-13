package j36_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class C13_TreeMap {
    public static void main(String[] args) {
/*
1- TreeMap, key'lerde null deger tanimlanamaz. Fakat value'larda null deger tanimlanabilir.

2- TreeMap, elemanlarinin key NATURAL ORDER'a gore tanimlar. (Dogal siralama)

 3- TreeMap, synchronized ve tread-safe degildir.

 4- TreeMap en yavas Map turudur. App hizi dusunuldugu icin kullanilirken cok dikkat edilmelidir.

 */
        TreeMap<Integer, String> tm=new TreeMap<>();
        tm.put(102,"Ugur");
        tm.put(101,"Enise");
        tm.put(105,"Kevser");
        tm.put(103,"Fatih");
        tm.put(104,"Emine");
        System.out.println("tm = " + tm);
//tm = {101=Ugur, 102=Enise, 103=Kevser, 104=Fatih, 105=Emine}//key'e gore siralama yapar

 //       tm.put(null,"Fatih");//NullPointerException
        tm.put(104,"Huma");// 104 olan key degeri, Huma value degeriyle update edildi.

        tm.put(106,null);//106 degerini key olarak ekler.
        tm.put(107,null);//107 degerini key olarak ekler.

        System.out.println("tm = " + tm);
//tm = {101=Enise, 102=Ugur, 103=Fatih, 104=Huma, 105=Kevser, 106=null, 107=null}

        HashMap<String, String> hm = new HashMap<>();

        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple Store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

// map sout komutuna parametre olarak print edilir.
        System.out.println("hm = " + hm);

        TreeMap<String, String> tm1=new TreeMap<>(hm);// hm, TreeMap'e atandarak convert edildi.
//        TreeMap<String, String> tm2=hm;// CTE--> DataType miss-Macht
        System.out.println("tm1 = " + tm1);
//tm1 = {Amazon=296 Euro, Apple Store=333 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Saturn=300 Euro, Vatan=111 Euro}

        tm.ceilingKey(103);// method parametre olarak girilen Key deger Map'de varsa return eder,
//        yoksaparametreden buyuk olan en kucuk Key degerini return eder.

// parametre Map'de yoksa ve parametreden buyuk en kucuk key'de yoksa null return eder.
// ceilingKey(key)--> en kucuk abi abla olarak da tanimlanabilir.

        System.out.println("tm.ceilingKey(103) = " + tm.ceilingKey(103));//tm.ceilingKey(103) = 103
        System.out.println("tm.ceilingKey(109) = " + tm.ceilingKey(109));//tm.ceilingKey(109) = null
        System.out.println("tm.ceilingKey(100) = " + tm.ceilingKey(100));//tm.ceilingKey(100) = 101

//Ascending--> Artan siralama.
//Descending--> Azalan siralama.

        System.out.println("tm.descendingKeySet() = " + tm.descendingKeySet());
//tm.descendingKeySet() = [107, 106, 105, 104, 103, 102, 101]
        System.out.println("tm.keySet() = " + tm.keySet());//
//tm.keySet() = [101, 102, 103, 104, 105, 106, 107]
        System.out.println("tm.firstKey() = " + tm.firstKey());
//tm.firstKey() = 101
        System.out.println("tm.lastKey() = " + tm.lastKey());
//tm.lastKey() = 107


    }
}