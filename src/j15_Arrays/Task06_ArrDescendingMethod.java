package j15_Arrays;

import java.util.Arrays;

public class Task06_ArrDescendingMethod {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};

        Arrays.sort(arr);
        System.out.println("Ascending sıralanmıs array: " + Arrays.toString(arr));
        buykuc(arr);
        System.out.println("Yine bekleriz :)");
    }

    private static void buykuc(int[] arr) {
        System.out.println("\nDescending(b->k) Array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}