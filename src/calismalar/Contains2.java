package calismalar;

import java.util.Scanner;

public class Contains2 {

	public static void main(String[] args) {
		//Kullanicidan bir cumle isteyin Cumle “ kelimesi iceriyorsa tum
		//cumleyi buyuk harf olarak,olarak,“ kelimesi iceriyorsa tum cumleyi kucuk harf
		//olarak yazdirin, iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi
		//icermiyor” yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir cumle girin");
		
		String cumle = scan.nextLine();
		
		//System.out.println(cumle.endsWith("a")); //true veya false son
		//System.out.println(cumle.startsWith("ana", 2)); //ture veya false bas
		//System.out.println(cumle.startsWith("ada")); //true veya false
		
		if (cumle.contains("buyuk")) {
			System.out.println(cumle.toUpperCase());
		} else if(cumle.contains("kucuk")){
			System.out.println(cumle.toLowerCase());
		}else {
			System.out.println("cumle kucuk veya buyuk kelimesi icermiyor");
		}
		scan.close();
	}

}
