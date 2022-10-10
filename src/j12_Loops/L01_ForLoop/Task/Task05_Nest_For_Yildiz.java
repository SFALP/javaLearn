package j12_Loops.L01_ForLoop.Task;

public class Task05_Nest_For_Yildiz {
    public static void main(String[] args) {
/* TASK= Asagidaki seklin ciktisini veren code create ediniz.

# # # # #
# # # # #
# # # # #
# # # # #
# # # # #

 */
        for (int i = 1; i <= 6; i++) {//dis dongu

            for (int j = 1; j <= 5; j++) {// ic dongu
                System.out.print("# ");
            }
            System.out.println("");// hayalet (dummy) komut, islemi yoktur ancak satir atlanmasini saglar.
        }

    }
}