package j29_Exceptions;

public class C07_IllegalArgumentException02 {
    public static void main(String[] args) {
        try {
            System.out.println("Agama try block basindan selam :)");
            hata();
            System.out.println("Agama try block sonundan selam :)");
        } catch (IllegalArgumentException e) {
            System.out.println("Agama catch block basindan selam :)");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Agama catch block sonundan selam :)");
        }
        System.out.println("Agam sorun handle edildi, devamkeee :)");//bu kod calismissa program sorunsuz kirilmadan run olmustur.
    }//main sonu

    public static void hata() {
        throw new IllegalArgumentException("Agam ne ettinn, yine mi hata :(");
    }
}