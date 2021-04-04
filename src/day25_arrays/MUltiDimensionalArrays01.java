package day25_arrays;

import java.util.Arrays;

public class MUltiDimensionalArrays01 {
	public static void main(String[] args) {

		
		//Ic ice array olusturdugumuzda disardaki ana array e outer array 
		//icerideki kucuk arraylere ise inner denir
		//Eger icerdeki array lerin boyutlari birbirinden farkli ise
		//Array i ancak tum elemanlari yazarak declare edebiliriz
		//Multi dimensional array de bir elemanin indexi icin
		//en disdaki array haric elemana kadare ic ice olan tum arrayleirn indexlerini yazmak gerekir
		
		int arr[][]= {{1,3,5}, {3,5}, {5,9,11,3}};//iki katli bir arraydir
		// 11 i index ile ifade etmek istersek arr[2][2]
		//eger array i uzunlukla declare etmek istersek inner array uzunluklari esit olmali
		int arr2[][]=new int [3][2];
		//[3] ilk yazilan sayi outer array in icinde kac tane inner array oldugunu belirtir
		//[2]
		
		System.out.println(Arrays.toString(arr2));
		//multidimensional array leri yazdirmak icin to String method u kullanilamaz
		//cunku toString methodu outer array i Stringe cevirir
		//outer array in icinde inner arrayler oldugundan to String method unda inner array lerin
		//referans degerleri yazdirilir
		System.out.println(Arrays.deepToString(arr2));
		
		
		
		}
}
