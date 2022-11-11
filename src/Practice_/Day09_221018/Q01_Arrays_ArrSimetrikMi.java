package Practice_.Day09_221018;

//Type a method to check if an int Array is symmetrical or not.
//ÖR:12321
public class Q01_Arrays_ArrSimetrikMi {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 3, 2, 1};

        if (simetrik(arr) == true) {
            System.out.println("Array simetriktir");
        } else System.out.println("Array simetrik degildir.");
    }
    private static boolean simetrik(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[arr.length - 1 - i]) {
                flag = true;

            } else flag = false;
            break;
        }
        return flag;
    }
}