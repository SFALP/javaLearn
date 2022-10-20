package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_SubList {
    public static void main(String[] args) {
    ArrayList<String> listSehir = new ArrayList<>(List.of("Munih", "LosAngeles", "Londra", "Stockholm", "Istanbul", "Berlin"));
  //subList() -->list'ten istenen list parcasini return eder.

        System.out.println("listSehir.subList(3,5) = " + listSehir.subList(3, 5));//listSehir.subList(3,5) = [Stockholm, Istanbul]
//Yukaridaki kod 3. ve 4. indexte yazilan elemanlari yazdirir.

        ArrayList<String>stadt=new ArrayList<>(listSehir.subList(2,5));//listSehir'den 2.3.ve4.index elemanlari stadt liste atandi.
        System.out.println("stadt = " + stadt);//stadt = [Londra, Stockholm, Istanbul]
    }
}
