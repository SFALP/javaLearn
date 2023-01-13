package j35Collection.C01_LinkedList;

import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {

        LinkedList<Object> list = new LinkedList<>();//Data type Object(Hz.Adem) oldugundan her turlu yapiyi(String/Integer) kabul eder.
// Bad practice, application cok yavaslar. Bu nedenle tavsiye edilmez, cissss.
        list.add("Nazim");
        list.add("€");
        list.add(1453);
        System.out.println("list = " + list);
    }
}