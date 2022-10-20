package Frei_Ubungen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class U221015_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> xyz=new ArrayList<>();
        xyz.add(10);
        xyz.add(12);
        xyz.add(14);
        xyz.add(16);
        System.out.println("xyz = " + xyz);
        ArrayList<String> abc=new ArrayList<>(List.of("Istanbul", "Ankara","Izmir","Adana","Antalya"));
        System.out.println("abc = " + abc);

ArrayList<String>fb=new ArrayList<>(Collections.nCopies(3,"Fener"));
        System.out.println("fb = " + fb);

        abc.addAll(2,fb);
        System.out.println("abc = " + abc);

        ArrayList<Integer>rakam=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rakam.add(i);

        }
        System.out.println("rakam = " + rakam);

        System.out.println(abc.indexOf(3));
        System.out.println(xyz.lastIndexOf(10));
        System.out.println(rakam.lastIndexOf(11));
        abc.add(2,"Diyarbakir");
        System.out.println(abc);
        System.out.println("abc.size() = " + abc.size());
        System.out.println("xyz.size() = " + xyz.size());
        rakam.add(20);
        System.out.println("rakam.size() = " + rakam.size());
        System.out.println("abc.set(1,\"Kayseri\") = " + abc.set(1, "Kayseri"));
        System.out.println(abc);
        System.out.println(abc.subList(2,4));
        ArrayList<String> yeniAbc=new ArrayList<>(abc.subList(6,9));
        System.out.println("yeniAbc = " + yeniAbc);
        System.out.println("yeniAbc.get(yeniAbc.size()-1) = " + yeniAbc.get(yeniAbc.size() - 1));
        System.out.println("fb.isEmpty() = " + fb.isEmpty());
        fb.clear();
        System.out.println("fb.isEmpty() = " + fb.isEmpty());
        System.out.println("yeniAbc.equals(abc) = " + yeniAbc.equals(abc));
        Collections.sort(xyz);
        System.out.println("xyz = " + xyz);
        Collections.reverse(rakam);
        System.out.println("rakam = " + rakam);
        System.out.println("abc.contains(\"Trabzon\") = " + abc.contains("Trabzon"));
        System.out.println("rakam.contains(4) = " + rakam.contains(4));
        System.out.println("xyz.remove(4) = " + xyz.remove(2));
        System.out.println("xyz = " + xyz);
        abc.remove("Adana");
        System.out.println(abc);


    }
}
