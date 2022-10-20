package j16_ArrayList.Task_20221015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* TASK :
 * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
 * 8. elemaninin yerlerini degistirin.
 *
 * ORNEK:
 *
 * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
 * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
 */
public class Task07_ArraydeYerDegiskligi {
    public static void main(String[] args) {

        List<String> listIsim=new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));

String str3=listIsim.get(2);//List'teki 3.eleman 2.index ile str1'e atandi.
String str8=listIsim.get(7);//List'teki 8.eleman 7.index ile str1'e atandi.
        System.out.println("Update oncesi listIsim = " + listIsim);
        //Update oncesi listIsim = [Umit, Emin, Kemal, Kerem, Taylan, Orhan, Sinan, Furkan, Ahmet, Ali]

listIsim.set(2,str8);// 3.eleman 2.index str8 ile update edildi.
listIsim.set(7,str3);// 8.eleman 7.index str2 ile update edildi.
        System.out.println("Update sonrasi listIsim = " + listIsim);
//Update sonrasi listIsim = [Umit, Emin, Furkan, Kerem, Taylan, Orhan, Sinan, Kemal, Ahmet, Ali]

    }
}
