package day13;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {
		// kullanicidan bir cumle isteyin
		// cumledeki tum bosluklari silin ve
		// tum a larin yerine e yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");

		String cumle = scan.nextLine();

		System.out.println(cumle.replace(" ", ""));

		System.out.println(cumle.replace('a', 'e'));

		cumle = cumle.replace(" ", "");
		cumle = cumle.replace('a', 'e');
		System.out.println(cumle);
		//eger atama yaparsak cumle kalici olarak degistigi icin cumle ye bir daha ulassamam

		System.out.println("Lutfen bir cumle giriniz");

		String cumle2 = scan.nextLine();
		
		System.out.println(cumle2.replace(" ", "").replace('a', 'e'));
		
		
		//
		System.out.println(cumle2.replace("a", "i").replace('e', 'i'));
		
		System.out.println(cumle2.toLowerCase().replace("a", "i").replace("e", "i"));
		
scan.close();
	}

}
