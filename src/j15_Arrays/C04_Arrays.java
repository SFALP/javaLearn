package j15_Arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {
// TASK: Array esitlik kontrolu...equals()--> methodu index ve value kontrolu yapar ve true/false return eder.

        int sayi1[]={39,3,72,63,84};
        int sayi2[]={84,72,63,3,39};

        Arrays.equals(sayi1,sayi2);

        System.out.println("Sayi1 ve Sayi2 Arrayleri esit mi? "+Arrays.equals(sayi1,sayi2));//false

        Arrays.sort(sayi1);//sayi1 array siralandi
        System.out.println(Arrays.toString(sayi1));//[3, 39, 63, 72, 84]
        Arrays.sort(sayi2);//sayi 2 array siralandi.
        System.out.println(Arrays.toString(sayi2));//[3, 39, 63, 72, 84]

        System.out.println("Sayi 1 ve 2 esit midir? = " + Arrays.equals(sayi1, sayi2));//true
        System.out.println( sayi1[0] == sayi2[0]);//true
//"Sayi1'in 0.indexi ile sayi2'nin 0.indexi esit midir? sorunun cevabini verir.

    // Array'i String'e cevirme... toString methodu toString(arr)--> verilen arrayi string data tipine cevirir.

        String str= Arrays.toString(sayi1);
        System.out.println(str);//[3, 39, 63, 72, 84] Array'in tum karakterleri(bosluk, virgul, koseli parantez de dahil) String olarak tanimlanmistir.
        System.out.println(str.substring(6));//cevap: , 63, 72, 84] olacaktir. Cunku Java, bosluk ve virgulu de karakterden sayar.

    }
}