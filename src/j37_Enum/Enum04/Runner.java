package j37_Enum.Enum04;

public class Runner {
    public static void main(String[] args) {
        Aylar ay = Aylar.NISAN;
        System.out.println("ay.ordinal() = " + ay.ordinal());//ay.ordinal() = 3
        System.out.println("ay = " + ay);//ay = NISAN
        System.out.println("ay.name() = " + ay.name());//ay.name() = NISAN
        System.out.println("ay.gunler = " + ay.gunler);//ay.gunler = 30
        ay.gunMiktari();//enum method call edildi.--> gunler = 30

    }
}
