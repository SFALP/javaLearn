package j10_StringManipulations;

public class C01_Concatenation {
    public static void main(String[] args) {
     /*
     /** ifadesi de tüm satırları yoruma alır.
     concat() metodu içine(parametre) aldığı string variable'ı çalıştığı stringin sonuna ekler...
     Java'da + işlemi yapılırken eğer en az 1 String variable varsa java toplama değil, concat-birleştirme- yapar.
      */
        String name = " Nur";

        String meslek = " QA Tester";
        System.out.println(name.concat(meslek));// Nur QA Tester yazdırılmış olur.
        System.out.println(name);//Nur yazılır
// TRICK: String method'ları variable geçici değişiklik yapar. Eğer değişkene atama yapılırsa kalıcı değişir.
        name = meslek.concat(name);
        System.out.println("name = " + name);// QA Tester Nur yazdırılmış olur.

        System.out.println(name.concat(true + ":=)"));// QA Tester Nurtrue:=) yazdırılmış olur. Buradaki true ifadesi str: otomatik yazılarak string ifadeye dönüştürülür.
        System.out.println(name.concat(100 + ":=)"));// QA Tester Nur100:=) yazdırılmış olur. Buradaki 100 ifadesi str: otomatik yazılarak string ifadeye dönüştürülür.
// TRICK -> Concat metodu parametre olarak String type harici tüm dataları String'e çevirip concat-birleştirir- eder.
    }
}
