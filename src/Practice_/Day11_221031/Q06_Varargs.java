package Practice_.Day11_221031;

// // Create a multiply method with double varargs (return double)
public class Q06_Varargs {
    public static void main(String[] args) {
        System.out.println(carpim1(2.5, 1.4, 1.9, 0.4));
    }

    public static double carpim1(double... sayi) {
        double carpim = 1;
        for (double w : sayi) {
            carpim *= w;
        }
        return carpim;
    }
}