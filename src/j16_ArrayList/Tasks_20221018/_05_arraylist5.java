package j16_ArrayList.Tasks_20221018;

import java.util.ArrayList;
import java.util.List;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */
    public static void main(String[] args) {
        ArrayList<String> eyalet = new ArrayList<>(List.of("New jersey", "New york", "Atlanta", "Florida", "Ohio"));
        System.out.println("Array'in terster yazilmis hali: " + rotateList(eyalet));

    }

    public static ArrayList<String> rotateList(ArrayList<String> eyalet) {
        ArrayList<String> tersEyalet = new ArrayList<>();
        for (int i = eyalet.size() - 1; i > 0; i--) {
            tersEyalet.add(eyalet.get(i));
        }
        return tersEyalet;
    }
}