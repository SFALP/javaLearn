package j15_Arrays;

import java.util.Arrays;

public class Task12_ArrKaresiYaz {

    public static void main(String[] args) {
		/* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

        int arr[] = {2, 6, 4, 5, 8, 9};
        System.out.println("Tanimlanan array: "+Arrays.toString(arr));
        int kareArr[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]+" sayisinin karesi: "+(arr[i]*arr[i]));
  kareArr[i]=arr[i]*arr[i];
        }
        System.out.println("Array elemanlarinin karesi: "+Arrays.toString(kareArr));
    }
}