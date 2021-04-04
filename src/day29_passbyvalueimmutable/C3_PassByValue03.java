package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C3_PassByValue03 {

	public static void main(String[] args) {
		/*Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. Iki method olusturup 
		 * list elemanlarini artirmayi deneyelim
		  - 1. Method�da elemanlari for each loop kullanarak artirin
		 - 2. Method�da elemanlari set method�u kullanarak artirin
		  - Method�lari arka arkaya cagirip artislarin kalici olup olmadiklarini kontrol edelim.
		  
		  3 ekle her birine
		*/
		
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(11);
		list.add(12);
		
		System.out.println(list);
		
		deneme1(list);
		System.out.println("1.method call dan sonra " + list);//[10, 11, 12]
		
		deneme2(list);
		System.out.println("Set ile degistirdigimiz method call dan sonra " + list);//[13, 14, 15]
		
		
	}

	public static void deneme2(List<Integer> list) {
		
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i)+3);
		}
		System.out.println("Set ile degistirdigimiz liste methodun icinde : "+list);//[13, 14, 15]
		//Java Pass By Value kullanir .Ancak list deki set methodu istisnai olarak
		//method un icinde yapilan degisiklikleri d e kalici hale getirir
	}

	public static void deneme1(List<Integer> list) {
		
		for(Integer each : list) {//foreach loop ile listeyi guncellemiyoruz
									//sadece her bir elemani tek tek cagirip 3 fazlasini yazdirdik
			each+=3; 
			
			System.out.print(each+" ");//13 14 15 
			
		}
			System.out.println("");//
			System.out.println(list);//listenin kendisinin degismedigini gorduk//[10, 11, 12]
		
	}

}
