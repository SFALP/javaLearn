package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C14_ListConvertArray {
    public static void main(String[] args) {

// List'i array'e cevirme--> toArray();
        // 1. yontem --> toArray(); parametre olarak String[0] alarak yapilir.
        ArrayList<String> listUlke = new ArrayList<>(List.of("Almanya", "Amerika", "Japonya", "Turkiye", "Kanada", "Ingiltere"));
        String arrUlke[] = listUlke.toArray(new String[0]);//ulkeList artik arrUlke olarak atandi.

        System.out.println("listUlke = " + listUlke);//listUlke = [Almanya, Amerika, Japonya, Turkiye, Kanada, Ingiltere]
        System.out.println("Arrays.toString(arrUlke) = " + Arrays.toString(arrUlke));
    //Arrays.toString(arrUlke) = [Almanya, Amerika, Japonya, Turkiye, Kanada, Ingiltere]

// 2. Yontem--> Olusturulan Array'in data type'i Object olarak atanir.
        // TRICK ---> Object class Java'da tum class'larin parentidir(atasi).
        // Object Class java'da parent'li olmayan tek class'tir(Tum vagonlari ceken ama cekilemeyen bir lokomotiftir)
        // String Integer Class'lar Object class child'i oldugu icin istenen durumlarda data type olarak object class kullanılabilir
        Object arrUlkeler[]=listUlke.toArray();
        System.out.println("Arrays.toString(arrUlkeler) = " + Arrays.toString(arrUlkeler));
//Arrays.toString(arrUlkeler) = [Almanya, Amerika, Japonya, Turkiye, Kanada, Ingiltere]

    }
}
