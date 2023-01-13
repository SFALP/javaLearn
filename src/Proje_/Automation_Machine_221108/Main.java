package Proje_.Automation_Machine_221108;

public class Main {
    public static void main(String[] args) {
        double accountBalance = 5;
        Urun urun = new Urun();

        Options options = new Options();
//        options.select(urun);

        urun.setPrice(options.select(urun));
        accountBalance = options.balance(urun.getPrice(), accountBalance, urun);
//        System.out.println(accountBalance);
options.purchase(urun.getPrice(), accountBalance, urun);
    }
}
