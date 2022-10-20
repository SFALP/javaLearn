package j14_Scope;
/* instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
    ogrenci notlari veya ogretmen branslari gibi
    bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

   Static variabler ise class variable olarak tanimlanir
   ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
   eger static variable'in degeri degistirilirse herkes icin degisir


 */


public class C02_Static_Variables {

    static String firmaname = "Clarusway";
    static int firmaID;
    static boolean firmaIT;//gunes

    public static void main(String[] args) {//main basi

        System.out.println("firmaID = " + firmaID);//0 (Default deger)
        firmaID = 1001;
        System.out.println("firmaID = " + firmaID);//1001
        C02_Static_Variables.firmaIT = true;//classname ile static variable call edildi --> bad practice

        staticMetot();//static metot, static main'e call edildi. astral galaxy seyahat
//non_staticMethod();// sefil dunyali galaxy2e cikamaz.
    }//main sonu

    public static void staticMetot() {// static metot -> galaxy
        firmaID = 2002; //static variable call edildi.
        System.out.println("agam yeni ID hayirli olsun: " + firmaID);


    }

    public void staticMethod() {//non static method (Yani dunya)

        firmaname = "javaCAN";//
        System.out.println("Yani firma ismi: " + firmaname);


    }
}
