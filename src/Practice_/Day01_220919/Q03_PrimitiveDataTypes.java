package Practice_.Day01_220919;

public class Q03_PrimitiveDataTypes {
    public static void main(String[] args) {
         /*
         * Primitive data type
                byte: only takes whole numbers
                short: only takes whole numbers
                int(used more often): only takes whole numbers
                long: only takes whole numbers
                float: can take decimals (MUST have F or f at the end)
                double( used more often): can take decimals
                boolean: true or false boolean expressions
                char: character within single quote ''
                        also takes number
         * Range: double > float >long > int >short > byte
         * !!! soutv degeri ile yazdirma
         */
        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.
        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim

//Eşitsizliğin sol tarafına dekleration, sağ tarafına assignment ismi verilir.
// .Soutv kısaltması, atanan değerin otomatik olarak yazdırılmasını sağlayan kısayoldur.
        System.out.println("TASK1:byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.");
        byte byteMin=Byte.MIN_VALUE;
        byte byteMax=Byte.MAX_VALUE;
        System.out.println("byteMin = " + byteMin);
        System.out.println("byteMax = " + byteMax);
        short shortMin=Short.MIN_VALUE;
        short shortMax=Short.MAX_VALUE;
        System.out.println("shortMin = " + shortMin);
        System.out.println("shortMax = " + shortMax);
        int intMin= Integer.MIN_VALUE;
        int intMax= Integer.MAX_VALUE;
        System.out.println("intMin = " + intMin);
        System.out.println("intMax = " + intMax);
        long longMin=Long.MIN_VALUE;
        long longMax=Long.MAX_VALUE;
        System.out.println("longMin = " + longMin);
        System.out.println("longMax = " + longMax);
        double dMin=Double.MIN_VALUE;
        double dMax=Double.MAX_VALUE;
        System.out.println("Min = " + dMin);
        System.out.println("Max = " + dMax);
        float fMin=Float.MIN_VALUE;
        float fMax=Float.MAX_VALUE;
        System.out.println("fMin = " + fMin);
        System.out.println("fMax = " + fMax);

        System.out.println("\nTASK2: Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)");

        float LaptopFiyat=9999.99F;
        double kilometre = 123.5;
        char cinsiyet='E';
        boolean dogruMu=true;
        System.out.println("LaptopFiyat = " + LaptopFiyat);
        System.out.println("kilometre = " + kilometre);
        System.out.println("cinsiyet = " + cinsiyet);
        System.out.println("dogruMu = " + dogruMu);

    }
}
