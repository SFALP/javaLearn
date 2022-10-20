package j18_Constructor;

public class C03_Student {//main olmayan sadece student obje create etmek icin POJO-> Plan Old Java Object:(Obje icin Standart Class-kaliphane)
    //Field'lar
    String ad;
    String soyad;
    int sinif;
    double ortalama;
    int okulNo;
    boolean takdir;

    public void mezuniyet (){//method
        if (ortalama>=50){
            System.out.println("Agam diploman hayirli olsun :)");
        }else System.out.println("Agam seneye de bekleriz, devamkeee :(");
    }

    @Override
    public String toString() {//objenin referans degeri print etmemesi icin obje datalarini String'e ceviren method create edildi.
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sinif=" + sinif +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                '}';
    }
}