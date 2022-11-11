package Practice_.Day10_221024;

public class C3_RandomFormula {
    public static void main(String[] args) {

        Math.random();  //0.0 ve 1.0 arasinda bir deger veriyor
        double random = Math.random();

        //eger tam sayi olarak bir deger istiyorsak *10 gibi bir sayi ile carpabiliriz.

        //eger ki bir deger araliginda olacak sekilde bir random rakam istiyorsak o zaman bize
        //verilen formulu kullanabiliriz.

        //(int) (Math.random() * ((max - min) + 1)) + min;

        int min = 10;
        int max = 90;

        int randomnum = (int) (Math.random() * ((max - min) + 1)) + min;

        System.out.println("randomnum = " + randomnum);//10-90 arasi deger belirleyip yazdirir.
    }
}