package Practice_.Day05_221003;

import java.util.Scanner;

public class Q01_Method_Creation {
    public static void main(String[] args) {

        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir ifade tanimlayiniz: ");
        String str = scan.nextLine().toLowerCase();

        System.out.println(xyzVarmi(str));
    xyzVarMiVoid(str);
    }
// 1. ÇÖZÜM YOLU (Return yolluyla)
    public static boolean xyzVarmi(String str) {
        System.out.println("***** 1.COZUM YOLUYLA (RETURN) ******");
        if (str.contains("xyz")) {
            return true;
        } else return false;
    }
// 2.ÇÖZÜM YOLU (VOID yapisiyla)
public static void xyzVarMiVoid (String str){
    System.out.println("***** 2.COZUM YOLUYLA (VOID) ******");
        System.out.println(str.contains("xyz")?("true"):("false"));
}
}