package Frei_Ubungen;
public class U220924_String_Manipulation {
    public static void main(String[] args) {
// contains - trim - charAt - replace - compareTo - substring ifadelerinin çalışmasıdır.

       String a= "Ingilizce, fransızca, almanca, turkce, italyanca";

        System.out.println(a.contains("türk"));//false. turk ifadesi vardır ancak türk ifadesi tanımlanan string'de yoktur.
        System.out.println(a.trim());//baştaki ve sonraki boşlukları ortadan kaldırır.
        System.out.println(a.charAt(20));//20.indexteki karakteri yazdırır.
        System.out.println(a.trim().replace("italyanca","arapca"));
        //Italyanca yerine arapca yazılmasını saglar.
// Replace komutunda değiştirilmesi gereken ifade yerine, String'de atanmış ifadede olmayan bir şey yazılırsa değişiklik yapılmaz.
        //Ör: değiştirilmesini istediğimiz ifade yterine lokum yazarsak, lokum String a içinde tanımlanmadığı için bir değişiklik yapmayacaktır.
        System.out.println(a.replace("lokum","arapca"));
        //yazılırsa sonuç:"Ingilizce, fransızca, almanca, turkce, italyanca" şeklindedir.

        System.out.println(a.replace(" ",""));
        //Bu ifade String a'da tanımlanmış ifade içindeki boşlukları ortadan kaldırır. Return: Ingilizce,fransızca,almanca,turkce,italyanca

        String x= "Istanbul";
        String y= "Ankara";
        System.out.println(x.compareTo(y));//8.
        // Buradaki çıktının sonucu POZITIFSE 1.String (yani x), 2.String'den(yani y) alfabetik olarak sonra gelir.
        // Buradaki çıktının sonucu negatifse 1.String (yani x), 2.String'den(yani y) alfabetik olarak önce gelir.
        // Buradaki çıktının sonucu sıfırsa 1.String (yani x), 2.String'le(yani y) aynıdır.

String z= "ingilizce, almanca, turkce, ispanyolca, japonca";
String w=z.substring(0,9);//Substring ifadesi, tanımlanan 2 index arasındaki(yani bu örnekte 0,1,2,3,,,,,8. index dahil)
        // tüm karakterin seçilmesi ve sout ifadesiyle yazdırılması işlemidir. 9.index hariçtir.
        // Yani geniş metinler arasından tanımlanacak index numarasına göre ifade cımbızlama yapılabilmektedir.
        System.out.println(w);//ingilizce yazdırır.
        System.out.println(z.substring(14,29));
        //Bir üst satırdaki kodda; 14.indexten başlar ve en son 28.karakteri yazar. Yani return: "anca, turkce, i" olacaktır.
        System.out.println(z.substring(20));
        // Bir üst satırdaki kodda; Substring ifadesi içinde sadece bir numara tanımlanırsa, bu index'in başlangıç
        //noktasını ifade eder ve bu sayıdan itibaren başlanarak kalan ifade seçilir ve sout ile yazdırılır.
        // Yukarıdaki örnekte 20.index'ten başlanır ve kalan metin yazdırılır. Yani return: "turkce, ispanyolca, japonca" olacaktır.
    }
}