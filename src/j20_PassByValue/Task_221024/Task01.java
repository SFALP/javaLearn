package j20_PassByValue.Task_221024;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
      Task:

    Create 2D ArrayList which can store String ArrayLists
    Create 3 ArrayLists which are Employees, Employers, Companies
    Store this 3 ArrayList in 2D ArrayList
    String data type ArrayList'leri depolayabilen 2D ArrayList create ediniz
    Çalışanlar, İşverenler, Şirketler olmak üzere 3 ArrayListesi oluşturun
    Bu 3 ArrayList'i 2D ArrayList'te saklayın
     */
public class Task01 {
    public static void main(String[] args) {

        ArrayList<String> isci = new ArrayList<>(List.of("Ozge", "Tuana", "Fahriye"));
        System.out.println(isci);
        ArrayList<String> isveren = new ArrayList<>(List.of("Orban", "Takayaki", "Fred"));
        System.out.println(isveren);
        ArrayList<String> sirket = new ArrayList<>(List.of("Opel", "Toyota", "Ford"));
        System.out.println("sirket = " + sirket);
        System.out.println();

        ArrayList<ArrayList<String>> ikiBoyutList = new ArrayList<>(List.of(isci, isveren, sirket));
        System.out.println("ikiBoyutList = " + ikiBoyutList);
    }
}