package j10_StringManipulations;

public class C11_ValueOf_parse {
    public static void main(String[] args) {
        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
// Stringlerle matematiksel islemler yapabilmemizi saglar.

//valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
//olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

// Task --> String type verilen 2 adet bagis miktarini toplayan code create ediniz.

        String a="123";
        String b="456";

int a1=Integer.valueOf(a);//Bu satırda string ifadeler intiger değere dönüştürülür.
int b1=Integer.valueOf(b);//Bu satırda string ifadeler intiger değere dönüştürülür.

        System.out.println(a+b);//123456.  Bu satırda concatanation yapar.
        System.out.println(a1+b1);//579.  Bu satırda string ifadeler intiger'a döndüğü için toplama işlemi yapılabilmektedir.

 int fetih=Integer.valueOf("1453");//Value of yapisinin içine kendimiz de deger tanimlayabiliriz.
        //Böylelikle yukaridaki string deger integer'a donusturulmus olur.
        System.out.println("Toplam bagis: " + (Integer.parseInt(a) + Integer.parseInt(b)));//579. parseInt yapisi de string'i integer degere cevirir.

       int x=1234567;
       String x1= String.valueOf(x);//Bu satirda intiger deger, String degere donusturulmus olur.
       System.out.println("x1 + x=  " +(x1+x));//12345671234567 yazacaktır. Çünkü bir int ile string toplanamaz
        // sadece concatanation yapilabilir.

    String f="$150";
int yenif=Integer.valueOf(f);
        System.out.println(yenif);//$ işaretinden dolayi bu ifade bu şekilde intiger'a dönmez.
        // Dolayisiyla öncelikle $ işareti ortadan kaldirilmalidir. Bu kaldirma işlemi de replaceAll ile yapilabilir.
    }
}