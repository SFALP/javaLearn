package j18_Constructor.Task_221023;
/*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */
public class Rectangle {

    int width;
    int lengt;

    public Rectangle(int width, int lengt) {
        this.width = width;
        this.lengt = lengt;
    }

    public Rectangle() {

    }
    public void cevre(){
        System.out.println("Uzunluk ("+lengt+") ve genislik ("+width+") icin dikdortgenin cevresi: "+(2*(width+lengt)));    }
    public void alan(){
        System.out.println("Uzunluk ("+lengt+") ve genislik ("+width+") icin dikdortgenin alani: "+width*lengt);
    }
}