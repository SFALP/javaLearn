package j23_Varargs_StringBuilder.Varargs;

public class Task03 {
    public static void main(String[] args) {

/*
TASK: girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
 */

        int sayi=5;
        String str1="Muharrem";
        String str2="Ugur";
        String str3="ebikGabik";

carpStringEnUzun(sayi,str1,"Javacan",str2,str3);
    }//main sonu

    public static void carpStringEnUzun(int carpacakSayi, String ...str){

String enUzun="";
        for (String a:str) {
            if (a.length()>enUzun.length()){
                enUzun=a;
            }

        }
        System.out.println("Sonuc: "+(enUzun.length()*carpacakSayi)+" En uzun sozcuk: "+ enUzun);
//Sonuc: 45En uzun sozcuk: ebikGabik
    }



}
