package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// verilen bir arrayde bir elemanin var olup olmadigini nasil kontrol edebiliriz
		
		int arr[]= {10,25,3,16,75};
		int sayi=11;
		
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==sayi) {
				flag=true;
				
			}
		}
		if (flag) {
			System.out.println("array sorulan elemani iceriyor");
		}else {
			System.out.println("array sorulan elemani icermiyor");
		}

		//Arrays classindan method kullanarak yapalim
		//ilk once siralama yapmaliyiz
		Arrays.sort(arr); //[3,10,16,25,75]
		System.out.println(Arrays.binarySearch(arr, 25));//sonuc olarak arnan sayinin index ini doner
		System.out.println(Arrays.binarySearch(arr, 10));//1
		System.out.println(Arrays.binarySearch(arr, 28));//-5
		System.out.println(Arrays.binarySearch(arr, 28));//-2
		System.out.println(Arrays.binarySearch(arr, 28));//-6
		
		
		//binary searc sonuc olarak aradigimiz eleman varsa indexini verir
		//aradiiginiz eleamn yoksa - isareti ile olsa idid kacinci eleman olacagini dondurur
		
		int arr2[]= {12,15,25,12,3,12,65};
		Arrays.sort(arr2);
		System.out.println(Arrays.binarySearch(arr2, 14));//3
		System.out.println(Arrays.binarySearch(arr2, 20));//-6
		System.out.println(Arrays.binarySearch(arr2, 12));//1
		System.out.println(Arrays.binarySearch(arr2, 2));//-1
		
		//Array nasil String e cevirir
		String arrayString=Arrays.toString(arr2);
		System.out.println(arrayString);
		System.out.println(arrayString.substring(5));//bastaki [ dahil tum arrayi String e cevirir
		
	}

}