package j18_Constructor;

public class C06_Ogrenci {//Ogrenci objesi icin kaliphane
    // Fields
    String isim = "Merve Hanim";
    int yas;
    String name;
    int age;

    public C06_Ogrenci(String isim, int yas) {//2p'li cons.
        //      this.isim = isim;////parametre isim değeri inst. obj isim değerine atandı
        //      this.yas = yas;//parametre yas değeri inst. obj yas değerine atandı
        isim = isim;//parametre isim yine parametre isme atandi. instance obj isim degeri degismedi.
        yas = yas;//paramere yas degeri yine parametre yas atandi, instance obj yas degeri degismedi.

//    name=isim;//parametre isim degeri instant obj name degerine atandi
//    age=yas;//parametre yas değeri inst. obj age değerine atandı
        System.out.println("Constructordaki isim: " + isim);//poaramter isim değeri : Saliha Hanim
        System.out.println("Constructordaki isim: " + this.isim);//inst. obj isim değeri: Merve Hanim
        System.out.println("Constructordaki name: " + name);//inst. obj name değeri :null

    }
}
