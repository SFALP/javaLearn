package j18_Constructor;

public class C04_Teacher {// Ogretmen obje ureten kaliphane Class'tir.
    String ad;
    String soyad;
    String brans;
    int tecrube;
    double maas;
    int id;
    boolean emekli;

    public void dersSaati(){
        System.out.println("Agam haftada 20 saatten sonrasi extraya girer :)");

    }

    public C04_Teacher() {//parametrenin ezdigi default Contructor yerine parametresiz contructor create ettik
    }

    // TRICK-->Parametreli Constructor default Constructor'u ezer!
// Asagidaki bolum, mouse sag tus GENERATE ve Constructor secilerek olusturuldu ve Parametreli olarak yeni bir Cons hazirlanmis oldu.
    public C04_Teacher(String ad, String soyad, String brans, int tecrube, double maas, int id, boolean emekli) {//parametreli obje/Class
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
        this.tecrube = tecrube;
        this.maas = maas;
        this.id = id;
        this.emekli = emekli;
    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", brans='" + brans + '\'' +
                ", tecrube=" + tecrube +
                ", maas=" + maas +
                ", id=" + id +
                ", emekli=" + emekli +
                '}';
    }
}