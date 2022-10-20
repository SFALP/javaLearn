package Practice_.Day02_220920;

public class Q03_IncrementDecrement {
    public static void main(String[] args) {
        System.out.println("**** ARTIRMA ****");
        int a = 1;
        System.out.println(++a);//2
        System.out.println(a++);//2 yazar ama değeri 3'e yükselir. Bu bilgi, pc'nin hafızasında tutulur.
        System.out.println(a);//3

        System.out.println("**** AZALTMA ****");
        int b = 5;
        System.out.println(--b);//Yazdırılan 4, değer de 4'tür.
        System.out.println(b--);//Yazdırılan 4, ancak değer 3'e düşer.
        System.out.println(b);//Yazdırılan3, değer de 3'tür.

        System.out.println("*** SORU 1***");
        int x = 20;
        int y = 15;

        System.out.println(++x + y--);//36
        System.out.println("x = " + x);//21
        System.out.println("y = " + y);//14

        System.out.println("--- Soru 1");
        System.out.println(++x + --y);// 35
        System.out.println("x = " + x);//22
        System.out.println("y = " + y);//13

        System.out.println("--- Soru 2");
        int k = 5;
        System.out.println(++k + k++ + k++ + --k + k-- + k);//6+6+7+7+7+6 = 39
        System.out.println("k = " + k);//6
    }
}
