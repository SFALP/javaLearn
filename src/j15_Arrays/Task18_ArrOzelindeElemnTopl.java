package j15_Arrays;

import java.util.Arrays;

public class Task18_ArrOzelindeElemnTopl {
    public static void main(String[] args) {

//TASK: sayi array'deki iç arraylerin toplamini yeni bir array'e atayip print eden kod create ediniz.
// input:    int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};
        // output: int yeniArr[]={6,11,-7}

        int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};
        int yeniArr[] = new int[sayi.length];

        int toplam = 0;
        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[i].length; j++) {
                yeniArr[i] += sayi[i][j];
                toplam++;
            }
        }
        System.out.println("Ic arraylerin elemanlarinin toplamı : " + Arrays.toString(yeniArr));

    }
}