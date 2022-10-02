package Frei_Ubungen;

public class U220918_Ternary {
    public static void main(String[] args) {
//TASK 1:
        String isim= "";

        int sayi =40;
        isim= sayi>20 ? "Fenerbahce" : "Galatasaray";
        System.out.println(isim);
//TASK 2:
        String a="";
        int s=1;
        a=s<=5 & s>0 ? (s<=2 ? "Şampiyonlar Ligine gitmeye hak kazandı":"Avrupa Ligine gitmeye hak kazandı") : ("Malesef Avrupa arenasında bu sene yok");
        System.out.println(a);
// TASK 3:
        String x= "";
        System.out.println("\nPizza siparişinde indirim oranı öğrenme programına Hoşgeldiniz!");
        int y=66;
        x = y>18 && y>=0 ? (y>=65 ? "%25 Emekli indiriminden faydalanabilirsiniz" : "%10 Yetişkin indiriminden faydalanabilirsiniz" )  : ("%50 Öğrenci İndiriminden faydalanabilirsiniz");
        System.out.println("Tebrikler! "+x);
    }
}
