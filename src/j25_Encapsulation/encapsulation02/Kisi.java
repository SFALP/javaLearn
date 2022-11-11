package j25_Encapsulation.encapsulation02;

public class Kisi {//POJO Class
    /*
    Kisi POJO class icin fields--> Ad, Soyad, Password(String), yas
    tum field'lari kullanici gorebilmelidir ve password haric update edebilmelidir.
    Password encapsulated, update edilmemelidir. ve yas variable negatif deger girilmeye karsi encapsulated yapilmalidir.

    runner class'da obj ile field'lari print eden code create ediniz.
     */
    // fields
    String ad = "";
    String soyad = "";
    private int yas;
    private String password = "";

    public Kisi(String ad, String soyad, int yas, String password) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.password = password;
    }

    public void setYas(int yas) {
        if (yas < 0) {
            this.yas = yas * (-1);
        } else this.yas = yas;
        //this.yas = Math.abs(yas);//parametre gelen yas eksiden kurtularak instance deger atandi
    }

    public int getYas() {
        return yas;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", password='" + password + '\'';
    }
}