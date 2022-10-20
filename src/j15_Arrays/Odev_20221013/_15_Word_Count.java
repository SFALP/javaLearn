package j15_Arrays.Odev_20221013;

import java.util.Arrays;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */
String str="Removes white space from both ends of a string";

String str2[]=str.split(" ");
        System.out.println(Arrays.toString(str2));
        System.out.println("Array'deki kelime sayisi: "+str2.length);
    }
}