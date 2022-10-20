package j15_Arrays;

public class Task16_MdArraySonElemanCarp {
    public static void main(String[] args) {

// TASK: sayi arrayindeki son elemanlarin carpimini print eden kod yaziniz.

        int sayi[][] = {{1, 2, 3}, {9, 8}, {24, 0, 4}};
        int carpim = 1;

        for (int kat = 0; kat < sayi.length; kat++) {
            carpim *= sayi[kat][sayi[kat].length - 1];
        }
        System.out.println("Son elemanlarin carpimi: " + carpim);//96 --> 3*8*4
    }
}