package Frei_Ubungen;

public class U220928_NestedMethod {
    public static void main(String[] args) {
        bilgigoster();//Merhabalar Faruk Java!
        System.out.println("1. Islem");//1. Islem
        System.out.println("2. Islem");//2.Islem
        bilgigoster();//Merhabalar Faruk Java! yazdırır. Methodlar birden fazla defa cagirilmasinda bir sakinca yoktur.
    isimYazdir();//Faruk Java! yazdirilmis olur. Methodlar bu kod yapisiyla geri cagirilmis olur.
    progYazdir();//Java! yazdırılmıs olur.
        System.out.println("*********** 2.YOL******");
        bilgigoster();// Merhabalar Faruk Java! yazdırılmıs olur. Metotlar arasi gecis yapilarak ilerlenir.

    }
public static void bilgigoster(){
    System.out.println("Merhabalar");
isimYazdir();//method içinde method yazdirilmasi mumkundur.
    }

public static void isimYazdir(){
    System.out.println("Faruk");
progYazdir();
}public static void progYazdir(){
    System.out.println("Java!");
// TRICK: progYazdir();//Bir metot icinde ayni metot yazilirsa bunun sonucu Overload olur. Bu nedenle metot içinde aymni metot ismi kullanılmamalidir.metot icinde
}

}
