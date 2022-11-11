package j29_Exceptions;

public class C05_ArrayIndexOutOfBound {
    public static void main(String[] args) {

// ArrayIndexOutOfBound --> Array'lerde olmayan bir index elemaniyla islem yapildiginda olusan RTE Exception'udur.

        int arr[] = {24, 27, 38, 41, 54};
        System.out.println("arr[0] = " + arr[0]);//24

//        System.out.println("arr[7] = " + arr[7]);//ArrayIndexOutOfBoundsException

        try {
            System.out.println("arr[7] = " + arr[7]);
            System.out.println("Agam bu yaziyi okuduysan try block'da exeption firlatmadi, kod sorunsuzdur.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("TEE ALLAAAM YAA! agam olmayan array elemani istersin, beni uzersin :(");
            System.out.println("agam catch block'da bu yaziyi okuduysan exception firlatildi ve code handle edildi");
        }

        try {
            System.out.println("arr[2] = " + arr[2]);
            System.out.println("Agam bu yaziyi okuduysan try block'da exeption firlatmadi, kod sorunsuzdur.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("TEE ALLAAAM YAA! agam olmayan array elemani istersin, beni uzersin :(");
            System.out.println("agam catch block'da bu yaziyi okuduysan exception firlatildi ve code handle edildi");
        }
        System.out.println("Agam sorun handle edildi, devamkeee :)");//bu kod calismissa program sorunsuz kirilmadan run olmustur

    }
}