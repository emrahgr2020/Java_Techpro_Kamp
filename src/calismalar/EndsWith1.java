package calismalar;

import java.util.Scanner;

public class EndsWith1 {

	public static void main(String[] args) {
		// kullanicidan bir mail isteyin
		// eger @ isareti icermiyorsa "girdiginiz bilgi email degil"
		// eger @ isareti iceriyor ama @gmail.com icermiyorsa "lutfen gmail aderesi
		// yazin"
		// eger ilk iki sarti sagliyor ama @gmail.com ile bitmiyor ise "gecersiz gmail"
		// yazsin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir gmail adresi giriniz");

		String email = scan.nextLine().toLowerCase();

		if (!email.contains("@")) {
			System.out.println("girdiginiz bilgi email degil");
		} else if (!email.contains("@gmail.com")) {
			System.out.println("lutfen gmail aderesi giriniz");
		} else if (email.endsWith("@gmail.com")) {
			System.out.println("giris basarili");
		} else {
			System.out.println("giris basarisiz");
		}
		scan.close();
	}

}
