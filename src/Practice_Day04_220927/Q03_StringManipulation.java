package Practice_Day04_220927;

public class Q03_StringManipulation {
    public static void main(String[] args) {
         // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

  /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space
    \\S   ==> space disindaki hersey  */

        String  str1= "$13.99";
        str1=str1.replaceAll("\\D","");
        System.out.println(str1);//1399 yazacaktır.

        String str2= "$10.55";
        str2=str2.replaceAll("\\D","");
        System.out.println(str2);//1055 yazacaktır.

        System.out.println(str1 + str2); //13991055 yazar, yani Concat yapar, toplamaz. Çünkü veri tipi string'dir. Toplaması için en az int olmalıdır.
// Eğer sayı olduğunu bildiğimiz String varsa parselDouble() veya parselInteger metodu kullanabiliriz.

        double sayi1=Double.parseDouble(str1); // String olan sayi1, double olan sayi1'e dönüşmüştür.
        double sayi2=Double.parseDouble(str2); // String olan sayi2, double olan sayi2'e dönüşmüştür.
        System.out.println(("$" + (sayi1+sayi2)/100));//$24.54 yazacaktır.

    }
}
