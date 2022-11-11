package j26_Inheritance.Inheritance01;

public class Memeli extends Hayvancik {//Hayvancik parent'inin child class (Baba)

    public Memeli() {// parametresiz constructor

        System.out.println("Agam ahan da MEMELI parametresiz constructor");

    }

    public void sutBeslenme() {
        System.out.println("bebeleri SUT'le beslenir...");
    }

    public void dogum() {
        System.out.println("bebesini dogurup yavrusu olur :=)");
    }
}
