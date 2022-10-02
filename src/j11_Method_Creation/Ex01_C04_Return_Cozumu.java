package j11_Method_Creation;

import java.util.Scanner;

public class Ex01_C04_Return_Cozumu {
    public static void main(String[] args) {

        //task -> girilen ad ve soyadın ilk harfleri buyuk diğerlerini kucuk yapan method create ediniz
        // RETURN TYPE'Lı ÇÖZÜM.

        Scanner sc = new Scanner(System.in);
        System.out.print("adınızı giriniz : ");
        String ad = sc.next();

        System.out.print("soyadınızı giriniz : ");
        String  soyad= sc.next();

        isimSoyisimHarfKontrol(ad, soyad);//Bu kod, C04_method_Creation isimli class ile aynidir.
        //Bir alttaki yapiyla karsilastirilabilmesi için buraya tekrar yazilmistir.
        System.out.println(isimSoyisimHarfKontrol2(ad, soyad));//RETURN ÇÖZÜM


    }//main sonu

    private static void isimSoyisimHarfKontrol(String ad, String soyad) {
        //Method baslangicinin bu ornek icin private veya public olmasi bir seyi degistirmediginden onemsenmemistir.

        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        System.out.println("ad  soyad = " + ad + " " + soyad);
    }

    private static String isimSoyisimHarfKontrol2(String ad, String soyad) {//return typle method
//Method baslangicinin bu ornek icin private veya public olmasi bir seyi degistirmediginden onemsenmemistir.

        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();

        return ad+" "+soyad;
    }
}
