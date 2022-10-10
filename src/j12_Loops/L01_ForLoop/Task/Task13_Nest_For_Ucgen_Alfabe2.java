package j12_Loops.L01_ForLoop.Task;
/*
A
B B
C C C
D D D D
E E E E E
F F F F F F
şekli yazdırınız
A'nın ASCII degeri 65'tir.
 */

public class Task13_Nest_For_Ucgen_Alfabe2 {
    public static void main(String[] args) {

        int h=65;//A'nin ASCII degeridir.
        for (int i = 1; i <=6 ; i++) {//apartman dongu
            for (int j = 1; j <=i ; j++) {//daire dongu
                System.out.print((char) h+" ");//ASCII'nin karaktere donusturulerek yazdirilmasi satiridir.
            }h++;
            System.out.println("");//dummy
        }
    }
}