package j18_Constructor;

public class C05_Arac {//Obje kaliphanesi
    //Field-> Objenin uretilirken alacagi deger variable'laridir.
    // bir class'ta birden cok constructor tanimlanabilir.
   /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
Aksi takdirde Compile Time Error alirsiniz.
        2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
        */

    int maxHiz;
    String model;

    public C05_Arac() {//parametresiz constructor
    }

    public C05_Arac(int maxHiz) {//1 parametreli constructor
        this(180,"Hacimurat");//2parametreli contructor call edildi. Ilk satira yazilmali
//yoksa CTE verir.

//maxHiz=maxHiz;// this olmadigi icin parametre degeri instance
        this.maxHiz = maxHiz;//this keyword parametre degeri inst. variable atama yapar.
        //obj maxHiz degeri parametreden alir.
        System.out.println("Agam bu sefer de 1 parametreli constructor call edildi");
    }


    public C05_Arac(int maxHiz, String model) {//2 parametreli constructor
        this.maxHiz = maxHiz;
        this.model = model;
        System.out.println("agam bu yaziyi okuduysan 2 parametreli constructor call edilmisitir.");
    }
    public C05_Arac(String model,int maxHiz) {//2 parametreli ancak parametre sirasi farkli constructor
        this.maxHiz = maxHiz;
        this.model = model;
        System.out.println("agam bu yaziyi okuduysan 2 parametreli constructor call edilmisitir.");
    }
}
