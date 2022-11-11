package Practice_.Day11_221031;

public class Q05_Varargs {
    public static void main(String[] args) {

//istedigimiz kadar sayi girdigimizde toplamini bize veren method create ediniz
        sumZahl(14,12,23,-21,39);
    carp1(-4,3,12,2);
    }

    public static void carp1(int ... sayi) {
        int carp=1;
        for (int w:sayi) {
            carp*=w;
        }
        System.out.println("Carpim: "+carp);//Carpim: -288
    }

    public static void sumZahl(int ... Zahl) {
        int toplam=0;
        for (int w:Zahl) {
            toplam+=w;
        } System.out.println("Toplam: "+toplam);//Toplam: 67
    }
}