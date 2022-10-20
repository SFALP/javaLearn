package Practice_.Day08_221017;

import java.util.Arrays;

/*  you have a string "HeySiri"
 * with arrays change it to "ByeSiri" and write changing array
 *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )

 */
public class Q03_Arrays {
    public static void main(String[] args) {

        String str = "HeySiri";
        str=str.replace("Hey","Bye");
        System.out.println(str);
        String str1[] = new String[1];
        str1[0]=str;

        System.out.println(Arrays.toString(str1));
    }
}