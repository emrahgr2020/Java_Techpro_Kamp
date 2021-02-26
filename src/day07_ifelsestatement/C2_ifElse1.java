package day07_ifelsestatement;

import java.util.Scanner;

public class C2_ifElse1 {

	public static void main(String[] args) {
		// kullanicidan dikdortgenin kenar uzunluklarini alin
		// uzunluklar esit ise kare degilse kare degil yazdiralim
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen kenar uzunlugu giriniz");
		
		double kenar1= scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("girilen deger kare dir");
		}	else {
			System.out.println("girilen degerler kare degildir");
		}
		
		scan.close();
	}

}
