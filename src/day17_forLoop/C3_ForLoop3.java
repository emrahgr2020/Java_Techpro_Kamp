package day17_forLoop;


import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// kullanicidan 35 dan kucuk pozitif bir sayi alin
		// girilen sayinin faktoriyelini heseplayip yazdiran bir method olusturun

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 35 de kucuk tam sayi giriniz");

		int sayi = scan.nextInt();

		if (sayi <= 0 || sayi > 35) {
			System.out.println("Lutfen gecerli bir sayi giriniz");
		} else {
			faktoriyelBul(sayi);
		}
		scan.close();

	}

	public static void faktoriyelBul(int sayi) {
		double faktoriyel = 1;

		for (int i = 1; i <= sayi; i++) {

			faktoriyel *= i;

		}
		System.out.println(faktoriyel);

	}

}
