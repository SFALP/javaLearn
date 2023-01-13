package j32_Abstract.abstract02;

public class Isci extends Personel {//abstract Personel parent class'a extend --> concrete child isci class'i

    @Override
    public void maasHesapla() {//personel parent class'tan override edilen abstract methodlar
        System.out.println("agam, marabalara en cok yevmiye 499 gayme verilir");
    }

    @Override
    public void maasBilgisi() {
        System.out.println("agam, marabalara cay-cigara haric gunde 8 saat kurek mahkumu");

    }
}
