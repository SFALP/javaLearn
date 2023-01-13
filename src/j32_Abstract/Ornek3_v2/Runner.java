package j32_Abstract.Ornek3_v2;

public class Runner {
    public static void main(String[] args) {

Baklava b=new Baklava();
b.madeIn();//agam baklava yerli ve milli has Ayintap baklavasi
b.taste();//good sugar sweet
        System.out.println("b = " + b);//b = j32_Abstract.Or.Baklava@64616ca2

        SezarSalad ss=new SezarSalad();
        ss.taste();//Agam, salatani gavurdagi, coban, sogus mu verelim?
        ss.madeIn();//Agam, sezar yemis biz bakmisiz, cokta umursama Italy
    }
}
