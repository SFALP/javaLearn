package j18_Constructor;

public class C04_TeacherRunner {
    public static void main(String[] args) {

        C04_Teacher hoca1=new C04_Teacher();//hoca1 objesi create edildi.

        hoca1.ad="Sinan";
        hoca1.soyad="Engin";
        hoca1.brans="Pollyannaci";
        hoca1.emekli=false;
        hoca1.maas=61000;
        hoca1.tecrube=40;
        hoca1.dersSaati();

        System.out.println("hoca1 = " + hoca1);

        C04_Teacher hoca2=new C04_Teacher("ugur","javacan","Dev",15,49000,333,false);
        System.out.println("hoca2 = " + hoca2);//Parametreli Object yazdirildi.
        //hoca2 = C04_Teacher{ad='ugur', soyad='javacan', brans='Dev', tecrube=15, maas=49000.0, id=333, emekli=false}
    // parametreli Construckter tek satirda tanimlanabilirken, parametresizler tek tek ve satir satir yazilir.

    }
}