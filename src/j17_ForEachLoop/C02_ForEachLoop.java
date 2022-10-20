package j17_ForEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {
// TASK1: Array elemanlarinin carpimini print eden code create ediniz. (with for each)
//Nested Foreach var.

        int arr[][] = {{2, 3}, {4}, {5, 6, 7}};

        int carpim = 1;

        for (int kc[] : arr) {
            for (int a : kc) {
                carpim *= a;
            }
        }
        System.out.println("Sayilarin Carpimi: " + carpim);
    }
}