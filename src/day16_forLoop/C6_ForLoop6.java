package day16_forLoop;

import java.util.Scanner;

public class C6_ForLoop6 {

	public static void main(String[] args) {
		// Soru 8 ) Interview Question Kullanicidan bir
		// String isteyin ve Stringi tersine ceviren bir program yazin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kelime giriniz");

		String str = scan.nextLine();

		
		String tersYazi="";
		

		for (int i = str.length()-1; i >=0; i--) {
			
			tersYazi +=str.charAt(i);
			
		}
		System.out.println("Yazinin tersten yazilisi: "+tersYazi);
scan.close();
	}

}
