package day10_switchcase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		// kullanicidan VIP(very Important Person) kisaltmasinda hangi harfin anlamini istedigini soralim
		//girilen harfin aciklamasini yazdiralim

		
		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen VIP kisaltmasindan hangisinin anlamini istiyorsunuz");
		
		char kisaltma= scan.next().charAt(0);
		
		switch(kisaltma) {
		case 'v' :
		case 'V':
			System.out.println("Very");
			break;
		case 'i':
		case 'I':
			System.out.println("Important");
			break;
		case 'p':
		case 'P':
			System.out.println("Person");
			break;
			
		default:
			System.out.println("Hatali giris...");
			scan.close();
		}
		

		System.out.println("Lutfen harf giriniz");
		
		String harf= scan.next();
		switch(harf) {
		case "v":
		case "V":
			System.out.println("Very");
			break;
		case "i":
		case "I":
			System.out.println("Important");
			break;
		case "p":
		case "P":
			System.out.println("Person");
			break;
			
		default:
			System.out.println("Hatali giris...");
			scan.close();
		}
	}

}
