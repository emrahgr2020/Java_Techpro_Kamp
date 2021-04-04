package calismalar;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		// kullanicidan bir cumle isteyin
		// cumledeki tum bosluklari silin ve
		// tum a larin yerine e yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");

		String cumle = scan.nextLine();
		System.out.println(cumle.replace(" ", "").replace("a", "e").replace("m", ""));
		

		
scan.close();
	}

}
