package j15_Arrays;

public class C07_MdArrays {
    public static void main(String[] args) {

// TASK: apt'nin tum elemanlarini toplayan code create ediniz.
int apt[][]={
             {1,2,3}, //0.kat
             {10,20},//1.kat
             {101}//2.kat
     };//3 katli apartman
     //101 elemaninin indexi: apt[2][0]

        int toplam=0;
        for (int kat = 0; kat <apt.length ; kat++) {
            for (int daire = 0; daire < apt[kat].length; daire++) {
                toplam+=apt[kat][daire];
            }
        }
        System.out.println("Apt'deki tum elemanlar toplami: "+toplam);//137


    }
}
