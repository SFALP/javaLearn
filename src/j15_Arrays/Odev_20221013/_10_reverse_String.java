package j15_Arrays.Odev_20221013;

import java.util.Arrays;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
String str="Hello World";
        String yeniStr[]=str.split("");
        System.out.println("Parcalanarak olusturulan array: "+ Arrays.toString(yeniStr));
        System.out.println("Arrayin tersten yazilmis hali: ");
        for (int i = yeniStr.length-1; i >=0 ; i--) {
            System.out.print(yeniStr[i]);
        }
    }
}