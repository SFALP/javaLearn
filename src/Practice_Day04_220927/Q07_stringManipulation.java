package Practice_Day04_220927;

import java.util.Scanner;

public class Q07_stringManipulation {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
 /// 1.ÇÖZÜM:
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir ifade tanimlayiniz");
        String a= scan.nextLine();
        if (a.contains("xyz")){
            System.out.println("true");
        }else
            System.out.println("false");
/// 2.ÇÖZÜM:
        System.out.println("******* 2.ÇÖZÜM ******(Input degeri farklı tanımlandigi için sonucda farklı çıktı)****");
        String s = "xyaz";
        boolean xyzIceriyorMu = false;
        if(s.contains("xyz")){
            xyzIceriyorMu = true;
            System.out.println(xyzIceriyorMu);
        }else {
            xyzIceriyorMu=false;
            System.out.println(xyzIceriyorMu);
        }
    }
}