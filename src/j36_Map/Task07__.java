package j36_Map;

public class Task07__ {

    /*
    returnKey() isminde bir method oluşturun.
    Parametresi     String-Integer HashMap olsun.
    Return tipi Array List olsun.
    Hashmap:
                       "Lion",     1
                       "Tiger",    2
                       "Elephant", 3
                       "Cat",      4
                       "Dog",      5
    Tüm ANAHTARLARI(Keys) for döngüsü ile döndürün.
     */

    public static void main(String[] args) {

    }
}
/*
F4994-Faruk COZUMU
  public static void main(String[] args) {
        HashMap<String,Integer> animals = new HashMap<>();
        animals.put("Lion", 1);
        animals.put("Tiger", 2);
        animals.put("Elephant", 3);
        animals.put("Cat", 4);
        animals.put("Dog", 5);
​
        System.out.println(returnKey(animals));
​
    }
​
    private static ArrayList returnKey(HashMap<String, Integer> animals) {
    ArrayList<String> keys = new ArrayList<>();
​
        for (String e:animals.keySet()) {
            keys.add(e);
        }
    return keys;
    }
 */
