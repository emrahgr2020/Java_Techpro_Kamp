package day27_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysList05 {

	public static void main(String[] args) {
		//verilen bir arrayi liste nasil ceviririz
		
		
		String arr[]= {"Ali","Veli"};		
		
		List<String> listArr=  Arrays.asList(arr);
		
		System.out.println(listArr);
		
		Integer arr1[]= {1,2,3};
		
		List<Integer> list2=Arrays.asList(arr1);
		System.out.println(list2);
		
		//Bazen cok fazla elemani olan bir liste olusturmamiz gerekir 
		//bu durumda liste elemanlarini tek tek eklemek yerine 
		//elemanlarini bir array e ekler  sonra da array i bir listeye cevirebiliriz
		//ornek bir web sitesindeki tum urunleri bir listeye eklemek istedigimizde
		
		//Ancakk bu methodla array den cevirdigimiz list esnek olmaz
		//array in ozelliklerini tASIMAZ... add(),remove(), clear() gibi uzunlugu etkileyen methodlar kullanilmaz
		
		//Java bu degisimdeki Array ve List i senkronize eder birinde yaptigimizx degisiklik digerine de uygulanir
		
		
		arr1[1]=5;
		System.out.println(Arrays.toString(arr1));
		System.out.println("list2: "+list2);
		
		list2.set(2, 13);
		System.out.println("list2: "+list2);
		System.out.println("Arrays : "+Arrays.toString(arr1));
	}

}
