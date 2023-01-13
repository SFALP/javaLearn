package j35Collection.C02_Set;

import java.util.Arrays;
import java.util.HashSet;

/*
    Task
    Parametre olarak bir String HashSet   ve  iki String alan  return type HashSet
   olan  changeSet() isminde bir method oluşturun.
    Eğer HashSet String 1 e sahipse,HashSet'in  String 1 elemanını String 2 ile değiştirin.
    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
     */
public class Task01 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>(Arrays.asList("banana", "strawberry", "kiwi", "pineapple"));
        String s1 = "banana";
        String s2 = "peach";
        System.out.println("Ilk tanimlanan HashSet: " + hs);
        System.out.println("Yenilenmis HashSet: " + changeSet(hs, s1, s2));
    }

    public static HashSet<String> changeSet(HashSet<String> hs, String s1, String s2) {
        if (hs.contains(s1)) {
            hs.remove(s1);
            hs.add(s2);
        } else System.out.println("Aradiginiz ifade bulunamadi");
        return hs;
    }
}
    /* F1661-Gulsum COZUMU:
     HashSet<String>hs=new HashSet<>(Arrays.asList("banana" , "strawberry" , "kiwi" , "pineapple"));
        String str1 = "banana";
        String str2 = "peach";
        System.out.println(changeSet(hs, str1, str2));
    }

    private static HashSet changeSet(HashSet<String> hs, String str1, String str2) {
        if (hs.contains(str1)){
            hs.remove(str1);
            hs.add(str2);
        }
        return hs;

     */
