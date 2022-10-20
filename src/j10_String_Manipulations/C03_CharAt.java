package j10_String_Manipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
 /*
 charAt() metodu parametre metodu olarak girilen index'deki char değerini return eder.
 Index değeri sıfırdan başlar.
  */
        String a = "Istanbul";
        char besinciIndexKrkt = a.charAt(5);
        System.out.println(besinciIndexKrkt);//b
// Son index karakteri --> length()-1


        System.out.println(a.charAt(a.length() - 1));//Son karakterin (l harfinin) bulunduğu koddur.
// İlk index karakter --> charAt(0)
        System.out.println(a.charAt(0)); //I harfini return eder.

//        System.out.println(a.charAt(18));//RTE hatası verir. 18 karakter olmadığı için bir karşılık bulamaz.(Index aşımı olur)
//TRICK --> charAt() index boyutunu geçerse RTE verir.

// TASK: Girilen kelimeninortadaki karakteri print eden cod create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Ortadaki harfin bulunmasını sağlayan programa hoşheldiniz");
        System.out.println("Bir kelime tanımlayınız: ");
        String k = scan.nextLine();

        if (k.length() % 2 != 0) {
            System.out.println(k.charAt(k.length() / 2));
        } else
            System.out.println("Girilen kelimenin ortasında karakter bulunmamaktadır");
    }
}
