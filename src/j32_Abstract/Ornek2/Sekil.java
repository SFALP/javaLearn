package j32_Abstract.Ornek2;

public abstract class Sekil {
    private String name;

    public Sekil(String name) {
        setName(name);
    }//parametreli parent constructor

    public Sekil() {//parametresiz parent constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alan();

    public abstract double cevre();

    @Override
    public String toString() {//obje value'lerini print eder
        return "sekil ismi =" + this.name +
                "\n Seklin Alani = " + this.alan() +
                "\n Seklin Cevresi = " + this.cevre();
    }

    public void ciz() {
        System.out.println(this.name + "çizildi...");
    }
}
