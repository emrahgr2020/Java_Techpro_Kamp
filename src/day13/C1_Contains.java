package day13;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {
		// kullanicidan bir cumle ve aramak istedigi bir String isteyin
		// cumle stringi iceriyorsa 'basarili' degilse 'basarisiz' yazsin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir cumle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		System.out.println("Hangi String i istiyorsunuz");
		String aranan=scan.nextLine().toLowerCase();
		System.out.println(cumle.contains(aranan) ? "Basarili" : "Basrisiz");
		
		
		//kullanicidan mail adresini isteyin mail adresi@gmail iceriyorsa
		//mail kaydedildi yoksa "Lutfen mailinizi giriniz"
		
		System.out.println("Lutfen mailinizi giriniz");
		String email=scan.next();
		
		//eger @gmail.com un en sonunda oldugunu kontrol etmek istersek
		int sondami= email.indexOf("@gmail.com", email.length()-10);
		
		
		if (email.contains("@gmail.com") && sondami !=-1) {
			System.out.println("mailiniz kaydedildi");
		} else {
			System.out.println("lutfen gmail adresinizi giriniz");
		}
		
		
		
		scan.close();
		
	}
	

}
