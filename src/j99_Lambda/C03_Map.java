package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Map {
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 59, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        System.out.println("\n   ***    ");
        ciftKarePrint(sayi);//576 1444 1764 4356 2116 256
        System.out.println("\n   ***    ");
        tekKupArtiBirPrint1(sayi);//205380 35938 344 28 421876 91126 166376 42876 15626 300764
        System.out.println("\n   ***    ");
        ciftKareKokPrint(sayi);//4 6 6 8 6 4


    }//main sonu

//TASK: Functional programming ile listin cift elemanlarinin karelerini ayni satirda aralarinda bosluk birakarakprint ediniz

    public static void ciftKarePrint(List<Integer> sayi) {
        sayi.//elemanlar alindi
                stream().//list elemanlar akisa sunuldu
                filter(C01_LambdaExpression::ciftMi).//akisdaki cift elemanlar filtrelendi
                map(t -> t * t).//akista filtreleme cift elemanlarin karesi alinarak update edildi, akisa sokuldu.
                forEach(C01_LambdaExpression::yazdir);//akista filtrelenmis cift elemanlar karsi alinip isaretlenen akistan print edildi.
    }

    //TASK: Functional programming ile listin tek elemanlarinin kuplerinin 1 fazlasini ayni satirda aralarinda bosluk birakarak print ediniz.
    public static void tekKupArtiBirPrint1(List<Integer> sayi) {
        sayi.//elemanlar alindi
                stream().//list elemanlar akisa sunuldu
                filter(t -> t % 2 == 1).//akisdaki tek elemanlar filtrelendi
                map(t -> ((t * t * t) + 1)).//akista filtreleme tek elemanlarin kubu alinarak 1 eklendi ve update edildi, akisa sokuldu.
                // Kup icin 2.YOL--> map(t->Math.pow(t,3)+1)
                        forEach(C01_LambdaExpression::yazdir);//akista filtrelenmis tek elemanlar isaretlenen akistan print edildi.
    }

// TASK : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz

    public static void ciftKareKokPrint(List<Integer> sayi) {
        sayi.//elemanlar alindi
                stream().//list elemanlar akisa sunuldu
                filter(C01_LambdaExpression::ciftMi).//akisdaki cift elemanlar filtrelendi
                map(t -> (int) Math.sqrt(t)).//akista filtreleme cift elemanlarin karekoku alinarak update edildi, akisa sokuldu.
                forEach(t -> System.out.print(t + " "));// yapilan islemin yazdirilmasini saglayan koddur. Alternatif olmasi icin bu sekilde acikca yazildi.
        // Alternatif COZUM: forEach(C01_LambdaExpression::yazdir);//akista filtrelenmis cift elemanlarin karekoku alinip isaretlenen akistan print edildi.
    }


}
