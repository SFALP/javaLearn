package j10_String_Manipulations.tasks;

public class Task08 {
    public static void main(String[] args) {

        /*  TASK :  Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";*/

        String a="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char F=a.charAt(a.indexOf('F'));// KODUN ANLAMI: Harf deposuna (yani a'ya) git ve F'nin index'ini bul, bu index no'yu kullanarak F karakterini yazdır.
        char A=a.charAt(a.indexOf('A'));// KODUN ANLAMI: Harf deposuna (yani a'ya) git ve A'nin index'ini bul, bu index no'yu kullanarak A karakterini yazdır.
        char R=a.charAt(a.indexOf('R'));// KODUN ANLAMI: Harf deposuna (yani a'ya) git ve R'nin index'ini bul, bu index no'yu kullanarak R karakterini yazdır.
        char U=a.charAt(a.indexOf('U'));// KODUN ANLAMI: Harf deposuna (yani a'ya) git ve U'nun index'ini bul, bu index no'yu kullanarak U karakterini yazdır.
        char K=a.charAt(a.indexOf('K'));// KODUN ANLAMI: Harf deposuna (yani a'ya) git ve K'nin index'ini bul, bu index no'yu kullanarak K karakterini yazdır.

        System.out.println(F+A+R+U+K);//377 yazdırır. ASCII degerini toplar.
        System.out.println(""+F+A+R+U+K);//FARUK yazdırır.
    }
}