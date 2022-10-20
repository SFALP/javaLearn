package j18_Constructor;

public class C03_StudentRunner {
    public static void main(String[] args) {

        C03_Student ogr1=new C03_Student();//ogr1 isimli obje create edildi.

        ogr1.ad="ALEX";
        ogr1.soyad="DE SOUZA";
        ogr1.sinif=10;
        ogr1.okulNo=190710;
        ogr1.ortalama=90.10;
        ogr1.takdir=true;
        System.out.println("ogr1 = " + ogr1);
        // Yukaridaki kodun ekran ciktisi: ogr1 = C03_Student{ad='ALEX', soyad='DE SOUZA', sinif=10, ortalama=90.1, okulNo=190710, takdir=true}
        //EGER POJO class'ta yeni method yazmasaydik, ekran ciktisi asagidaki gibi olacakti;
        // ogr1 = j18_Constructor.C03_Student@5f2050f6 ifadesini ekrana yazidir. Bu ogr1'in referans degeridir.


        ogr1.mezuniyet();//Agam diploman hayirli olsun :) ifadesini ekrana yazdirir.

//TASK2: Diger ogrenci objesiyle tum field'lari atayip print ediniz.

        C03_Student ogr2=new C03_Student();
        ogr2.ad="Ahmet";
        ogr2.soyad="Cakar";
        ogr2.sinif=12;
        ogr2.okulNo=90;
        ogr2.ortalama=41.9;
        ogr2.takdir=false;
        ogr2.mezuniyet();

        System.out.println("ogr2 = " + ogr2);//Bu komut kendi class'i icinde Generate edildigi icin
//        GENERATE icinde hangi ozellikler secilmisse onlari yazdiracaktir.

//Agam seneye de bekleriz, devamkeee :(
//ogr2 = C03_Student{ad='Ahmet', soyad='Cakar', sinif=12, ortalama=41.9, okulNo=90}

    }
}