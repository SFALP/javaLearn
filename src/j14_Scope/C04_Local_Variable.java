package j14_Scope;

public class C04_Local_Variable {
    public static void main(String[] args) {//main basi

        int yas = 33;//main method local variable

        System.out.println("Yas: " + yas);

        for (int i = 1; i <= 7; i++) {// for loop basi
            System.out.println(yas + " :)");//yas local variable ayni locale call edildi.
            i++;// i loop icinde call edildi.

        }//for loop sonu
// i=34;//local disi call edilemez, bu i kalibi for loop'a aittir.
        yas = 35;// local variable local'inde call edildi.

    }//main sonu
// yas=48;//locak disi call edilemez
}