package j12_Loops.L01_ForLoop.Task;
/*
    A
    A B
    A B C
    A B C D
    A B C D E
    A B C D E F
    şeklini yazdırınız.  65=A'nın ascıı değeri
    */

public class Task11_Nest_For_Ucgen_Alfabe {
    public static void main(String[] args) {

        int harf=65;
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print((char)(harf+j)+" ");//type casting yapilir. ASCII degerini bu sekilde donusturur.
            }
            System.out.println("");
        }

    }
}