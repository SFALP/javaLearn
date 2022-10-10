package j12_Loops.L01_ForLoop.HW_20221006;

public class Odev07_SayiHarmonisi {

    public static void main(String[] args) {


//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15
        int k = 5;
        for (int i = 1; i <= k; i++) {
            int f = k - 1;
            int v = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(v + " ");
                v += f;
                f--;
            }
            System.out.println();
        }
    }
}