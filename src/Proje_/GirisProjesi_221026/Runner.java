package Proje_.GirisProjesi_221026;

public class Runner {
    public static void main(String[] args) {//Motor
//GirisPaneli.giris();//1.YOL. Bu kod, sadece giris panelinde yer alan class name static olmasi durumunda calisir.

        GirisPaneli girisObjesi=new GirisPaneli();
        girisObjesi.giris();//2.YOL: obje ile method call. Bu yontemde de static olmadan calistirabiliriz.
    }
}