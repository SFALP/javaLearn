package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_IsEmpty {
    public static void main(String[] args) {

// isEmpty(); --> Listin bos olmasini kontrol ede true/false return eder.
// clear() --> listin tum elemanlarini siler.
        ArrayList<String> listSehir = new ArrayList<>(List.of("Munih", "LosAngeles", "Londra", "Stockholm", "Istanbul", "Berlin"));
        System.out.println("listSehir = " + listSehir);

        System.out.println("listSehir.isEmpty() = " + listSehir.isEmpty());//listSehir.isEmpty() = false
//--> List boslugu kontrol edildi

        listSehir.clear();//list temizlendi.

        System.out.println("listSehir = " + listSehir);//listSehir = []
        System.out.println("listSehir.isEmpty() = " + listSehir.isEmpty());//listSehir.isEmpty() = true
 // --> List boslugu kontrol edildi.
    }
}