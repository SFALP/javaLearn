package j15_Arrays.Odev_20221013;

import java.util.Arrays;

public class _17_2d_Array {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */
int sayi[][]  ={{2,3,2} , {4,1,5} , {7,2,5}};
        System.out.println("Degisiklik oncesi: "+Arrays.deepToString(sayi));
        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[i].length; j++) {
                if (sayi[i][j]==2){
                    sayi[i][j]=6;
                }
            }
        }System.out.println("Degisiklik sonrasi: "+Arrays.deepToString(sayi));
    }
}