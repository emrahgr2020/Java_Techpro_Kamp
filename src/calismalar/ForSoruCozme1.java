package calismalar;

import java.util.Scanner;

public class ForSoruCozme1 {

	public static void main(String[] args) {
		/*
		Soru
		11 ) Interview Question Kullanicidan 50’den kucuk bir sayi isteyin ve girilen
		sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 50 de kucuk tam sayi giriniz");

		int sayi = scan.nextInt();

		double faktoriyel=1;
		
		for (int i = 1; i <=sayi; i++) {
			faktoriyel *=i;
			

		}
		System.out.println("Girilen sayinin faktoriyel sonucu : " + faktoriyel );
		//System.out.println(Double.MAX_VALUE);
		scan.close();
	}

}
