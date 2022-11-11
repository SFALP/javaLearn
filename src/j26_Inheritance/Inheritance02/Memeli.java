package j26_Inheritance.Inheritance02;

public class Memeli extends Hayvancik {//Hayvancik parent'inin child class (Baba)

    public Memeli() {// parametresiz constructor
        this('y');// bu Class'in parametreli constructor'U call edildi.

        System.out.println("Agam ahan da MEMELI parametresiz constructor");

    }

    public Memeli(char c) {// parametreli constructor
        super(17);//parent Haycancik class parametreli constructor call edildi.
        System.out.println("Agam ahan da MEMELI parametreli constructor");

    }

    public void mC() {//ezilen method
        System.out.println("mC --> MEMELI class'ta method call...");
    }

    int m = 1;
    int c = 4;

    @Override
    public void mM() {//parent'ten. ezen method'tur
        System.out.println("mM --> MEMELI class'tan method call...");
    }
}//class sonu
