package Practice_.Day10_221024;

//Math.random() kullanarak cikan sayinin cift ya da tek sayi olup olmamasini kontrol edin
//Cif sayi ise cift sayi oldugunu, tek ise tek sayi oldugunu yazdiriniz

public class C4_OddEvenNumber {
    public static void main(String[] args) {

        int x= (int) (Math.random()*100);
        System.out.println("Sayi = " + x);
        if (x%2==0){ System.out.println("Sayi cifttir");
        }else System.out.println("Sayi tektir");
        System.out.println();
        System.out.println("********** 2.ALTERNATIF *******");
        int min = 5;
        int max = 95;

        int randomnum = (int) (Math.random() * ((max - min) + 1)) + min;

        System.out.println("randomnum = " + randomnum);
        System.out.println(randomnum%2==0 ? "Cifttir":"Tektir");
    }
}
