package j12_Loops.L01_ForLoop.Task;

public class Task06_Nest_For_CarpimTab {
    // 1 x 1 = 1
// 1 x 2 = 2
// 1 x 3 = 3
// 1 x 4 = 4
// 1 x 5 = 5
// 1 x 6 = 6
// 1 x 7 = 7
// 1 x 8 = 8
// 1 x 9 = 9
// 1 x 10 = 10
// Yuarıdaki çarpım tablosunu 10 'lara kadar print eden code create ediniz.
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("\n" + i + " için Carpim Tablosu");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }
}