package Practice_.Day08_221017;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
      given an int array and find the squares of the elements
      (Verilen bir int dizisi icin elemanlarin karelerini bulun )
      Example:{2,6,4,5,8,9}
      output:{4,36,16,25,64,81}
      */
public class Q01_Arrays {
    public static void main(String[] args) {

        int xyz[] = {2, 6, 4, 5, 8, 9};
        int xyzKare[] = new int[xyz.length];
        for (int i = 0; i < xyz.length; i++) {
            xyzKare[i] = xyz[i] * xyz[i];
        }
        System.out.println("Karelerinin alindigi method: " + Arrays.toString(xyzKare));
    }
}