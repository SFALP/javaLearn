package j23_Varargs_StringBuilder.Varargs;
/*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        method body....
        }

        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISS
        2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS
        ​
        Gunun TRICK'i  köşesinde böyün :
        Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
        ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli
        */


public class C01_Varargs {
    public static void main(String[] args) {

// Task1 -> verilen iki sayi toplamını print eden METHOD create ediniz

        int s1 = 24;
        int s2 = 27;
        int s3 = 46;
        int s4 = 10;
        topla(s1, s2);//51
        topla(s3, s2);//73
        topla(s1, s4);//34
        topla(s1, s4, s3);//80
        System.out.println("   ***   VARARGS   ***   ");
        toplaVarargs(s1, 23, s2, s3);//120
        toplaVarargs(44, 23, 62, s1, s3);//199
        toplaVarargs(s2, s3);//73

//TASK 4: verilen String'lerin en fazla karaktere sahip olani print eden method create ediniz.-->
// Parametre sayisi belirli olmadigi icin Varargs kullanilmalidir.

        enUzunKelime("aga", "Ahmet", "Zeyyid");
        enUzunKelime("Sumeyra", "Abdulkadir", "Tarik");

    }//main sonu

    public static void topla(int a, int b) {

        System.out.println("Sayilar toplami: " + (a + b));
    }

// TASK2 -> verilen 3 sayi toplamını print eden METHOD create ediniz

    public static void topla(int a, int b, int c) {
        System.out.println("Sayilar toplami: " + (a + b + c));
    }

//TASK3: VARARGS method;
    public static void toplaVarargs(int... a) {//varargs method
        int toplam = 0;
        for (int w : a) {//varargs parametre array icinde tanimlandigi icin parametreler loop ile aksiyon alir.
            toplam += w;
        }
        System.out.println("Sayilarin toplami: " + (toplam));
    }

    public static void enUzunKelime(String... str) {
        String enUzun = "";
        for (String w : str) {
            if (w.length() > enUzun.length()) {
                enUzun = w;
            }
        }
        System.out.println("En uzun kelime: " + enUzun);
    }

}