package day11_stringmanipulations;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		// str.toLowerCase() butun stringi tamamini kucuk harfe cevirir
		//str.toUpperCase() butun stringi tamamini buyuk harfe cevirir
		
		String str= "Techproeducation";
		
		System.out.println(str.toUpperCase());

		str = str.toUpperCase();
		
		System.out.println(str);
		System.out.println(str.toLowerCase());
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));
		System.out.println(str.toUpperCase(Locale.GERMANY));
	}

}
