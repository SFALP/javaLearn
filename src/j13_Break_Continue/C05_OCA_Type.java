package j13_Break_Continue;

public class C05_OCA_Type {
    public static void main(String[] args) {
// TASK:

        int count = 0;
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 2; col++) {
                if (row * col % 2 == 0) continue;//raw*col cift ise bekleme yapma devam ticari: count artma
                count++;
            }
        }
        System.out.println(count);
    }
}

