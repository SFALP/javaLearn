package j10_StringManipulations;

import java.util.Scanner;

public class C07_IndexOf_LastIndexOf {
    public static void main(String[] args) {
/* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false
*/

        String str = "Good";
        System.out.println("İlk görülen o harfinin yerinin index no'su:" + str.indexOf('o'));//1. indexte yer alır.
        System.out.println("İlk görülen d harfinin yerinin index no'su:" + str.indexOf('d'));// 3.indexte yer alır.
        System.out.println("İlk görülen d harfinin yerinin index no'su:" + str.indexOf('D'));//-1.
        // Index, büyük-küçük harf duyarlıdır.
        // olmayan karakterin indexi sorgulanırsa sonuç her zaman eksi bir (-1) olacaktır.

        String q="Mustafa nizamoglu";
        System.out.println(q.indexOf('a'));//4
        System.out.println(q.lastIndexOf('a'));//11
        System.out.println(q.lastIndexOf("fa"));//5
        System.out.println(q.indexOf("fa"));//5
/*
        task
        Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz

        1-Girilen cumle java icermiyor
        2-Girilen cumle 1 tane java iceriyor
        3-Girilen cumlede birden fazla java var
                */
        Scanner sc = new Scanner(System.in);
        System.out.print("kafi mikta bir cümle  giriniz : ");
        String cumle = sc.nextLine().toLowerCase();

        if (cumle.indexOf("java") == -1) {
            System.out.println("Girilen cumle java icermiyor");
        }else if (cumle.indexOf("java") == cumle.lastIndexOf("java")){
            System.out.println("Girilen cumle 1 tane java iceriyor");
        }else System.out.println("Girilen cumlede birden fazla java var");
    }
}