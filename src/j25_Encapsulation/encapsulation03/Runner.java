package j25_Encapsulation.encapsulation03;

public class Runner {//(3.Step)

    public static void main(String[] args) {
        //4.Step
        Arac merco = new Arac("Mercedes E220", "siyah", -200, 2018);
        Arac bmw = new Arac("BMW 3.20", "Lacivert", 1600, -2019);
        Arac togg = new Arac();
        togg.setModel("Pamukkale");
        togg.setMotor(2000);
        togg.setYil(2023);
        togg.setRenk("Beyaz");

        System.out.println("Merco varsa digerleri hukumsuzdur " + merco);
        System.out.println("TOGG " + togg);
        System.out.println("BMW ile ondesin " + bmw);
    }
}
