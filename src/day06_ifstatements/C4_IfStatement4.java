package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		//kullanicidan gun ismini isteyin
		//girilen gunun hafta ici veya hafta sonu oldugunu yazdirin
		
		//pazar--> haftasonu  , sali ---> hafta ici
		
		Scanner scan = new Scanner(System.in);
		System.out.println("gun ismi giriniz lutfen");
		
		String gunAdi= scan.next().toLowerCase();//toLowerCase() girilen degeri kucuk harfe ceviriyor
		
		// eger stringlerde esitlik sorguluyorsak == kullanmamaliyiz
		//String lerde esit olma durumunu sorgulama durumunu equals ()
		if (gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) {
			System.out.println("Haftasonu");
		}

		if (gunAdi.equals("pazartesi") || gunAdi.equals("sali") || gunAdi.equals("carsamba") ||
				gunAdi.equals("persembe") || gunAdi.equals("cuma")) {
			System.out.println("haftaici");
		}
		
		scan.close();
	}

}
