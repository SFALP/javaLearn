package HA;

public class HW_220913 {
    public static void main(String[] args) {

        /*
        TASK :
        Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
        a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan
​
	     input	: sayi1=20 ve sayi2=34;
		 output  :  sayi1=34 ve sayi2=20
​
​
​
        int sayi1=20;
        int sayi2=34;
        */

        // a)
        System.out.println("*** a çözümü ***");
        int s1=20;
        int s2=34;
        int s3;

        s3 = s1; //20
        s1 = s2; //34
        s2 = s3; //20

        System.out.println("Sayi1: "+s1);
        System.out.println("Sayi2: "+s2);


        // b)
        System.out.println("*** b çözümü ***");

        s1 = s1+s2; //54
        s2 = s1-s2; //20
        s1 = s1-s2; // 34

        System.out.println("Sayi1: "+s1);
        System.out.println("Sayi2: "+s2);
    }


}
