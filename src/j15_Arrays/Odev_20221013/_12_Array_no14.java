package j15_Arrays.Odev_20221013;

import java.util.Arrays;
import java.util.Scanner;

public class _12_Array_no14 {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
         */

        int intArr[] = {1, 2, 3, 4};
        boolean flag = true;

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == 1 || intArr[i] == 4) {
                flag = false;
            } else flag = true;
        }
        if (flag) {
            System.out.println("Array elemanlari icinde 1 veya 4 ayni anda bulunmamaktadir");

        } else System.out.println("Array elemanlarin arasinda 1 veya 4'ten en az bir tanesi bulunmaktadir");
    }
}