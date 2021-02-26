package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		//kullanicidan bir sayi isteyin ve sayinin tek veya cift
		//sayi oldugunu yazdirin
		
		Scanner scan =new Scanner (System.in);

		System.out.println("Lutfen bir tamsayi giriniz");
		
		int sayi = scan.nextInt();
		
		if(sayi % 2== 0) {
			System.out.println("girdiginiz sayi cift sayidir");
		}
	
		if (sayi%2==1) {
			System.out.println("girdiginiz sayi tek sayidir");
		}
		
		System.out.println("katildiginiz icin tesekkurler");
		
		scan.close();
	}

}
