package day24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		// Kullanicidan deger alarak int bir array olusturun
		//once kullanicidan girecegi sayi adedini almamiz lazim ki arrayi ousturalim
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kac sayidan olusan bir aray istediginizi yaziniz");
		int uzunluk=scan.nextInt();
		
	int arr[]=new int[uzunluk];//5
	
	System.out.println("Lutfen sayilari giriniz");
	for (int i = 0; i < arr.length; i++) {
		arr[i]=scan.nextInt();
	}
	System.out.println(Arrays.toString(arr));
	
	
	scan.close();
	
	
	}

}