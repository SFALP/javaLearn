package Practice_.Day11_221031.Printf;
// verilen sayilar icin carpim tablosunu olusturunuz
public class C02_CarpimTablosu {
    /*
         Ornek :
            input  : 5
            output : 1  2  3  4  5
                     2  4  6  8 10
                     3  6  9 12 15
                     4  8 12 16 20
                     5 10 15 20 25
     */

    public static void main(String[] args) {
int tableInput=5;
        multipleTable(tableInput);
    }

    public static void multipleTable(int tableInput) {
        for (int i = 1; i <=tableInput ; i++) {
            for (int j = 1; j <=tableInput ; j++) {
                System.out.printf("%-5d",i*j);
            }
            System.out.println();
        }
    }
}
