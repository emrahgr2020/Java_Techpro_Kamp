package day26_arraylist;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayList02 {

	public static void main(String[] args) {
		// List in uuznlugu nasil bulunur

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);

		System.out.println(list);// [10, 15, 8, 12, 20]

		System.out.println(list.size());// 5

		// bir eleman nasil silinir
		list.remove(1);
		System.out.println(list);// [10, 8, 12, 20]
		System.out.println(list.remove(2));// git 12 yi kaldir dedik bize 12 yi dondurur
		System.out.println(list);//[10, 8, 20]
		// remove (index) kullandigimizda o index deki elemani remove eder ve bunun
		// delili olarak bize oelemani getiri
		// eger olmayan bir indeex girersek RTE verir
		

		List<String> list2 = new ArrayList<>();
		list2.add("Ali");

		System.out.println(list2.remove("Veli"));// git hasan i kaldir dedik bulamadigi icin false olur
		System.out.println(list2);
		// Remove (Object) method u kullandiginda eger Java istenen elemani bulup
		// remove edersebize remove edilen elemani dondurur, listede bulamazsa istegin
		// yerine getirilemedigini anlamaiz icin false dondurur

	}

}
