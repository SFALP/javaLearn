package Interview.Day01_221107;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
    /*
      Kullanicidan bir String aliniz.
      String'de var olan her character'in sayisini ekrana yazdiriniz.
      Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
             abaa   ==> a=3  b=1
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen bir ifade tanimlayiniz: ");
        String str = sc.nextLine();

        //split
        String arr[] = str.split("");//her bir karakteri ayirir
        System.out.println(Arrays.toString(arr));

        //sort()
        Arrays.sort(arr);
        System.out.println("Ascending sirali: " + Arrays.toString(arr));

        //count sayaci olustur.
        int count = 0;

        //karakterleri karsilastirmak icin for loop 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {//1'den fazla karakter icin
                count++;
            } else {// tek sayidaki karakter icin calisir
                System.out.println(arr[i - 1] + " sayisi " + (count + 1));
                count = 0;
            }
            if (i == arr.length - 1) {//en sondaki karakter benzersiz ise calisir
                System.out.println(arr[i] + " sayisi " + (count + 1));
            }
        }
    }
}