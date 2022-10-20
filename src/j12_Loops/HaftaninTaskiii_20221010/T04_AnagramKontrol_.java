package j12_Loops.HaftaninTaskiii_20221010;

import java.util.Arrays;
import java.util.Scanner;

public class T04_AnagramKontrol_ {
// BU CEVAP HATALIDIR--- KARAKTER SAYISI AYNI OLAN IKI KELIMENIN ANAGRAM OLDUGU SONUCUNU VERMEKTEDIR
    public static void main(String[] args) {
		/*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram kontrolu yapan  Java code create ediniz
			isAnagram("listen", "Silent") ==> true
		 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen ilk ifadenizi tanimlayiniz: ");
        String a1 = sc.nextLine().toLowerCase().trim();
        System.out.println("Lutfen ikinci ifadenizi tanimlayiniz: ");
        String a2 = sc.nextLine().toLowerCase().trim();

        anagram(a1, a2);

        if (a1.length() == a2.length()) {
            for (int i = 0; i < a1.length(); i++) {
                for (int j = 0; j < a2.length(); j++) {
                    if (a1.charAt(i) == a2.charAt(j)) {

                    }
                }
            }
            System.out.println("Girilen ifadeler anagramdir");
        } else System.out.println("Girilen ifadeler Anagram degildir");

    }

    public static void anagram(String a1, String a2) {
        String str1 = a1.replaceAll("\\s", "");
        String str2 = a1.replaceAll("\\s", "");
        boolean anag = true;

        if (str1.length() != str2.length()) {
            anag = false;
        } else {
            char arrA1[] = str1.toCharArray();
            char arrA2[] = str2.toCharArray();
            Arrays.sort(arrA1);
            Arrays.sort(arrA2);
            anag = Arrays.equals(arrA1, arrA2);
        }
        if (anag) {
            System.out.println("Tanimlanan (" + str1 + ") ve (" + str2 + ") ifadeleri ANAGRAM ifadelerdir.");
        } else System.out.println("Tanimlanan (" + str1 + ") ve (" + str2 + ") ifadeleri ANAGRAM degildir.");

    }
}

 //   String str1 = "listen";
 //   String str2 = "Silent";
 //   String[] arr1 = str1.toLowerCase().split("");
 //   String[] arr2 = str2.toLowerCase().split("");
 //       Arrays.sort(arr1);
 //               Arrays.sort(arr2);
 //               System.out.println(Arrays.equals(arr1, arr2));