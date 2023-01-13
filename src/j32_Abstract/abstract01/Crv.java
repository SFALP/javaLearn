package j32_Abstract.abstract01;

public class Crv extends Honda{

    @Override
    public void motor() {
        System.out.println("Agam 2.4 super turbo motor arazi seni bekler 4x4 :)");
    }

    @Override
    void koltuk() {
        System.out.println("Agam deri koltuk arazide daha temiz olur ");
    }

    @Override
    void kapı() {
        System.out.println("Agam kapilar vakumlu carpilayasan :( ");
    }
}
