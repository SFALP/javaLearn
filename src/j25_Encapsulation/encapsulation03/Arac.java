package j25_Encapsulation.encapsulation03;

/*
1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
  olan Araba  isimli bir class cretae ediniz.
2- bütün fieldları parametre alan bir constructor tanımlayınız.
3- Runner isminde main için bir class oluşturunuz.
4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
 */
public class Arac {
    // Fields(2.Step)
    private String model = "";
    private String renk = "";
    private double motor;
    private int yil;

    public Arac(String model, String renk, double motor, int yil) {//full parametreli constructor (2.Step)
        this.model = model;
        this.renk = renk;
        //       this.motor = motor;
        setMotor(motor);//set methodu call edildi.
        //       this.yil = yil;
        setYil(yil);
    }

    public Arac() {//parametresiz constructor (4.Step)
    }

    public void setYil(int yil) {
        if (yil < 0) {
            this.yil = yil * (-1);
            System.out.println("agam, milattan once arac vardi da biz mi binemedik :(");
        } else
            this.yil = yil;
    }

    public void setMotor(double motor) {
        if (motor < 1000) {
            System.out.println("agam bisiklete binseydin daha hizli giderdin :)");
            this.motor = 1001;
        } else
            this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getMotor() {
        return motor;
    }

    public int getYil() {
        return yil;
    }

    @Override
    public String toString() {
        return "Agam tekere tas degmesin :=)" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil;
    }
}