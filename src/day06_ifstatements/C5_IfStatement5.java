package day06_ifstatements;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		// kullanicidan bir dik dortgenin iki kenar uzunlugunu alin
		// kenar zuuznluklari esit ise kare degilse dikdortgen yazin

		Scanner scan = new Scanner(System.in);
		
		System.out.println("bir dikdortgenin kenar uzunluklarini giriniz");
		
		double kenar1= scan.nextDouble();
		double kenar2= scan.nextDouble();
		
		if (kenar1>0 && kenar2>0 && kenar1 == kenar2 ) {
			System.out.println("Kare");
		}
		
		if (kenar1>0 && kenar2>0 && kenar1 != kenar2) {
			System.out.println("Dikdortgen");
			
		}
		
		if(kenar1<=0 || kenar2<=0) {
			System.out.println("Lutfen gecerli uzunluk giriniz");
		}
		
		
		
		
		scan.close();
	}
	
	

}
