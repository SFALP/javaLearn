package j15_Arrays;

public class Task10_ArrArtiEksiDonusm {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */
        int arr[]={15,20,-54,-60,34,-71};

        System.out.println("Tanimlanan arrayin matematiksel isaretlerinin degistirilmis hali: ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print((arr[i]*-1)+" ");
        }
    }
}