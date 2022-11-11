package j18_Constructor;

public class MyConstructor {

    int x = 3;
    int y = 5;

    public MyConstructor() {
        x += 1;//instance variable +1 update edildi
        System.out.println("-x" + x);
    }

    public MyConstructor(int i) {
        this();//parametresiz constructor call edildi
        this.y = i;//constructor parametresi i degeri instance variable y'ye atandi
        x += y;//instance y degeri, instance x degerine atandi.
        System.out.println("-x" + x);

    }

    public MyConstructor(int i, int i2) {
        this(3);//intiger parametreli constructor parametre 3 atanarak call edildi.
        this.x -= 4;//instance x variable -4 (cikarilarak) update edildi.
        System.out.println("-x" + x);
    }

    public static void main(String[] args) {
        MyConstructor mc1 = new MyConstructor(4, 3);// 2 integer parametre 4 ve 3 atanarak constructor call edildi
    }
}