package j36_Map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task05 {
    //Task->   TreeMap Kullanarak Bir cumlenin içindeki harflerin frekansını(adetini) hesaplayıp print  code create ediniz
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence...");
        String sentence = scan.nextLine();

        Map<Character, Integer> frekans = new TreeMap<>();

        for (int i = 0; i < sentence.length(); i++) {

            char c = sentence.charAt(i);

            if (frekans.containsKey(c)) {
                frekans.replace(c, frekans.get(c) + 1);
            } else {
                frekans.put(c, 1);
            }

        }

        for (Map.Entry<Character, Integer> entry : frekans.entrySet()) {
            System.out.println("Karakter " + entry.getKey() + " " + entry.getValue() + " kadar var...");
        }


    }
}
/*
F4970-Ozge COZUMU
 public static void main(String[] args) {
​
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir cümle giriniz: ");
        String str=scanner.nextLine();
​
        TreeMap<Character,Integer> list= new TreeMap<>();
           for (int i =0; i<str.length(); i ++) {
              char c= str.charAt(i);
​
             if (list.containsKey(c)){
                 list.replace(c,list.get(c)+1);
            }else{
              list.put(c,1);
            }
        }
        for (Map.Entry<Character,Integer> list2: list.entrySet()){
            System.out.println(list2.getKey() + "-> " + list2.getValue() + " tane var");
		} }}
 */
