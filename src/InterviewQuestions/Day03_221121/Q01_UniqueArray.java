package InterviewQuestions.Day03_221121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
 * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
 * sayilardan olusan bir array haline getiren bir program yaziniz.
 *
 * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
 * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
 */
public class Q01_UniqueArray {
    public static void main(String[] args) {

        Integer arr[] = {1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10};
        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!arrList.contains(arr[i])) {
                arrList.add(arr[i]);
            }
        }
        int[] tekarsizArr = new int[arrList.size()];
        System.out.println("arrList = " + arrList);
        for (int i = 0; i < tekarsizArr.length; i++) {
            tekarsizArr[i] = arrList.get(i);
        }
        System.out.println("array :" + Arrays.toString(tekarsizArr));

        //2.yol
        HashSet<Integer> liste = new HashSet<Integer>(Arrays.asList(1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10));
        System.out.println("liste = " + liste);
    }
}