package j11_Method_Creation;

public class C07_Method_Depo {
    // *** AUFMERKSAMKEIT**** ACHTUNG *** C07_MethodCreation isimli class uzerinde calistirildi.
    // main method -->motor olmayacak !!! Ilk defa main olmadan calisilmaktadir.
    // public static void gecmeNotu(int not) malzeme tasiyan romork ozelligindedir. Bu romork bir motora baglanmalidir.

    public static void gecmeNotu(int not){
        if (not>=85){
            System.out.println("agam tebrikler, cooook basarilisin :=)");
        } else if (not>=70) {
            System.out.println("agam basarili :)");
        } else if (not >=60) {
            System.out.println("agam sadece gectin");
        } else if (not >=45) {
            System.out.println("agam ucuz yirttin :(");
        }else
            System.out.println("agam fena caktin :(");
    }
    public static void topla(int a, int b){
        System.out.println(a+b);
    }

}
