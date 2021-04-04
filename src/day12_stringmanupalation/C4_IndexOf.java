package day12_stringmanupalation;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		// IndexOf() methodu bize istedigimiz karakter(lerin) indexini dondurur
		
		
		String str= "Java ogren; is sahibi ol";
		
		System.out.println(str.charAt(6));//g
		
		
		System.out.println("char arama " + str.indexOf('g'));//6

		System.out.println("String arama " + str.indexOf("g"));//6
		
		System.out.println("String kelime arama " + str.indexOf("is"));//12
		
		System.out.println("birden fazla varsa" + str.indexOf('i'));// ilk buldugunu getirir
		
		System.out.println("baslangic indexi ile " + str.indexOf('a', 4));//4 den sonra ilk a 
		
		System.out.println("olmayan harf :" + str.indexOf("dert"));
		
		// kullnicidan bir cumle isteyin
		//case sensivite olmadan Java kelimesi icerip icermediginde yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("bir cumle girin");
		
		String cumle = scan.nextLine().toUpperCase();
		
		//int sonuc = cumle.indexOf("JAVA");  //java varsa ilk java kelimesinin indexini dondurur
											//java yoksa -1
		
		//System.out.println(sonuc==-1 ? "Java icermiyor" : "Java iceriyor");
			
		
		
		if (cumle.indexOf("JAVA")>=0) {
			System.out.println("java iceriyor");
		} else {
			System.out.println("java icermiyor");
		}
		
		scan.close();
	}

}
