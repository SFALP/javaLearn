package j18_Constructor;

public class C01_Constructor {
/*
1- Constructor ismi Class name ile ayni olmalidir. Buyuk harf ile baslamalidiir.
2- Constructor create edildiginde name'den sonra () {} mutlaka kullanilmalidir.
3- Eger parametreli Constructor create edilmisse java default Constructor'u ezer(siler)
4- Constructor'un return type'i olmaz, method'dan ayiran ozelligi budur.
5- Bir Class olustugunda Java default Constuctor'u kendi create eder.
 */

    String str; //Instance variable yani obje variable'dir. Obje ile deger kazanir.
    String selam = "Guzel Insan";

    //  C01_Constructor obj1    =   new             C01_Constructor();
    public static void main(String[] args) {
//       class name  obj name    new keyword     default Constructor
        C01_Constructor obj1    = new            C01_Constructor();//Parametresiz obj1 isminde olusturulmus Constructor
        C01_Constructor obj2 = new C01_Constructor();
        C01_Constructor obj3 = new C01_Constructor();
        C01_Constructor obj4 = new C01_Constructor();


        obj1.str = "javacan";// str insance variable, obj1 ile call edilerek obj1 javacan degeri atandi.
        obj2.str = "javatar";//str intance variable, obj2 ile call edilerek obj2 javatar degeri atandi.
        System.out.println(obj3.selam);//Guzel Insan yazdirir(Obj3 icin).
        System.out.println(obj1.str);//javacan(obj1 icin)
        System.out.println("obj2.str = " + obj2.str);//obj2.str = javatar
        System.out.println("obj4.str = " + obj4.str);//null yazar. Cunku obj4 icin str degerine bir atama yapilmadigindan
        // standart degeri olan (otomatik atanan) null degeri yazdirilmis olur.

        obj3.aga();//obj3 aga methodunu calistirir ve aksiyon ne ise gerceklestirir.
//agama selamkeee :) yazdirir.
obj2.aga();//agama selamkeee :) yazdirir. Boylece farkli objeler uzerinden ayni method calistirilmis olur.

    }//main sonu
    public void aga() {
        System.out.println("agama selamkeee :)");
    }
}