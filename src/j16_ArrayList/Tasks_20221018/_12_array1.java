package j16_ArrayList.Tasks_20221018;

public class _12_array1 {

    /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
    
    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1};
        System.out.println(dupicate(arr));
        if (dupicate(arr) == false) {
            System.out.println("Array'de tekrarlayan eleman bulunmuyor");
        }else System.out.println("Array'de eleman tekrari bulunmaktadir");
    }

    public static boolean dupicate(int arr[]) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                }
            }
        }
        return flag;
    }
}