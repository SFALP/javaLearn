package Practice_.Day09_221018;

import java.util.ArrayList;

/*
 *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
 *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
 */
public class Q02_Arrays {
    public static void main(String[] args) {

        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        System.out.println(str.replace(" ", "").length());//58

        String arr[]=str.replace(" ","").split("");
        System.out.println(arr.length);//
    }
}