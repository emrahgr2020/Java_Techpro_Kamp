package day13;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {

		String str = "Java'yla hayat ne guzel";
		System.out.println(str.endsWith("zel"));// true

		System.out.println(str.endsWith("ne guzel"));// true
		System.out.println(str.endsWith("zel "));

		// kullanicidan bir mail isteyin
		// eger @ isareti icermiyorsa "girdiginiz bilgi email degil"
		// eger @ isareti iceriyor ama @gmail.com icermiyorsa "lutfen gmail aderesi
		// yazin"
		// eger ilk iki sarti sagliyor ama @gmail.com ile bitmiyor ise "gecersiz gmail"
		// yazsin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir gmail adresi giriniz");

		String email = scan.nextLine().toLowerCase();

		if (!email.contains("@")) { // basina ! olunca--> email @isareti icermiyorsa
			System.out.println("girdiginiz bilgi email degil");
		} else if (!email.contains("@gmail.com")) {
			System.out.println("lutfen gmail aderesi yazin");
		} else if (email.endsWith("@gmail.com")) { // sonu @gmail.com mu diye bakiyor
			System.out.println("email iniz basariyla kaydedildi");
		} else {
			System.out.println("gecersiz gmail");
		}

		scan.close();

	}

}
