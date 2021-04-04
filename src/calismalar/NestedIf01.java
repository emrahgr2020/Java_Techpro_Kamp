package calismalar;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alalim. Sayi 0 dan kucukse “SAYI”,
				// 0 dan buyuk esit ise ve 10 dan kucu ise “Rakam”,
				// 10'dan buyukse sayi yazan java kodunu nested if ile yazalim.
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
				
		if (sayi<0) {
			System.out.println("sayi");
		} else {
			if (sayi>=0 && sayi<10) {
				System.out.println("Rakam");
			} else {
				System.out.println("Sayi 10 dan buyuk");
			}
		}
		scan.close();
	}

}
