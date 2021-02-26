package day06_ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen gun isminin ilk harfini yaziniz");
		
		char ilkHarf= scan.next().toUpperCase().charAt(0);
		
		if (ilkHarf =='P') {
			System.out.println("Pazar");
			System.out.println("Pazartesi");
			System.out.println("Persembe");
		}
		
		if (ilkHarf =='S') {
			System.out.println("Sali");
			
		}
		
		if (ilkHarf =='C') {
			System.out.println("Carsamba");
			System.out.println("Cuma");
			System.out.println("Cumartesi");
			
		}
		
		if (ilkHarf !='P' && ilkHarf !='C' && ilkHarf !='S') {
			System.out.println("Yanlis harf girdiniz lutfen tekrar deneyin");
		}
		

		scan.close();
		
	}

}
