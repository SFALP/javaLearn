package j16_ArrayList.Task_20221015;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task10_ElemanTekrarsizYaz {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
        ArrayList<Integer> sayi = new ArrayList<>(List.of(1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1));
        ArrayList<Integer> tekrarsizSayi = new ArrayList<>();
        for (int i = 0; i < sayi.size(); i++) {
            if (!tekrarsizSayi.contains(sayi.get(i))) {
                tekrarsizSayi.add(sayi.get(i));
            }
        }
        Collections.sort(tekrarsizSayi);
        System.out.println("tekrarsizSayi = " + tekrarsizSayi);
    }
}