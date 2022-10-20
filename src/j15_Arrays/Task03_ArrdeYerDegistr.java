package j15_Arrays;

import java.util.Arrays;

public class Task03_ArrdeYerDegistr {
	
	public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */

		String arr[]={"11","12","13","14","15"};
		System.out.println("Mevcuttaki Array: "+Arrays.toString(arr));
		String yeniArr[]=new String[arr.length];
		for (int i = 0; i <arr.length ; i++) {
			if (i==arr.length-1) {
				yeniArr[i]=arr[0];
			} else yeniArr[i]=arr[i+1];
		}
		System.out.println("Yeni Array: "+Arrays.toString(yeniArr));
	}
}