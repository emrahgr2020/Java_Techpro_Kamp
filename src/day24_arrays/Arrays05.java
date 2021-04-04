package day24_arrays;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {
		// Karisik sirali verilen bir array sirali olarak yazdirin
		
		int arr[]= {12,22,25,41,33,18};
		Arrays.sort(arr);// arrayleri siralamak icin
		System.out.println(Arrays.toString(arr));
		
		//ayni array i buyukten kucuge dogru nasil yazdirabiliriz?
		for (int i = arr.length-1; i >=0; i--) {
			System.err.println(arr[i]+" ");
		}
		System.out.println("");
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		//ayni array i buyukten kucuge dogru nasil siralayabiliriz

		int arrTers[]=new int[arr.length];
		for (int i = 0; i < arrTers.length; i++) {
			arrTers[i]=arr[arr.length-1-i];
		}
		
		System.out.println(Arrays.toString(arrTers));
	}

}
