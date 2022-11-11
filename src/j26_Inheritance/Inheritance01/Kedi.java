package j26_Inheritance.Inheritance01;

public class Kedi extends Memeli {// Memeli parent Class'inin child'i (Ayni zamanda Hanvancik class'inin torundur)
/*
Child class, obje olmadan parent class variable ve method'lara ulasabilir.
 */

    public Kedi() {
        System.out.println("Agam ahan da KEDI parametresi constructor...");
    }

    public void cirmala() {
        System.out.println("Kedi fena cirmalar, miyavlar");
    }
}
