package j26_Inheritance.Inheritance02;

public class Hayvancik {// Grand parent --> Super class (Dede)

    public Hayvancik() {//parametresiz constructor
        System.out.println("Agam ahan da HAYVANCIK parametresiz constructor");
    }

    public void hareket() {
        System.out.println("HAYVANCIK hareket eder...");
    }

    public Hayvancik(int i) {//parametreli constructor
        System.out.println("Agam ahan da HAYVANCIK parametreli constructor");
    }

    public void mA() {
        System.out.println("mA --> HAYVANCIK class'ta method call...");
    }

    public void mM() {
        System.out.println("mM --> HAYVANCIK class'ta method call...");
    }

    int a;
    int m = 3;
}