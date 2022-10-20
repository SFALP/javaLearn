package Practice_.Day06_221010;
//Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line with a space between consecutive integers
//120'den 11'e kadar 4'e ve6'ya bölünebilen tüm tam sayıları, ardışık tam sayılar arasında bir boşluk bırakarak aynı satıra yazın
public class Q09_ForLoop_4_6ile_Bolunme {
    public static void main(String[] args) {
        System.out.println("120 ile 11 arasinda olup 4 ve 6 ile bolunabilen sayilar: ");
        for (int i = 120; i >10 ; i--) {
            if (i%6==0 &&i%4==0){
                System.out.print(i+" ");
            }
        }
    }
}
