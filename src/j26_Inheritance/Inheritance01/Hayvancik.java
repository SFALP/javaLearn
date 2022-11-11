package j26_Inheritance.Inheritance01;

public class Hayvancik {// Grand parent --> Super class (Dede)
    public Hayvancik() {//parametresiz constructor
        System.out.println("Agam ahan da HAYVANCIK parametresiz constructor");
    }

    public void hareket(){
        System.out.println("HAYVANCIK hareket eder...");
    }
    public void yeme(){
        System.out.println("HAYVANCIK fena yer...");
    }
    public void icme(){
        System.out.println("HAYVANCIK cok icer...");
    }
}