package j11_Method_Creation;

public class C07_Method_Creation {//motor

    public static void main(String[] args) {
        String name = "Haluk";
        System.out.println("car car "+name);
        C07_Method_Depo.gecmeNotu(24);// depoı class'tan class name ile method calistiriyoruz.
        // baska bir classtan baska bir methodu burada calistiracagiz.
// Bu yontem, noktali virgul ifadesiden sonra once class name yazilarak baslanir. Karsimiza cikan seceneklerden makul olan secilir.
// sonra yine bir nokta koyularak karsimiza cikan methodlardan biri secilerek tanimlanmıs olur.
//  En son da parantez icinde not verisi tanıimlanir(Ör:24). Sonra main olan class calistirilir ve depoda yer alan method islem gorur, sonuc yazdirilmis olur.


        C07_Method_Depo.topla(3, 5);//8 Baska bir class icinde olan(C07MethodDepo) methoda atifta bulunuldu.
        // Diger koyun iscisidir.

/* Orada yer alan komutlara gore ilgili methoda burada is yaptirip try {
sonucu alabilmekteyizKısaca baska bir koyden mevsimlik isci getirmek gibi. Baska koyun caliskan gucu kendi alanimda
() -> calistirabilmekteyim. Bu caliskan isciyi cagirirken koy ismiyle birlikte cagirilir. Bu koy ismi de classtir.
   */

        /*farklı classtan method call etmek icin;
        1. method static --> gokteki gunes gibidir.
        2. ClassName.methodName () seklinde call edilir.
        aynı class'daki method dogrudan methodName ile call edilir.
         */
selamVer();// aynı class icinde methodName ile call edilir--> kendi koyumun iscisi.
    C06_Method_Overloading.topla(35,63);//98 baska bir class uzerinde yazilan bir method (recall) cagirildi.
    }// main disi
public static void selamVer(){
    System.out.println("agam selamlar Devamkee :=)");
}
}

