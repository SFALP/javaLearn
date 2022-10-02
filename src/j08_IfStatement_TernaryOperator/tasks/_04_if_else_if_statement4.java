package j08_IfStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _04_if_else_if_statement4 {

    public static void main(String[] args) {

     /* double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */
        double a = 20;
        double b = 90;
        if (a > b) {
            System.out.println("Double 1 is greater than Double 2");
        } else
            System.out.println("Double 1 is smaller than Double 2");
    }
}