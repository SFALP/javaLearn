package Practice_.Day09_221018;
/*
   Find the middle element in an integer array
   Example:  (10, 5, 6) ==> (5, 6, 10) ==> Output=6
             (16, 5, 8, 10) ==> (5, 8, 10, 16) ==> Output=(8+10)/2 = 9
*/

import java.util.Arrays;
import java.util.Collections;

public class Q05_ArrayList {
    public static void main(String[] args) {

        int arr[] = {16, 5, 8, 10};
        Arrays.sort(arr);
        if (arr.length % 2 == 1) {
            System.out.println("Ortadaki eleman: " + arr[(arr.length - 1) / 2]);
        } else
            System.out.println("Ortadaki eleman: " + (arr[((arr.length) / 2) - 1] + arr[arr.length / 2]) / 2);
    }
}