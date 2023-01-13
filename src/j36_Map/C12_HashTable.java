package j36_Map;

import java.util.Hashtable;

public class C12_HashTable {
    public static void main(String[] args) {
/*
HashTable--> HashMap'e kullanilan tum method'lar hashTable objesiyle'de call edilir.
1- HashMap ve TreeMap tread-safe ve syncronized olmadigi icin Map'ler arasinda tread-safe ve syncronize olan bir map'e ihtiyac
oldugundan HashTable tanimlanmistir.

2- HashTable, HashMap'e gore daha yavastir.

3- HashTable, key ve valeu'larda null degere izin vermez.

4- HashTable'a eleman atamasi yapilirken HashMap gibi random(rantgele -->hurraa) yapar.
 */
        Hashtable<String, String> ht = new Hashtable<>();//bos HashTable belirlendi.
        ht.put("kebep", "adana");
        ht.put("doner", "sivas");
        ht.put("kofte", "tekirdag");
        ht.put("corba", "beyran");
        ht.put("sogus", "");

        System.out.println("ht = " + ht);//ht = {corba=beyran, doner=sivas, kebep=adana, sogus=, kofte=tekirdag}
        ht.put("doner", "donerse senindir :) ");// bu kod'la doner key update edilir. Key'de dublicate degil uzerine
//deger atamasi yapilir.

        System.out.println("ht = " + ht);//ht = {corba=beyran, doner=donerse senindir :) , kebep=adana, sogus=, kofte=tekirdag}
//ht.put(null,"trilece");// RTE--> NullPointerException
//ht.put("kahve",null);//RTE--> NullPointerException

        System.out.println("Agam selametle devamkeee");

        Hashtable<String, String> ht1= new Hashtable<>();//bos HashTable belirlendi.
        ht1.put("salata", "patlican kozleme");
        ht1.put("ara sicak", "icli kofte");
        System.out.println("ht1 = " + ht1);
//ht1 = {ara sicak=icli kofte, salata=patlican kozleme}

        ht.putAll(ht1);
        System.out.println("ht = " + ht);
//ht = {ara sicak=icli kofte, salata=patlican kozleme, corba=beyran, doner=donerse senindir :) , kebep=adana, sogus=, kofte=tekirdag}
        System.out.println("ht1 = " + ht1);
//ht1 = {ara sicak=icli kofte, salata=patlican kozleme}

    }
}