package day28_foreachloop;

import java.util.Iterator;

public class C1_ForEachLoop1 {

	public static void main(String[] args) {
		// bir array in tum elemanlarini for loop ile yazdiralim
		
		int arr[]= {2,4,6,8,10};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//for loop yazmamizin amaci array in tum elemanlari uzerinde islem yapmak ise
		//foreach loop daha kolay kod yazmamizi saglar
		
		//each==> her bir
		//for each loop istedigim bir topluluktaki tum elemanlari birer birer bana getiri
		//for each loop da baslangic degeri YOKTUR, bitis degeri YOKTUR,index YOKTUR
		
		System.out.println();//kursoru alt satira indirmek
		
		for (int i : arr) {
			System.out.print(i+" ");
		}

	}

}
