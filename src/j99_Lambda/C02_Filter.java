package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Filter {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 59, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        System.out.println("\n   ***    ");

        printCiftElemanStructured(sayi);//24 38 42 66 46 16
        System.out.println("\n   ***    ");
        printCiftElemanFuntional(sayi);//24 38 42 66 46 16
        System.out.println("\n   ***    ");
        printCiftElemanFuntional1(sayi);//24 38 42 66 46 16
        System.out.println("\n   ***    ");
        printCiftElemanFuntional2(sayi);//24 16
        System.out.println("\n   ***    ");
printCiftElemanFuntional3(sayi);//24 38 59 42 66 75 45 46 55 35 67 16

    }// Main sonu

//TASK: "Structured Programming"(Amele Cod) kullanarak list elemanlarını çiftlerini aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printCiftElemanStructured(List<Integer> sayi) {//Amele method
        for (Integer w : sayi) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

//TASK: "Funktional Programming"(Cincix Cod) kullanarak list elemanlarını çiftlerini aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printCiftElemanFuntional(List<Integer> sayi) {//cincic code
        sayi.
                stream().//list elemanlari yukaridan asagi akisa alindi
                filter(t -> t % 2 == 0).// akistaki list elemanlari cift olma sartina gore filtrelendi: akistan ckarildi
                forEach(C01_LambdaExpression::yazdir);//C01 Class'ta yazdir method refere(call) edildi
    }

    public static void printCiftElemanFuntional1(List<Integer> sayi) {//cincic code
        sayi.
                stream().//list elemanlari yukaridan asagi akisa alindi
                filter(C01_LambdaExpression::ciftMi).// akistaki list elemanlari cift olma sartina gore filtrelendi:method referans best practice
                forEach(C01_LambdaExpression::yazdir);//C01 Class'ta yazdir method refere(call) edildi
    }
//TASK: "Funktional Programming"(Cincix Cod) kullanarak list elemanlarını 35'den kucuk ve cift olanlari aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printCiftElemanFuntional2(List<Integer> sayi) {//cincic code
        sayi.
                stream().//list elemanlari yukaridan asagi akisa alindi
                filter(C01_LambdaExpression::ciftMi).// akistaki list elemanlari cift olma sartina gore filtrelendi:method referans best practice
                filter(t -> t < 35 /* && t%2==0*/).// akistaki list elemanlari cift ve 35'ten kucuk olma sartina gore filtrelendi:method referans best practice
                forEach(C01_LambdaExpression::yazdir);//C01 Class'ta yazdir method refere(call) edildi
    }

//TASK(ODEV): "Funktional Programming"(Cincix Cod) kullanarak list elemanlarını 34'den buyuk veya cift olanlari aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printCiftElemanFuntional3(List<Integer> sayi) {//cincic code
        sayi.
                stream().//list elemanlari yukaridan asagi akisa alindi
                //filter(C01_LambdaExpression::ciftMi).// akistaki list elemanlari cift olma sartina gore filtrelendi:method referans best practice
                filter(t -> t > 34 || t%2==0).// akistaki list elemanlari cift ve 35'ten kucuk olma sartina gore filtrelendi:method referans best practice
                forEach(C01_LambdaExpression::yazdir);//C01 Class'ta yazdir method refere(call) edildi
    }







}