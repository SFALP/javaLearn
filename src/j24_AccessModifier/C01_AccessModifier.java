package j24_AccessModifier;
/*
     1) "private" class member'lar sadece icinde bulunduklari class'larda kullanilabilirler.
     Diğer class'lardan "private" class memler'lari kullanamaz.

         2) Diğer package'lerden   olusturulan object için class'i import edilmeli

         3) Diğer package'lerden default class memberlara erişilemez.
          "default" ile "package private" es anlamlidir.

         4) public class member'lara herkes her yerden erişebilir.(farkli java projesi disinda).

          5) "protected" class member'lara ayni package'dan erişilebilir. Farkli package
         için : a)Child class erişebilir.  b)Child class degil ise erişilemez.

          6) Class'lar için  sadece "public" ve "default" access modifier kullanilir.
          Class tanımlanırken "private" veya "protected" access modifier kullanilmaz.

 */
public class C01_AccessModifier {

    private int privateYas=24;
    int defaultYas=33;//Access Modifier yazilmamissa otomatik olarak default atanir.
    protected int protectedYas=40;
    public int publicYas=48;

    private C01_AccessModifier() {//private parametresiz constructor
        System.out.println("agama PRIVATE constructor'dan selam ");
    }

    public C01_AccessModifier(int privateYas, int defaultYas) {//public 2 parametreli Constructor
        System.out.println("agama PUBLIC constructor'dan selam");
    }

    private void privateMethod(){
        System.out.println("PRIVATE Method'dan agaya selam");
    }
    protected void protectedMethod(){
        System.out.println("PROTECTED Method'dan agaya selam");
    }
 //  C01_AccessModifier obj3=new C01_AccessModifier();
    // private olarak tanimlandigi halde ayni class icinde oldugu icin erisim saglanabilir.
}