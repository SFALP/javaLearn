package Practice_Day03_220926;

public class Q03_NestedTernary {
    public static void main(String[] args) {
        /*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */
        char a='D';
                System.out.println(a=='A'? "Gayet Basarili":a=='B'?"Basarili":a=='C'?"Ha Gayret":"Digerleri...");
    }
}
