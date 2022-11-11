package j26_Inheritance.Inheritance01;//KONU ADI: Kalitimda constructor call

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
        Hayvancik hyvn = new Hayvancik();
        hyvn.hareket();
        hyvn.icme();
        hyvn.yeme();

        System.out.println("    ***     ");

        Memeli m1 = new Memeli();
        m1.sutBeslenme();//Child Memeli call edildi
        m1.dogum();//Child Memeli call edildi
        m1.icme();//Grand parent'ten (Hayvancik) call edildi
        m1.yeme();//Grand parent'ten (Hayvancik) call edildi
        m1.hareket();//Grand parent'ten (Hayvancik) call edildi

        System.out.println("    ***     ");

        Balik hamsi = new Balik();//
        hamsi.izgaraTava();//
        hamsi.hareket();// parent Hayvancik (Dede) call edildi.
        hamsi.yeme();// parent Hayvancik (Dede) call edildi.
        hamsi.icme();// parent Hayvancik (Dede) call edildi.

        System.out.println("    ***     ");

        Kedi kd = new Kedi();
        kd.cirmala();
        kd.hareket();// parent Hayvancik (Dede) call edildi.
        kd.yeme();// parent Hayvancik (Dede) call edildi.
        kd.icme();// parent Hayvancik (Dede) call edildi.
        kd.dogum();
        kd.sutBeslenme();

        System.out.println("    ***     ");

        Koyun ky = new Koyun();
        ky.semir();
        ky.hareket();
        ky.yeme();
        ky.icme();
        ky.dogum();
        ky.sutBeslenme();

    }
}