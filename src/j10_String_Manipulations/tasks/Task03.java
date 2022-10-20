package j10_String_Manipulations.tasks;

public class Task03 {
    public static void main(String[] args) {

//"Alamanya" Stringindeki ikinci 'a' characterinin indexini bulunuz.

String a="Alamanya";
// İLK a ifadesi:   a.indexOf('a')
// SON a ifadesi:   a.lastIndexOf('a')
        System.out.println(a.indexOf('a',a.indexOf('a')+1));//4 yazdırır. İlk 'a' ifadesinden sonraki 'a'
        // ifadesi bulunur. Yani ikinci a bu sekilde yazdirildi.
    }
}