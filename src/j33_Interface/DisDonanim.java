package j33_Interface;

public interface DisDonanim {

    public void kapi();//abstract method

    abstract void kaporta();//abstract method

    String RENK = "opak kirmizi";//public static final variable

    public default String sisLamp() {//default concrete method
        return "Sisli havada dikkat";
    }

    static void anten() {
        System.out.println("Agam yine antin kuntin islerdesin :)");
    }

    static void aga() {
        System.out.println("Agam sensiz olmaz, o-la-maaaz :)");
    }
//    public static default void sorunluMethod(){}//CTE --> static ile default ayni anda kullanilamaz

//    disDonanim obj=new disDonanim();// can not be instantiated --> obj olmaz, o-la-maaaz

    //   public static void main(String[] args) {//bad practice--> projede tekbir main method ve main class kullanilmalidir
    //       System.out.println("RENK = " + RENK);
    //       aga();
    //   }
}
