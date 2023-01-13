package j32_Abstract.Ornek2;

public class GeometriMain {
    public static void main(String[] args) {
        Dikdortgen dd = new Dikdortgen(3, 5);
        dd.setName(" yeni dikdörtgen");
        System.out.println(dd);// obje, toString ile yazdirildi
        dd.setName("Dikdortgen ");//
//        dd.cevre();//sout olmadigi, return oldugu icin ekrana yazdirmazlar
//        dd.alan();//sout olmadigi, return oldugu icin ekrana yazdirmazlar
dd.ciz();

        Cember cmbr = new Cember(4);
        cmbr.setName(" Yeni Cember");
        System.out.println(cmbr);

    }
}
