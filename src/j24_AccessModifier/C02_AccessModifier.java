package j24_AccessModifier;

public class C02_AccessModifier {
    public static void main(String[] args) {

//        C01_AccessModifier obj1=new C01_AccessModifier();// Private tanimlandigi oldugu icin call edilemez.(CTE verir)
        C01_AccessModifier obj2 = new C01_AccessModifier(23, 45);//2 parametreli Constructor call edildi
        C02_AccessModifier semra = new C02_AccessModifier();//agama PUBLIC constructor'dan selam

        //    C01_AccessModifier abj4=new C01_AccessModifier();// CTE AccessModifier class parametresiz private constructor call edilemez

        System.out.println("obj2.defaultYas = " + obj2.defaultYas);//obj2.defaultYas = 33
        obj2.protectedMethod();//PROTECTED Method'dan agaya selam
        System.out.println("obj2.publicYas = " + obj2.publicYas);//obj2.publicYas = 48
        System.out.println("obj2.protectedYas = " + obj2.protectedYas);//obj2.protectedYas = 40
//        obj2.privateMethod();// private method call edilemez, CTE verir


    }
}
