package j25_Encapsulation.encapsulation02;

public class Runner {
    public static void main(String[] args) {
        Kisi obj1 = new Kisi("Alex", "De Souza", 45, "Fener1907");

        System.out.println("Degisim oncesi obj1.ad = " + obj1.ad);//Degisim oncesi obj1.ad = Alex
        obj1.ad = "Guzel Insan Alex";
        System.out.println("Degisim sonrasi obj1.ad = " + obj1.ad);//Degisim sonrasi obj1.ad = Guzel Insan Alex
        System.out.println("obj1.soyad = " + obj1.soyad);//obj1.soyad = De Souza
        obj1.setYas(-49);
        System.out.println("obj1.getYas() = " + obj1.getYas());//obj1.getYas() = -49
    }
}