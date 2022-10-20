package j15_Arrays.Odev_20221013;

import java.util.Arrays;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */
String obst[]={"Apple","Orange","Banana","Pineapple"};
boolean flag=false;
        for (int i = 0; i <obst.length ; i++) {
            if (obst[i].equals("Apple")){
                flag=true;
                break;
            }
        }if (flag) {
            System.out.println("Apple ifadesi array'de bulunmaktadir");
        }else System.out.println("Apple ifadesi array'de bulunmamaktadir");
    }
}