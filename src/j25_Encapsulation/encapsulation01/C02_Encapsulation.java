package j25_Encapsulation.encapsulation01;

public class C02_Encapsulation {//POJO Class
    private String name = "Gamze Hanim";
    private int id = 1001;

    public C02_Encapsulation() {
    }

    public C02_Encapsulation(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    //  public String isimVer() {//getter method
 //      return name;
 //  }

 //  public int idVer() {//getter method
 //      return id;
 //  }

 //  public void isimDegis(String isim) {//setter method
 //      this.name = isim;//name update edildi.
 //  }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", id=" + id;
    }
}

