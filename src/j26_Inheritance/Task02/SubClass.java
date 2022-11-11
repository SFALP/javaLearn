package j26_Inheritance.Task02;

public class SubClass extends SuperClass {
    int num = 10;

    public void myMethod() {
        goster();//SubClass'dan call edildi
        super.goster();//SuperClass'tan call edildi.
        System.out.println("SubClass icin num = " + num);//SubClass'tan call edildi
        System.out.println("Super Class icin super.num = " + super.num);//SuperClass'tan call edildi.
    }

    @Override
    public void goster() {
        System.out.println("Bu method, SubClass'in goruntulenme methodudur");
    }

}
