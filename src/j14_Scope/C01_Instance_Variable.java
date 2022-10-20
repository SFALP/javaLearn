package j14_Scope;
public class C01_Instance_Variable {
/*                                  INSTANCE VARIABLE

   1) Main method'un ve urettiginiz diger methodlarin disinda  disinda(ustunde veya altinda), class'in icinde
      olusturulan variable'lara "instance variable" denir.
   2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
   3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
      Asagida goruldugu gibi "yas" variable'ina deger atamasi yaptim "tecrube" variable'ina yapmadim.
      Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
         "i" variable'i initialize edildi, digerleri initialize edilmedi.
   4) Initialize edilmeyen "instance variable" lar icin Java kendisi deger atamasi yapar.
      Java'nin instance variable'lara kendisinin verdigi degerlere "default value" denir.
            byte, short, int, long icin default value 0'dir.
            float, double icin default value 0.0'dir.
            char icin default value 0'dir.
            boolean icin default value false'dur.
            String icin default value "null" dir.

*/
// insatance(obje) variables
int yas=48; //initialized ilk atamsı yapılmış ins. variable
int tecrube;// default deger 0
String name;// default deger null
boolean developerMi;// deafult deger false
double boy;// default deger 0.0
char unvan;// default deger bosluk
    static String kurs="Clasrusway";


    public static void main(String[] args) {//main basi
int a=7;//bu atama local variable'dir.
        System.out.println(a);//7
        //System.out.println(yas);//instance degerdir, buna deger atamasi yopilmadan isleme alinmaz.
        // Non-static oldugu icin dogrudan cagirilamaz.
        System.out.println(kurs); //static variable static methoda cagirildigi icin islem yapilir.
a=24;
        System.out.println(a);
        staticMethod();// static method call edildi.->Astral seyahat: Static olan main sadece static method create eder.
//        non_StaticMethod();// Nonstatic method burada call edilemez. Galaxy'de dünyalik olmaz.

    // OBJE Cereation -->> ClassName objName = new ClassName(); ÖR: Random class veya Scanner class

        C01_Instance_Variable ebikgabikObj=new C01_Instance_Variable();//obj create edildi.
ebikgabikObj.boy=1.9;//instans variable ile call edilip atama yapildi.
ebikgabikObj.developerMi=true;
ebikgabikObj.name="Kubra";

        System.out.println(ebikgabikObj.name);//Kubra yazdirilacaktir.
        System.out.println("ebikgabikObj.tecrube: "+ebikgabikObj.tecrube);//default deger:0
        ebikgabikObj.yas=33;
        System.out.println("ebikgabikObj.yas = " + ebikgabikObj.yas);//33

        C01_Instance_Variable obj1=new C01_Instance_Variable();//farkli bir obj1 isminde obje create edildi.
obj1.boy=1.75;
        System.out.println("obj1.boy = " + obj1.boy);//1,75 yazdirilir.
obj1.name="Fatih bey";
        System.out.println("obj1 = " + obj1.name);// Fatih bey yazdirilir.




    }// main sonu

    public void non_StaticMethod() {//static olmayan method
        System.out.println("Static olmayan methoddan agama selam :)");

    }
public static void staticMethod (){//static method
    System.out.println("Static günes methodusun agam devamkeeee :)");
}
}
