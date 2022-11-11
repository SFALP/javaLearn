package j26_Inheritance.Inheritance02;

public class Kedi extends Memeli {// Memeli parent Class'inin child'i (Ayni zamanda Hanvancik class'inin torundur)
/*
Child class, obje olmadan parent class variable ve method'lara ulasabilir.
 */

    public Kedi() {//parametresiz cons
        super();
        System.out.println("Agam ahan da KEDI parametresiz constructor...");
    }
    public Kedi(String str) {//parametreli constructor
this();
        System.out.println(super.c);
        System.out.println("Agam ahan da KEDI parametreli constructor...");
    }
    int c=2;
    int d=5;

    @Override
    public void mC() {//MEMELI parent'ten ezen method
        System.out.println("mC --> KEDI class'tan method call edildi...");
    }
}//class sonu

