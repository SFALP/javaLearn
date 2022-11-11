package j18_Constructor;

public class C07_Ogretmen {//ogretmen obj icin kaliphane

    // Field
    String isim;
    int tecrube;
    int kidem=5;

    public C07_Ogretmen(String isim, int tecrube) {//2 parametreli constructor
        this.isim = isim;
        this.tecrube = tecrube;
    }
    public void kidemHesap(int kidem){//int parametreli void method
        System.out.println("Agam kidemin: "+(kidem*2));//method parametresi degeri kideme atanir
        System.out.println("Agam kidemin: "+(this.kidem*2));// instance obje degeri kideme atanir.
    }
}