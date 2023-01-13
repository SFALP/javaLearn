package j32_Abstract.abstract02;

public class IdariPersonel extends Personel{

    @Override// mecbur implement edilmelidir
    public void maasHesapla() {//Personel parent class'dan override abs. method
        System.out.println("Yoneticiye 120 USD");
    }

    @Override// mecbur implement edilmelidir.
    public void maasBilgisi() {//Personel parent class'dan override abs. method
        System.out.println("Agam cincik kod yazan idari personele ekstradan ikramiye");
    }

    @Override//tercihen override ettik (cunku concrete)
    public void sigorta() {//Personel parent class'dan override conc. method
        System.out.println("agam cincik coder personel full sigorta");
    }
}
