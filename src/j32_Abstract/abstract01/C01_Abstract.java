package j32_Abstract.abstract01;

public class C01_Abstract {
    /*
    1- Bazi durumlarda child class'lar parent class'daki method'larin genellikle  body'lerine degistirerek override ederler.
    Bu gibi durumlarda parent class'daki method'a body tanimlamak ram ve memory acisindan gereksizdir.
    Cozum olarak java Parent Class'a body'siz ---> abstract (soyut) methodlar tanimlamistir.

    2- Parnt class'daki abstract methodlar app guvenligi acisindan child class'da override edilmek zorundadir.
    eger parent class'daki child class'in mutlaka kullanmasi gereken method varsa abstract tanimlanmali,
    motor() her aracta olmalidir.

    3- Abstract method tanimlamak icin;
    a) {} body olmaz
    b) access modified sonrasi abstract keyword kullanimalidir
    c) abstract method icinde abstract keyword ve {} body bir arada kullanilamaz, aksi halde CTE
    abstract class tanimamak icin class ifadesinden once abstract keyword kullanilmalidir.

    4- Abstract methodlar sadece abstract'ta tanimlanir, kesinlikle concrete class'da abstract method tanimlanamaz.
    ama abstract class'da concrete method tanimlanabilir

    5- Abstract class icinde hem abstract method hem de concrete method ve variable kullanilabilir.

    6- Bir concrete child class, parent class extend ettiginde abstract methodlari da implement etmek zorundadir.
    Ancak concrete methodlar istege gore override edilir.

7- Parent-Child iliskisi olan abstract class'lar, abstract methodlari implement etmek zorunda degildir.

8- Parent olan abstract class, birden cok concrete veya abstract child class extend edebilir.
Ancak child class, birden cok abstract parent class'dan extends e-de-meeezz..

9- Abstract class'ta final ve abstract method tanimlanamaz, CTE verir-->final method override edilemeyecegi icin abstract olamaz.
10- Abstract class'ta private ve abstract method tanimlanamaz, CTE verir-->private method override edilemeyecegi icin abstract olamaz.
11- Abstract class'ta static ve abstract method tanimlanamaz, CTE verir-->static method override edilemeyecegi icin abstract olamaz.

******* ABSTRACT CLASS ASLA/KESINLIKLE OBJE URETEMEZ *****!!!!!!!
TRICK--->Abstract class'lar referansi, child class'in obj tutabilir.

     */

}
