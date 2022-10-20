package j15_Arrays;

public class Task15_MdArrayCarp {
    public static void main(String[] args) {
//TASK: arr tum elemanlarinin carpimini yazdiriniz.

        int sayi[][] = {{1, 2, 3}, {9, 8}};
        int carpim = 1;

        for (int i = 0; i < sayi.length; i++) {//kat kontrolu
            for (int j = 0; j < sayi[i].length; j++) {//daire kontrolu
                carpim *= sayi[i][j];
            }
        }
        System.out.println("Arrayin tum elemanlarinin carpimi: " + carpim);
    }
}