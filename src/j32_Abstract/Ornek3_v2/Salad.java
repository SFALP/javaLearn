package j32_Abstract.Ornek3_v2;

public abstract class Salad extends Food {

    public abstract void madeIn();// parent ve child abs classlarda ayni isimle

    @Override
    public void taste() {
        System.out.println("Agam, salatani gavurdagi, coban, sogus mu verelim? ");
    }
}
