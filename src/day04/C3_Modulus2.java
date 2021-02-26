package day04;

import java.util.Scanner;

class C3_Modulus2 {

	public static void main(String[] args) {
		// kullanicidan 4 basamakli bir sayi alalim ve 
		// sayinin basamaklarini ters sirada yazidralim
		
		//bir sayinin basamaklarini elde etmek icin 
		//2 nci islemi tekrar tekrar yazariz
		//1. islem en sondaki basamagi elde etmek
		//2. islem en sondaki basamagi yok etmek
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Basamaklarini bulmak icin 4 basamakli bir sayi giriniz");

		int sayi = scan.nextInt();
		
		int birlerBas= sayi % 10;
		sayi /=10;
		
		//bu satirdan itibaren sayimiz 3 basamakli oldu
		
		int onlarBas = sayi % 10 ;
		sayi /=10;
		
		int yuzlerBas = sayi % 10;
		sayi /=10;
		
		int binlerBas = sayi;
		
		System.out.println("Birler basmagi :" + birlerBas);
		System.out.println("Onlarler basmagi :" + onlarBas);
		System.out.println("Yuzler basmagi :" + yuzlerBas);
		System.out.println("Binler basmagi :" + binlerBas);
		
		System.out.print(birlerBas);
		System.out.print(onlarBas);
		System.out.print(yuzlerBas);
		System.out.print(binlerBas);
		
		System.out.println();// alt satira gecsin diye "println"
		
		//farkli şekilde de yapilabilir
		System.out.println("Yazdiginiz sayinin tersten yazilisi : " + birlerBas+onlarBas+yuzlerBas+binlerBas);
		
		
		
		
		scan.close();
				
		

	}

}
