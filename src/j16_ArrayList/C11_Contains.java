package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_Contains {
    public static void main(String[] args) {
//contains(); --> method, List'te istenen elemanin varligini kontrol eder. true/false return eder
        ArrayList<String> listSehir = new ArrayList<>(List.of("Munih", "LosAngeles", "Londra", "Stockholm", "Istanbul", "Berlin"));

        System.out.println("listSehir.contains(\"Ankara\") = " + listSehir.contains("Ankara"));//false
        System.out.println("listSehir.contains(\"Munih\") = " + listSehir.contains("Munih"));//true
    }
}