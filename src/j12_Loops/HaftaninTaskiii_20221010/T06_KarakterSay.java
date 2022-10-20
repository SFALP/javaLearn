package j12_Loops.HaftaninTaskiii_20221010;

import java.util.Arrays;
import java.util.Scanner;
//BU CEVAP YARIM!!!! KARAKTER SAYISI YAZDIRILAMAMAKTADIR
public class T06_KarakterSay {
    public static void main(String[] args) {
        /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */

        Scanner sc=new Scanner(System.in);
        System.out.print("Lutfen bir ifade tanimlayiniz: ");
String text=sc.nextLine().toLowerCase().trim();
String text2=text.replaceAll("\\s","");

//        String str = "Javacilar cook afilli";

        String arr[]=new String[text2.length()];
        for (int i = 0; i < text2.length(); i++) {
            arr[i]=text2.substring(i,i+1);
        }
        System.out.println(Arrays.toString(arr));
        int harfSayisi=0;

        System.out.println(Arrays.toString(arr[2].toCharArray()));

        for (int i = 0; i <arr.length ; i++) {
if (Arrays.toString(arr[i].toCharArray()).equals(arr[i]))
            harfSayisi++;
        }
        System.out.println(+harfSayisi);


    }

}


  // Scanner scan = new Scanner(System.in);
//	System.out.println("ifade gir : ");
  //         String str = scan.nextLine();
  //         String tekKarakter = "";
  //         for (int i = 0; i <= str.length() - 1; i++) {
  //         int flag = 0;
  //         for (int j = 0; j < i; j++) {
  //     if (str.charAt(i) == str.charAt(j)) {
  //     flag = 1;
  //     break;}
  //     }
  //     if (flag == 0) {
  //     tekKarakter += str.charAt(i);}
  //     }
  //     System.out.println(tekKarakter);
  //     for (int i = 0; i <= tekKarakter.length() - 1; i++) {
  //     int count = 0;
  //     for (int j = 0; j <= str.length() - 1; j++) {
  //     if (tekKarakter.charAt(i) == str.charAt(j)) {
  //     count++;}
  //     }System.out.println(tekKarakter.charAt(i) + " karakterden " + count + " tane var");
  //     ​
  //     }