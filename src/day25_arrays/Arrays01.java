package day25_arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Arrays01 {

	public static void main(String[] args) {
		// Array (Dizi) : Java da birden fazla variable store etmek icin kullanilan objelerden biridir
		//Array olusturulurken 2 seyi declare etmeliyiz  1- data type(bir array in icinde sadece ayni data tipinden 
		//elemanlar olabilir)   2- uzunluk(uzunluk arrayin cierisine kponu;acak max. elleman sayisini belirtir fazlasini
		//istersek RTE verir)
		
		
		int arr[]= {10,23,45};//length=3
		String isimler[]=new String[4]; //length =4 olan bos bir array olusturur
		
		//Array de rimitive datalar veya non primitive datalarin referanslari store edilebilir
		//mesela isimler array inin icinde isim degerleri degil isimlerin referanslari olur
		//arrey in elemanlarine ulasma ve update etme
		
		System.out.println(isimler[1]);
		
		isimler[2]="Boss";
		isimler[0]="Elveda";
		//array in tum elemanlarini yazdirma
		
		System.out.println(isimler); //referansi yazdirir
		
		System.out.println(Arrays.toString(isimler));
		//method kullanmadan tum elemanlari yazdiralim
		//loop kullanmamiz lazim
		
		for (int i = 0; i < isimler.length; i++) {
			System.out.print(isimler[i]+" ");
		}
		System.out.println();
		System.out.println(arr);//referans [I@39ba5a14
		System.out.println(Arrays.toString(arr));
		
		//Arrayin elemanlarini nasil siralayabiliriz
		isimler[1]="Oguzhan";
		isimler[3]="Bilal";
		Arrays.sort(isimler);
	
		System.out.println(Arrays.toString(isimler));//[Bilal, Boss, Elveda, Oguzhan]
	}

}
