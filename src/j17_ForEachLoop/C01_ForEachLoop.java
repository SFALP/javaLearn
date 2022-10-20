package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {

        /*
        ForEachLoop, For loop'un gelismis halidir.
        Avantajı:
        1- clean code-yani yazım kolayligi
        2- Code okuma kolayligi
        3- Hata yapma riskini azaltir.
         */
        List<Integer> sayiList = new ArrayList<>(List.of(16, 5, 2, 33, 22, 27, 41, 24));
//TASK: List elemanlarini ayri satirlara print ediniz.

        System.out.println("sayiList = " + sayiList);
        for (int i = 0; i < sayiList.size(); i++) {
            System.out.println("sayiList.get(i) = " + sayiList.get(i));
        }

        System.out.println("TASK1*******FOR EACH ILE YAZILIRSA******");
        for (Integer a : sayiList) {
            System.out.println(a + " ");
        }

// TASK2: List elemanlarindan ilk 3 eleman haric tek olan elemanlarini yazdiriniz.
        System.out.println("TASK 2 (FOR EACH)");

        for (Integer a : sayiList.subList(3, sayiList.size())) {
            // ust satirda once avucumuz a ismiyle olusturuldu,
            // sonrasinda sayiList'ten sublist komutuyla ilk 3 eleman cikarildi.( 3'ten basla, sona kadar git)
            if (a % 2 == 1) {
                System.out.println(a);
            }
        }
// TASK 3: List elemanlarinin 2ila 5 index arasindaki elemanlari(2,3,4,5) elemanlarin toplamini print ediniz.
        System.out.println("TASK 3 (FOR EACH)");
        int toplam = 0;
        for (int a : sayiList.subList(2, 6)) {
            toplam += a;
        }
        System.out.println("2-3-4-5. indexte yer alan elemanlarin toplami: " + toplam);
    }
}
