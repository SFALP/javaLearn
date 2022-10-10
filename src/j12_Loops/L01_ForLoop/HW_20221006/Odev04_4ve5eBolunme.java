package j12_Loops.L01_ForLoop.HW_20221006;

public class Odev04_4ve5eBolunme {

    public static void main(String[] args) {

        /*
        0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen  sayıları print eden coode create edinz.


         */

        //Kodu aşağıya yazınız.
        System.out.println("1-100 arasındaki hem 4 hem 5'e bolunebilen sayilar: ");
        for (int i = 1; i <=100 ; i++) {
            if (i%4==0 && i%5==0){
                System.out.print(+i+" ");
            }
        }
    }
}
