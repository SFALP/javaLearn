package j99_Lambda.CodeChallenge_221205;
//multi arrayleri cevirirken flatMap kullaniriz yapilis sekli iki turludur
//1) lambda kullanarak
// Arrays.stream(arr).flatMap(t->Arrays.stream(t))
//2) method ile
// Arrays.stream(arr).flatMap(Arrays::stream)
// BU SEKLIDE ARTIK TUM STREAM METHODLARI KULLANILABILIR

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C3_MultiArrays_StreamOrnekleri {
    public static void main(String[] args) {
        String arr[][] = {
                {"Elma", "Muz"},
                {"Portakal", "Cilek", "Limon"},
                {"Havuc","Erik"}
        };
        System.out.println("listele(arr) = " + listele(arr));//listele(arr) = [Elma, Muz, Portakal, Cilek, Limon, Havuc, Erik]
        System.out.println("\n  *****   ");
        doubleYaz(arr);//ElmaElma ErikErik
        // 2.COZUM ElmaElma ErikErik
    }
    // S2: E ile baslayan elemanlari double (elmaelma) olarak yazdiralim
    public static void doubleYaz(String[][] arr) {
    Arrays.stream(arr).flatMap(t->Arrays.stream(t)).map(t->t+t).filter(t->t.startsWith("E")).forEach(t-> System.out.print(t+ " "));
        System.out.println("\n 2. COZUM");
    listele(arr).stream().filter(t->t.startsWith("E")).map(t->t+t).forEach(t-> System.out.print(t + " "));
    }
    // S1 : tum elemanlari list yapalim

    public static List<String> listele(String[][] arr) {
        return Arrays.stream(arr).flatMap(t -> Arrays.stream(t)).collect(Collectors.toList());
//hepsi bir stream'de, bu methodile yeni bir stream'de tek duzleme aliyoruz
    }





    // S3: E ile baslayan elemanlari liste olarak yazdiralim (*** starttsWith ile cozulebilir)



    //S4 : k ile bitenlerin sonuna '*' ekleyelim (*** endsWith("K") ile cozulebilir)


}
