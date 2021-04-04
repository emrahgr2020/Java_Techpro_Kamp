package calismalar;

import java.util.Scanner;

public class Contains1 {

	public static void main(String[] args) {
		// Kullanicidan email adresini girmesini isteyin, mail @gmail com iceriyorsa
		//“Email adresiniz kaydedildi”, icermiyorsa “Lutfen gmail mail adresinizi giriniz
		//yazdirin Soru
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir email girin");
		
		String email = scan.next();
		
		int sondami=email.indexOf("@gmail.com", email.length()-10);
		
		
		if (email.contains("@gmail.com") && sondami !=-1) {
			System.out.println("Email adresiniz kaydedildi");
		} else {
			System.out.println("Lutfen gecerli gmail adresinizi giriniz");
		}
		
		scan.close();
	}

}
