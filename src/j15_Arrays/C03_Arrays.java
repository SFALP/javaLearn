package j15_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        // Stringi arraya cevirmek icin split() kullanilir. Girilen parametre degere gore String ifade parcalanir.

        String str="JavaCAN'lara selam olsun. en kısa zamanda bolcana offer, sonrasi da TUZLABALIK :)";


 // TASK: String ifadeyi, kelime sayisini creat eden code print ediniz.
        String strArr[]=str.split(" ");//str her " " karaktere gore parcalanir.
                                            // her bir parca strArr elemani olarak atanmis olur.

        System.out.println(Arrays.toString(strArr));//[JavaCAN'lara, selam, olsun., en, kısa, zamanda, bolcana, offer,, sonrasi, da, TUZLABALIK, :)]
        System.out.println(strArr.length);//12

        // TASK--> string ifadeyi harf sayisini print eden code create ediniz.

        String harfArr[]=str.split("");//
        System.out.println(Arrays.toString(harfArr));//[J, a, v, a, C, A, N, ', l, a, r, a,  , s, e, l, a, m,  , o, l, s, u, n, .,  , e, n,  , k, ı, s, a,  , z, a, m, a, n, d, a,  , b, o, l, c, a, n, a,  , o, f, f, e, r, ,,  , s, o, n, r, a, s, i,  , d, a,  , T, U, Z, L, A, B, A, L, I, K,  , :, )]
        System.out.println(harfArr.length);//81 karakter yazilidir

    }
}
