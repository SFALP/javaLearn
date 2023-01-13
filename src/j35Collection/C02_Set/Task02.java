package j35Collection.C02_Set;

import java.util.Arrays;
import java.util.LinkedHashSet;

/*
    Task->
   return tipi linkedhashset olan removing() isminde bir method oluşturun.
    Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    Eğer Stringler LinkedHashset 'in içinde varsa, silinmeli.

    Örneğin,
    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    String 1= Germany
    String 2 = USA
     Germany ve USA 'i sil.
    Set'i return et.
     */
public class Task02 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(Arrays.asList("Germany", "France", "USA", "Canada", "Mexico", "Brazil"));
        String s1="Germany";
        String s2="USA";

        System.out.println("Istenen yeni LinkedHashSet2: "+removing(lhs, s1,s2));
    }

    public static LinkedHashSet<String> removing(LinkedHashSet<String> lhs, String s1, String s2) {
    LinkedHashSet<String> lhs2=new LinkedHashSet<>();
    if (lhs.contains(s1)||lhs.contains(s2)){
        lhs.remove(s1);
        lhs.remove(s2);
    }else System.out.println("Aradiginiz String HashSet'de bulunmamaktadir");
    lhs2.addAll(lhs);
        return lhs2;
    }
}
    /*F1661-Gulsum Hanim COZUMU:
      LinkedHashSet<String> lhs=new LinkedHashSet<>(Arrays.asList( "Germany" , "France" , "USA" , "Canada" , "Mexico" , "Brazil"));
        String str1="Germany";
        String str2="USA";

        System.out.println(removing(lhs, str1, str2));
    }

    private static LinkedHashSet removing(LinkedHashSet<String> lhs, String str1, String str2) {
        if (lhs.contains(str1) || lhs.contains(str2)){
            lhs.remove(str1);
            lhs.remove(str2);

        }else System.out.println("Aradığınız String set'te bulunmamaktadır.");
        return lhs;

     */

