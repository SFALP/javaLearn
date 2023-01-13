package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        /*
        Task ->
         Key:isim ,email,adres,telefon
         Key''lere ait valueleri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan
         farklı bir map tanımlayıp
         print eden code create ediniz
         */
        HashMap<String, String> kartvizitMap1=new HashMap<>();
        kartvizitMap1.put("Isim","Semih");
        kartvizitMap1.put("Mail","semihatti@nobetci.golcu");
        kartvizitMap1.put("Adres","Hirvatistan");
        kartvizitMap1.put("Telefon","120+1");
        System.out.println("kartvizitMap1 = " + kartvizitMap1);
//kartvizitMap1 = {Adres =Hirvatistan, Mail=semihatti@nobetci.golcu, Isim=Semih, Telefon=120+1}

        HashMap<String, String> kartvizitMap2=new HashMap<>();
        kartvizitMap2.put("Isim","Irem");
        kartvizitMap2.put("Mail","irem@tulay.zerrin");
        kartvizitMap2.put("Adres","YalanDunya");
        kartvizitMap2.put("Telefon","90");
        System.out.println("kartvizitMap2 = " + kartvizitMap2);
//kartvizitMap2 = {Adres =YalanDunya, Mail=irem@tulay.zerrin, Isim=Irem, Telefon=90}

        System.out.println("kartvizitMap1.get(\"Isim\") = " + kartvizitMap1.get("Isim"));
//kartvizitMap1.get("Isim") = Semih
        System.out.println("kartvizitMap2.get(\"Adres\") = " + kartvizitMap2.get("Adres"));
//kartvizitMap2.get("Adres") = YalanDunya

        Map<String, Map<String,String>> doppelKartvizit=new HashMap<>();

        System.out.println("doppelKartvizit.put(\"Semih\",kartvizitMap1) = " + doppelKartvizit.put("Semih", kartvizitMap1));
// doppelKartvizit.put("Semih",kartvizitMap1) = null
        System.out.println("doppelKartvizit.put(\"Irem\",kartvizitMap2) = " + doppelKartvizit.put("Irem", kartvizitMap2));
//doppelKartvizit.put("Irem",kartvizitMap2) = null

        System.out.println("doppelKartvizit = " + doppelKartvizit);
//doppelKartvizit = {Irem={Mail=irem@tulay.zerrin, Isim=Irem, Telefon=90, Adres=YalanDunya},
// Semih={Mail=semihatti@nobetci.golcu, Isim=Semih, Telefon=120+1, Adres=Hirvatistan}}
        System.out.println("doppelKartvizit.get(\"Semih\").get(\"Telefon\") = " + doppelKartvizit.get("Semih").get("Telefon"));
//doppelKartvizit.get("Semih").get("Telefon") = 120+1

        Map<Integer, Task02_Kartvizit> kart=new HashMap<>();

        Task02_Kartvizit k1=new Task02_Kartvizit("Enise","enise@qatester.com","ABC Company","1907");
kart.put(k1.id, k1);
        System.out.println("kart = " + kart);
//kart = {100=Isim='Enise', Mail='enise@qatester.com', Adres='ABC Company', Telefon='1907'}

        System.out.println("kart.get(k1.id) = " + kart.get(k1.id));//k1.id key values:
//kart.get(k1.id) = Isim='Enise', Mail='enise@qatester.com', Adres='ABC Company', Telefon='1907'
        System.out.println("kart.get(101) = " + kart.get(101));//101 key values:
//kart.get(101) = null
    }
}


//semihMap.get(isim) = Semih Nerde
//        semihMap.get(telefon) = 0 532 230000
//        ismailKartvizit.get(isim) = İsmail Demir
//        ismailKartvizit.get(telefon) = 0 546 450000
//        semih in telefonu = 0 532 230000
//        ismail in bilgileri = {telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}
//        kartvizitler = {ismail={telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}, semih={telefon=0 532 230000, adres=Frkanfurt/Almanya, email=Semih@hotmail.com, isim=Semih Nerde}}
