package Practice_.Day11_221031;


import java.time.LocalDateTime;

public class Q03_FirstTenSecond {
    public static void main(String[] args) {
//Local time ile (//her dakikanin ilk 10 saniyesi)

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("ldt = " + ldt);
        if (ldt.getSecond() <= 10) {
            System.out.println("Ilk 10 saniye icindedir :=)");
        } else System.out.println("Ilk 10 saniye disindadir.");
    }
}