package j18_Constructor.Task_221023;

/*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */
public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle dikdortgen = new Rectangle(18, 24);
        dikdortgen.cevre();
        dikdortgen.alan();
    }
}