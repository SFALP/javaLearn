package Frei_Ubungen;

public class U221002_Loop {
    public static void main(String[] args) {
        System.out.println("******* FOR LOOP *********");
        int a,i;
        for (i=2;i<=11;i+=2){
            System.out.println("\ni = " + i);
            for (a=1;a<4;a++){
                System.out.println("a = " + a);
}
            String [] dil={"deutsch, französisch, italianisch, türkisch, chinisisch, englisch "} ;
            for (int j=0 ; j<dil.length ; j++ ){
                System.out.println(dil[j]);
            }
        }
        System.out.println("******* WHILE LOOP *********");

}
    }
