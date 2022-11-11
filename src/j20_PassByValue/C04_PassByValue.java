package j20_PassByValue;

public class C04_PassByValue {

    static double etiketFiyati;//gunes
    static double indirimOrani;//gunes

    public static void main(String[] args) {//main basi
/*
Eger bir method'ta yapilan degisiklik kalici olsun istenirse
1- Degisiklik yapilan variable'lar static olarak tanimlanir.
 */
        etiketFiyati = 200;
        System.out.println("Indirim oncesi etiketFiyati = " + etiketFiyati);
        indirimOrani = 0.9;
        indir();//method call

        indirimOrani = 0.9;
        indir();//method call

        indirimOrani = 0.9;
        indir();//method call
        System.out.println("Tum indirim oranlari uygulandiktan sonra etiketFiyati = " + etiketFiyati);
// static oldugu etiketFiyati yigilimli olarak degisir ve her mudahelede
//        yapilan mudahale geregince degisir ve sabit kalir.

    }//main sonu

    public static void indir() {
        etiketFiyati *= indirimOrani;
        System.out.println("etiketFiyati = " + etiketFiyati);
    }
}