package Frei_Ubungen;

public class U221012_Arrays {
    public static void main(String[] args) {

        String dil1[] = new String[6];
        //String dil2[] = {"almanca", "fransizca", "turkce", "ingilizce", "rusca", "italyanca"};// Array tanimlamanin 2.yoluj
        dil1[0] = "almanca";
        dil1[1] = "fransizca";
        dil1[2] = "";
        dil1[3] = "ingilizce";
        dil1[4] = "rusca";
        dil1[5] = "italyanca";

        System.out.println(dil1[0]);
        System.out.println(dil1[1]);
        System.out.println(dil1[2]);
        System.out.println(dil1[3]);
        System.out.println(dil1[4]);
        System.out.println(dil1[5]);

        String meslek[] = {"Doktor", "Eczaci", "Mustahdem", "Memur"};
        for (int i = 0; i < meslek.length; i++) {
            System.out.print(meslek[i] + " - ");

        }
        System.out.println();


        int sayi[] = {20, 30, 40, 50, 60};

        sayi[4] = 120;//4.indexte yer alan 60 degeri 120 sayisiyla guncellendi
        System.out.println(sayi[0]);//20
        System.out.println(sayi[4]);//120 yazdirilir

        System.out.println("CIFT ARRAY");
        int s[][] = new int[2][3];//2 sinifli ve 3 ogrencili bir okul
        s[0][0] = 10;//1. sinifin 1.ogrencisine numara atamasi yapildi
        s[0][1] = 12;//1. sinifin 2.ogrencisine numara atamasi yapildi
        s[0][2] = 14;//1. sinifin 3.ogrencisine numara atamasi yapildi

        s[1][0] = 11;//2. sinifin 1.ogrencisine numara atamasi yapildi
        s[1][1] = 13;//2. sinifin 2.ogrencisine numara atamasi yapildi
        s[1][2] = 15;//2. sinifin 3.ogrencisine numara atamasi yapildi

        System.out.println(s[0][0]);
        System.out.println(s[0][1]);
        System.out.println(s[0][2]);
        System.out.println("*****2.Bolum*****");
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(s[i][j] + " ");
            }
        }
    }
}