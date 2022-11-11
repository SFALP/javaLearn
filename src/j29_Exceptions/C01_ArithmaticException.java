package j29_Exceptions;

import java.util.Scanner;

public class C01_ArithmaticException {
    public static void main(String[] args) {
        //ArithmeticException --> Matematiksel islemlerde olusan RTE Exception hatasidir.

        String str = "";
//        str.charAt(2);//RTE hatasi verir.(OutofBounds hatasi)
        Scanner sc = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz: ");
        int sayi1 = sc.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        int sayi2 = sc.nextInt();
        int oran;
//        oran = sayi1 / sayi2;// sayi1=11, sayi2=0 icin ekran ciktisi; ArithmeticException: / by zero
//        System.out.println("oran = " + oran);
        try {//dene--> hatanin olma ihtimalinin oldugu kod bloklarinda kullanilir.

/*
1- try-catch kullanildiginda try block hata yakalamazsa catch block asla calismaz.
Catch block, try block bolumunda hata yakalanirsa calisir.

2- Try block, catch veya finally block olmadan CTE hatasi verir.Try block'tan sonra birden fazla catch block tanimlanabilir.
Ayni anda sadece 1 catch block calisabilir, hicbir catch blogu calismaya da bilir. Catch block'u calismak zorunda degildir.
Sadece gerekirse calisir.
3- parent-child iliskisi olan catch'lerde child once yazilmalidir. Aksi halde CTE alinir


             */

            oran = sayi1 / sayi2;//try block'ta hata yakalandigi satirdan sonra try diger satirlar degil ilgili catch block calisir.
            System.out.println("oran = " + oran);
            System.out.println("agam try block'tan selamlar");

        } catch (ArithmeticException falanFilan) {// chid Exception parent Exception (Exception e)
            System.out.println("agam bolmede bolen 0 olamaz :("+falanFilan.getMessage());
            //Exception olustugunda sadece hata mesaji print etmek icin getMessage() kullanilir.

            falanFilan.printStackTrace();//olusan Exception tum detay bilgisi print etmek icin kullanilir.

            System.out.println("agam cirak catch'den selamlar :)");

        } catch (ArrayIndexOutOfBoundsException arrayExc) {
            System.out.println("Arrayda olmayan eleman istenmektedir :)");
            // aa     } catch (Exception e) {// Exception Class, tum Exception'larin Hz Adem'i olan parent class'tir-->Bad Practice .
// catch blok ise; hata yakalandiginda yapilacak aksiyonlarin tanimlandigi bloktur. (Yani alternatif plandir)

//Exception---> olusan hata
//e --> javanin olusan exceptiona'a atayacagi obj name. Genellikle e ismi verilir.

          System.out.println("Agam 0 girdin, bolen sayi matematiksel olarak 0 olursa sonuc tanimsiz olur");
          System.out.println("Agama usta catch block'tan selamlar");

        } finally {// catch block'lardan sonra istenirse finally block kullanilabilir.
/*
try-catch icinde yapilan islemlerden sonra mutlaka calismasi gereken block varsa finally tanimlanir.
Hata durumunda catch calismazsa program sonlanir. Ama finally tanimlanirsa catch calismazsa bile program akisi devam eder.
Finally block, hata olsa da olmasa da calisir.
Cloud, database ortamlarinda, baglanti kesmek icin kullanilir. Cloud ile connection yazdiginizda cod basarili sekilde calisirsa
islem bittiginde finally block ile connection maliyet pahali olur :(.
 */
            System.out.println("Agam finally block'tan selamlar :)");
        }

//        catch (ArithmeticException falanFilan){//child exception parent exception (Exception e)'den sonra tanimlandigi icin CTE alinir.}

        System.out.println("Agam sorun handle, selametle Devamkeeee... :)");


    }
}
