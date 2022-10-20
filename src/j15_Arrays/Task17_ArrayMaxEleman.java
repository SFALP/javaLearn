package j15_Arrays;

public class Task17_ArrayMaxEleman {
    public static void main(String[] args) {
// sayi arrayindeki en buyuk elemani print eden code create ediniz.

        int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};

        int maxEleman = sayi[0][0];
        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[i].length; j++) {
                if (sayi[i][j] > maxEleman) {
                    maxEleman = sayi[i][j];
                }
            }
        }
        System.out.println("En buyuk eleman: " + maxEleman);//En buyuk eleman: 24
    }
}