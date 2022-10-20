package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {
    public static void main(String[] args) {
// get(); --> list'te istenen index elemani return eder. Bu arr[3] ile benzer görevi yapar. ör: arr isimli arrayda 3.indexi getirir

    ArrayList<String> listSehir = new ArrayList<>(List.of("Munih", "LosAngeles", "Londra", "Stockholm", "Istanbul", "Berlin"));
        System.out.println(listSehir.get(1));//LosAngeles
        System.out.println(listSehir.get(11));//Olmayan index elemani istenirse RTE hatasi verir.(Sinir asildigi icin)




    }
}
