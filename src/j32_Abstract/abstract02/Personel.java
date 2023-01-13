package j32_Abstract.abstract02;

public abstract class Personel {
    String name = "Nur Hanim";

    public abstract void maasHesapla();//abstract method
    public abstract void maasBilgisi();//abstract method

    public void sigorta(){//concrete method
        System.out.println("Agam ozel sigorta kapsamindasin :)");
    }

}
