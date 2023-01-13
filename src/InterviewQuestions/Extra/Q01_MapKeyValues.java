package InterviewQuestions.Extra;

import java.util.HashMap;
import java.util.Map;

//5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
//5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
//5 tane ulke ismi yazdırıyoruz. (keyset())
//5 tane ulke nufusunu yazdırıyoruz. (values())
//nüfusların toplamını yazdırın.
//kaç tane 50 milyondan fazla nüfuslu ülke var?
// ulke ve nufus  lari hem map gibi..hem de ayri ayri yazdirma ?
public class Q01_MapKeyValues {
    public static void main(String[] args) {

        HashMap<String, Integer> ulke = new HashMap<>();
        ulke.put("Almanya", 80);
        ulke.put("Turkiye", 85);
        ulke.put("Amerika", 250);
        ulke.put("Fransa", 70);
        ulke.put("Kanada", 40);

        System.out.println("ulke isimlri ve nufuslari: \n" + ulke + " milyondur");
//ulke isimlri ve nufuslari:
//{Turkiye=85, Fransa=70, Kanada=40, Almanya=80, Amerika=250} milyondur

        System.out.println("Ulke isimleri: " + ulke.keySet());
//Ulke isimleri: [Turkiye, Fransa, Kanada, Almanya, Amerika]

        System.out.println("Ulke nufuslari: " + ulke.values());
//Ulke nufuslari: [85, 70, 40, 80, 250]


        int ellidenBuyukUlkeSayisi = 0;

        for (Integer w : ulke.values()) {
            if (w > 50) {
                ellidenBuyukUlkeSayisi++;
            }
        }
        System.out.println("Nufusu 50M'dan fazla ulke sayisi: " + ellidenBuyukUlkeSayisi);
//Nufusu 50M'dan fazla ulke sayisi: 4

        int toplam = 0;
        for (Integer s : ulke.values()) {
            toplam += s;
        }
        System.out.println("Ulke nufuslarinin toplami: " + toplam);
//Ulke nufuslarinin toplami: 525

        for (Map.Entry<String, Integer> siralama : ulke.entrySet()) {
            System.out.println(siralama);
        /*
        Turkiye=85
Fransa=70
Kanada=40
Almanya=80
Amerika=250
         */
        }
        for (String ulkeSira : ulke.keySet()) {
            System.out.println(ulkeSira);
/*
Turkiye
Fransa
Kanada
Almanya
Amerika
 */
        }
        for (Integer ulkeNufus : ulke.values()) {
            System.out.println(ulkeNufus);
        }
/*
85
70
40
80
250
 */
    }
}