package j18_Constructor;

public class C06_OgrenciRunner {
    public static void main(String[] args) {

        C06_Ogrenci talebe=new C06_Ogrenci("Saliha Hanim",21);
        System.out.println("talebe.isim = " + talebe.isim);//talebe.isim = Saliha Hanim
        System.out.println("talebe.yas = " + talebe.yas);//
        System.out.println("talebe.yas = " + talebe.age);//
        System.out.println("talebe.name = " + talebe.name);//
/*
EKRAN CIKTISI:
Constructordaki isim: Saliha Hanim
Constructordaki isim: Merve Hanim
Constructordaki name: null
talebe.isim = Merve Hanim
talebe.yas = 0
talebe.yas = 21
talebe.name = null
 */


    }
}
