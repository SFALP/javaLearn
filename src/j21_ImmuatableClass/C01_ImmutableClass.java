package j21_ImmuatableClass;
// Immutable= Degisemez anlamina gelir.

public class C01_ImmutableClass {
    public static void main(String[] args) {

        String str1 = "murat";// ilk degeri murat atanan str1 variable
        String str2 = "murat";//str1 ve str2 ayni degere sahip oldugu icin String havuzunda ortak referans atanir.

        String str3 = new String("murat");//degerleri ayni referanslari farkli obje
        String str4 = new String("murat");//degerleri ayni referanslari farkli obje


        String str5 = str1+"";

        System.out.println(str1 == str2);//T
        System.out.println(str1 == str3);//F
        System.out.println(str1.equals(str2));//T
        System.out.println(str3 == str4);//F
        System.out.println(str1 == str5);//F
        System.out.println(str1.equals(str5));//T

    }
}
