package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_Size {
    public static void main(String[] args) {
// size(); -->list'in eleman sayisini return eder. (arr.length ile ayni görevdedir.)
        ArrayList<String> listSehir = new ArrayList<>(List.of("Munih", "LosAngeles", "Londra", "Stockholm", "Istanbul", "Berlin"));
        System.out.println(listSehir.size());//6
    }
}