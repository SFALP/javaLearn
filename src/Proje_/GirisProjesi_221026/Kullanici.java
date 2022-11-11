package Proje_.GirisProjesi_221026;

import java.time.LocalDateTime;
//1.STEP(SORUDA)
public class Kullanici {//Kullanici objesi uretecek POJO (Kaliphane) Class'tir

    String name;//objede deger alacak instance variable'dir.
    LocalDateTime kayitZamani;//objede deger alacak instance variable'dir.

    public Kullanici(String name, LocalDateTime kayitZamani) {//teleskopik (full parametreli) Constructor olusturuldu.
        this.name = name;
        this.kayitZamani = kayitZamani;
    }

    @Override
    public String toString() {//bu class'tan olusturulan objeleri yazdirir
        return "name='" + name + '\'' +
                ", kayitZamani=" + kayitZamani +
                '}';
    }
}