package j32_Abstract.abstract02;

public class Runner {
    public static void main(String[] args) {
        Isci maraba1 = new Isci();
        maraba1.maasBilgisi();//agam, marabalara cay-cigara haric gunde 8 saat kurek mahkumu
        maraba1.maasHesapla();//agam, marabalara en cok yevmiye 499 gayme verilir
        maraba1.name = "Ebubekir Bey, guzel insan :-)";
        System.out.println("maraba1.name = " + maraba1.name);//maraba1.name = Ebubekir Bey, guzel insan :-)
        maraba1.sigorta();//abstract parent class'daki concrete method obje ile call edildi.
//Agam ozel sigorta kapsamindasin :)

        IdariPersonel cincikCoder = new IdariPersonel();
        cincikCoder.name = "Dilek hanim ";
        System.out.println("cincikCoder.name = " + cincikCoder.name);//cincikCoder.name = Dilek hanim
        cincikCoder.sigorta();//agam cincik coder personel full sigorta
        cincikCoder.maasBilgisi();//Agam cincik kod yazan idari personele ekstradan ikramiye
        cincikCoder.maasHesapla();//Yoneticiye 120 USD

    }
}
