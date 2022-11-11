package j26_Inheritance.Inheritance02;//KONU ADI: Kalitimda constructor call

/*
 1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
 2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
 3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
 4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları içim kullanılır.
 5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
 6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
 7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
   denir.
 8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
 9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/
public class Runner {
    public static void main(String[] args) {

//      Data Typ    obj name            Constructor
        Kedi k1 = new Kedi();
        System.out.println("k1.a = " + k1.a);//0-->Hayvancik'tan call edildi.
        System.out.println("k1.c = " + k1.c);//2-->Kedi class'tan call edildi.
        System.out.println("k1.d = " + k1.d);//5-->Kedi class'tan call edildi.
        System.out.println("k1.m = " + k1.m);//1//Memeli class'tan call edildi.
/*
  Ayni isimli variable'lardan hangisinin kullanildi
olusturulan object'in data type'ina göre bilinir
Variable'i arastirmaya data type'i classindan baslanır.
*/

        k1.mA();//Hayvancik Class'tan call edildi
        k1.mC();//Kadi Class'tan call edildi.
        k1.mM();//Memeli classtan call edildi.

      /*
 Method cagirilirken ayni isimli methodlardan
 hangisinin kullanilacagina Constructor karar verir.
 Methodlari arastirmaya Consctuctor ismini tasiyan
 class'dan baslayin ve parentlarda arastirmaya devam edin.
 */
        Memeli k2 = new Kedi("Kevser");//Data type'i parent Memeli Class, ancak constructor'u parametreli Kedi() class'tir.
        System.out.println("k2.c = " + k2.c);//4
        System.out.println("k2.a = " + k2.a);//0
        System.out.println("k2.m = " + k2.m);//1
//        k2.d;// CTE verir, obj data type Memeli Class d variable olmadigindan, call edilemez.
        k2.mA();//Hayvancik'tan call edildi
        k2.mC();//Kedi'den call edildi
        k2.mM();//Memeli'den call edildi.

//DIKKAT!!
// Variable --> Data Typ ile cagirilirken,
//  Method constructor ile call edilir.

        Hayvancik k3 = new Kedi();
        System.out.println("k3.m = " + k3.m);//3--> Hayvanciktan call edildi.
//      k3.c--> CTE. Cunku c variable, Hayvancik class'inda yer almaz.
        k3.mA();// Hayvancik class'tan call edildi
        k3.mM();//Memeli Class'tan call edildi.
        System.out.println("k3.a = " + k3.a);//0-->Hayvancik'tan call edildi.

        Memeli m1 = new Memeli('€');
        System.out.println("m1.m = " + m1.m);//1(Memeli'den call edilir.)
        System.out.println("m1.a = " + m1.a);//0(Hayvancik'tan gelir)
        System.out.println("m1.c = " + m1.c);//4(Memeli'den gelir)
// m1.d--> parent Memeli class, child class'tan(Kedi'den) variable alamaz.
        m1.mA();//Hayvancik class'tan gelir
        m1.mC();//Memeli class'tan gelir
        m1.mM();//Memeli class'tan gelir.


    }
}