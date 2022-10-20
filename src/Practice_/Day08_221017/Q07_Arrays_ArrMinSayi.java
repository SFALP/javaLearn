package Practice_.Day08_221017;

/*
 * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
 *  2D arrayinden min number print et
 */
public class Q07_Arrays_ArrMinSayi {
    public static void main(String[] args) {
        int arrSayi[][] = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 3}};
        int min = arrSayi[0][0];
        System.out.println("Array'in en kucuk sayiyi: ");
        for (int i = 0; i < arrSayi.length; i++) {
            for (int j = 0; j < arrSayi[i].length; j++) {
                if (arrSayi[i][j] < min) {
                    min = arrSayi[i][j];

                }
            }
        }
        System.out.println(min);
    }
}