package day10_switchcase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		// kullanicidan hangi gunde oldugumuzu isteyin yazi ile 
		//girilen gunu n hafta ici veya hafta sonu oldugunu yazdirin
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen gun ismi giriniz");
		
		String gun= scan.next().toLowerCase();
		
		switch (gun) {
		
		case "pazartesi" :
		case "sali" :
		case "carsamba" :
		case "persembe" :
		case "cuma" :
			System.out.println("haftaici");
			break;
		case "cumartesi" :
		case "pazar" :
			System.out.println("haftasonu");
			break;
			
		default :
			System.out.println("gecerli bir gun giriniz...");
			
			
		
		scan.close();
		
		
		
		}

	}

}
