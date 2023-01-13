package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task01 {
    public static void main(String[] args) {
/*
TASK--> Verilen bir Integerlist'in tek olan elemanlarinin karesini tersten iterator ile print eden cod create ediniz.
 */
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));

        ListIterator<Integer> it1 = l1.listIterator();
        while (it1.hasNext()) {
            int sayi = it1.next();
            if (sayi % 2 == 1) {

                it1.set(sayi * sayi);
            } else it1.remove();

        }
        while (it1.hasPrevious()) {
            System.out.print(it1.previous() + " ");
        }
    }
}