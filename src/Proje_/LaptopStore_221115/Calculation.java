package Proje_.LaptopStore_221115;

import java.util.ArrayList;

public class Calculation {

    public static int getRam(ArrayList<String> arr) {
        int price = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).contains("32gb")) {
                price += 300;
            }
            if (arr.get(i).contains("16gb")) {
                price += 200;
            }
            if (arr.get(i).contains("8gb")) {
                price += 100;
            }
            if (arr.get(i).contains("4gb")) {
                price += 50;
            }

        }
        return price;
    }
    public static int getCPU(ArrayList<String> arr) {
        int price = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).contains("i3")) {
                price += 200;
            }
            if (arr.get(i).contains("i5")) {
                price += 300;
            }
            if (arr.get(i).contains("i7")) {
                price += 500;
            }


        }
        return price;
    }
    public static int getColor(ArrayList<String> arr) {
        int price = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).contains("Red")) {
                price += 400;
            }
            if (arr.get(i).contains("Orange")) {
                price += 300;
            }
            if (arr.get(i).contains("Silver")) {
                price += 200;
            }
            if (arr.get(i).contains("Black")) {
                price += 150;
            }


        }
        return price;
    }
    public static int getSize(ArrayList<String> arr) {
        int price = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).contains("Min")) {
                price += 100;
            }
            if (arr.get(i).contains("Middle")) {
                price += 200;
            }
            if (arr.get(i).contains("Max")) {
                price += 300;
            }

        }
        return price;
    }

}

