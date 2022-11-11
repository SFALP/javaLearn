package j25_Encapsulation.Task04;

import java.util.Scanner;
/*
    Burada iki adet class vardır. Biri Main, diğeri ise student ,
    student classı içinde;
    String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz.

    Main classın içinde;
    girilen değerleri aşagıdaki gibi print eden code create ediniz
    Örnek:
    age 12'dir.
    name Steven'dır.

    name(isim) olarak;
    "Student name is Steven"
    ve
    age(yaş) olarak da;
    "He is 12 years old"
 */
public class Main {
    public static void main(String[] args) {

//girilen degerler alindi
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen ismi tanimlayiniz: ");
        String ad=sc.nextLine();
        System.out.print("Yasinizi tanimlayiniz: ");
        int yas=sc.nextInt();

        Student s1 = new Student(ad, yas);//ad ve yas constructora  parametre olarak gonderildi, s1 obje olarak tanimlandı.
        System.out.println("Student name is "+s1.getName()+"\nHe is "+s1.getAge()+" years old.");
    }
}