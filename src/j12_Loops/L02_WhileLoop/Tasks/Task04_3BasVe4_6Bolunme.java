package j12_Loops.L02_WhileLoop.Tasks;

public class Task04_3BasVe4_6Bolunme {

    public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */

        int tamBolen = 0;
        System.out.println(" *** WHILE COZUM *** ");
        System.out.println("4 ve 6 ya tam bolunen 3 basamakli sayilar: \n");
        int j = 999;
        while (j > 99) {
            if (j % 4 == 0 && j % 6 == 0) {
                System.out.print(j + " ");
                tamBolen++;
            }
            j--;
        }System.out.println("\n(" + tamBolen + ") fakli sayi bulunmaktadir.");
      //System.out.println(" *** FOR COZUMU *** ");
      //for (int i = 999; i > 99; i--) {
      //    if (i % 4 == 0 && i % 6 == 0) {
      //        System.out.print(i + " ");
      //        tamBolen++;
      //    }
      //}
      // System.out.println("\n(" + tamBolen + ") fakli sayi bulunmaktadir.");
    }
}