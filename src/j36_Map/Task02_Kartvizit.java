package j36_Map;

public class Task02_Kartvizit {//pojo--> Obje uretilecek
String Isim;
String Mail;
String Adres;
String Telefon;

int id=100;

    public Task02_Kartvizit(String isim, String mail, String adres, String telefon) {
        Isim = isim;
        Mail = mail;
        Adres = adres;
        Telefon = telefon;
        this.id = id;
    }

    @Override
    public String toString() {
        return  "Isim='" + Isim + '\'' +
                ", Mail='" + Mail + '\'' +
                ", Adres='" + Adres + '\'' +
                ", Telefon='" + Telefon + '\'';
    }
}
