package Practice_.Day08_221017;

import java.util.Arrays;

/*
 * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
 * yaziniz
 * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
 *
 * OUTPUT : Arraydeki cift sayilarin toplami : 30
 */
public class Q09_Arrays_CiftSayToplaYaz {
    public static void main(String[] args) {

int arr[][]={{1,3,6},{2,8},{5,7,9,14}};

        System.out.println("Tanimlanan array: "+ Arrays.toString(arr));
        int toplam=0;
        System.out.println("Arrayin cift sayilari: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0){
                    System.out.print(arr[i][j]+" ");
                toplam+=arr[i][j];
                }
            }
        }
        System.out.println("Array'de yer alan cift sayilarin toplami: "+toplam);

    }
}
