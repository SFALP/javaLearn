package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertList {
    public static void main(String[] args) {

// King of TRICK -- > Array'den cevirilen List array kaynakli oldugu icin array davranisi gosterir,
        // boyut sabittir dolayisiyla remove add methodu calismaz.

        String arrJavaCan[]={"Akif","Gamze","Musty","Sevde" };
        List<String> listJavaTar= Arrays.asList(arrJavaCan);// arrJavaCan degerleri list eleman olarak atandi.
        System.out.println("listJavaTar = " + listJavaTar);//listJavaTar = [Akif, Gamze, Musty, Sevde]
        System.out.println("listJavaTar.size() = " + listJavaTar.size());//listJavaTar.size() = 4
// listJavaTar.clear(); Bu kod da boyutu etkileyecegi icin calismaz. RTE hatasi verir.

//        listJavaTar.add("sefilCan Haluk");//array'e eleman eklenmez HATA verir.
//RTE -- > UnsupportedOperationException hatasi verir.

        // Kral TRICK --> List data type ArratList tanimlanirsa RTE vermez,
        // kaynagi array'de olsa list davranir boyut eksikligi yapar

        ArrayList<String> listJavaTar1=new ArrayList<>(Arrays.asList(arrJavaCan));
        listJavaTar1.add("sefil Haluk");
        System.out.println("listJavaTar1 = " + listJavaTar1);//listJavaTar1 = [Akif, Gamze, Musty, Sevde, sefil Haluk]


    }
}
