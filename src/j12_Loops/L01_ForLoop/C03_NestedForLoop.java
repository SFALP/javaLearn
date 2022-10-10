package j12_Loops.L01_ForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
/*
Eger bir dongunun body'si icinde baska bir dongu bulunuyorsa bu tur dongulere nested loop yani ic ice dongu denir.
Ic dongu, dis dongunun her adiminda tekrar calisir.
Ic ice dongulerde en icteki dongu, en once calisir. (Daire bitmeden apartmani bitiremezsiniz.)
 */

        for (int apt = 1; apt <=10 ; apt++) {//dis dongu
            System.out.println("\n"+apt+". Apartman");

            for (int daire = 1; daire <6 ; daire++) {// ic dongu
                System.out.println(daire+". Daire");
            }
        }
    }
}
