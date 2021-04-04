package day26_arraylist;

import java.util.Arrays;

public class C1_Array01 {

	public static void main(String[] args) {
		// Soru 6) Verilen bir Array’den isten degere esit olan elamanlari kaldirip,
		//kalanlari yeni bir  Array olarak yazdiran bir method yaziniz

		int arr[]= {2,3,5,3,6,4,3,6,7};//{2,5,6,4,6,7}
		int sayi=5;
		
		//1. adim olarak kaldirmam istenen sayi kac tane var, bunu bulmam gerekiyor
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==sayi) {
				count ++;
			}
		}
		//2. Aadim yeni array olusturalim
		
		int arr2[]=new int[arr.length-count];//uzunluk 7
		
		//3.adim arr arrayindan elemanlari tek tek alip istenen sayiya esit degilse 
		//	arr2 ye ekleyecegiz
		
		int temp=0;//bununla yeni arrayin indexlerini kontrol edecegim
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]!=sayi) {
				arr2[temp]=arr[i];
				temp++;
			}
		}
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
