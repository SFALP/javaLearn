package j10_String_Manipulations;

public class C05_Start_EndWith {
    public static void main(String[] args) {

/* Konu: Bununla başlar mı veya bununla biter mi? sorusunu yanıtlar. Boolean tipinde çalışır.
        Ör: İstanbul L ile biter mi?


*/
        String a = "Istanbul";
        System.out.println(a.startsWith("I"));//true
        System.out.println(a.startsWith("Is"));//true
        System.out.println(a.startsWith("s"));//false
        System.out.println(a.startsWith("e,3"));//false 3.indexten itibaren string a ile mi başlar işlemini yaptırır.
        System.out.println(a.startsWith("a", 3));//true 3.indexten itibaren string a ile mi başlar işlemini yaptırır.

        System.out.println("Checkpoint");
        System.out.println(a.endsWith("l"));//true
        System.out.println(a.endsWith("bul"));//true
        System.out.println(a.endsWith("bu"));//false

        String str = "bul";
        System.out.println(a.endsWith(str));//true
        int yas = 48;
//        System.out.println(a.endsWith(yas));//CTE hatası alırız. intiger ve string olduğu için
// TASK: girilen e-mail hesabının @gmail.com içermiyorsa "Lütfen gmail hesabı giriniz"
        // @gmail.com ile bitiyorsa ""hesabınız onaylandı" aksi durumda geçerli hesap giriniz print eden code creat ediniz
        // SCANNER - IF - CONTAINS - ENDWITH -
        //Ex98 isimli class altında bu task ödev olarak yazılmıştır.
    }
}
