package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.List;

public class C5_Varargs04 {

	public static void main(String[] args) {
		
		List<Integer> list =new ArrayList<>();
		list.add(10);
		list.add(20);
		
		

	}

	public static void toplama(int... var) { // data turunden sonra ... varags kullanacagimiz anlamina geliyor

		

		int toplam = 0;
		for (int each : var) {
			toplam += each;
		}
		System.out.println(toplam);
	}

}
