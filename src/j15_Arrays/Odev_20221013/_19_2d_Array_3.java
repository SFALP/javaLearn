package j15_Arrays.Odev_20221013;

import java.util.Arrays;

public class _19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */
        String str1[][] = {{"new jersey", "atlanta", "ohio"},
                {"Pittsburgh", "ohio", "new york", "ohio"},
                {"ohio", "new york"}};
        System.out.println("Mevcut array: " + Arrays.deepToString(str1));

        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str1[i].length; j++) {
                if (str1[i][j] == "ohio") {
                    str1[i][j] = "Florida";
                }
            }
        }
        System.out.println("\nYeni array: " + Arrays.deepToString(str1));


    }
}

