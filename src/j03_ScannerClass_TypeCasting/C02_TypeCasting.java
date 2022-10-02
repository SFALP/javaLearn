package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {

    boolean basarılı=true;
//    String basari=basarılı;
  //      System.out.println("basarılı="+basarılı); //true
  //      System.out.println("basarı=" +basarı); //true

        double d=17; //double variable'a int 17 atandı. k>b
        System.out.println("d ="+d);//d=17.0 auto widding

        int sayi1=33;
        int sayi2=7;
        System.out.println(sayi1/sayi2);

        // Sonuç:4. Sayılar intiger atandığı için sonuç da sadece intiger kısmını kabul eder. Küsüratlı bölümü almaz.

byte b=127;
int i= b; //küçük biyiğe atanır, buna aoutowidding denir.
        System.out.println("i= "+i);//127

        int num=1453;
        double d1= 17; //k->b autowidding
        System.out.println("d1= "+d1);//1453
        //double-->b aut    int->k
        double db=d1 / num; //TRICK:İki farklı data typsayı işleme girerse
                            // Küçük olan data type için yapar sonucu büyük olan data type olarak verir.
        System.out.println("db= "+db);//db=0.01169993117687543

    /*

        byte < short < int < long < float < double
        Auto Widening Casting -> Kucuk data type'larini buyuk data typlearina
        Java  otomatik olarak yapar.
 */
        double d2=14.53;
        int num2= (int) d2; //büyük sayı küçüğe atanır.
        System.out.println("Num2: "+num2);

        int num3=150;
        byte b1=(byte) num3;
        System.out.println("b1: "+b1);//-106

        double d3= 333;
        long l= (long) d3;
        System.out.println("d3: "+d3);

        double d4= 571.444;
        long l2= (long) d4;
        System.out.println("l2: "+l2);//571
 /* TASK->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         *
         */
Scanner sc=new Scanner(System.in);//1.adım
        System.out.println("ASCII değeri istedin karakteri gir: ");//2.adım
        char ch=sc.nextLine().charAt(0);

        int chASCIIDegeri=ch;
        System.out.println(ch+ " Karakterin ASCII değeri: "+chASCIIDegeri); //$ ASCII değeri = 36










    }



}
