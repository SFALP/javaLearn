package j12_Loops.L01_ForLoop.HW_20221006;

public class Odev08_TekSayilar {

    public static void main(String[] args) {

        /*100'den 0'a kadar bütün tek sayıları yazdırınız.
        99-98-97-96....
        100 ve 0 dahil değildir.*/
        for (int i = 99; i >0 ; i-=2) {
            System.out.print(i+"-");
        }
    }
}