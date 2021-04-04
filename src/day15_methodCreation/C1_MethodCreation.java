package day15_methodCreation;

import java.util.Scanner;

public class C1_MethodCreation {

	public static void main(String[] args) {
		// Soru 1 ) Kullanicidan bir tam sayi alin. Bu sayinin negatif veya pozitif
		// oldugunu,
		// sayinin basamak sayisini, tek mi cift mi oldugunu ve
		// Uc basanmakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		// 100’den kucukse sadece 1’ler basamagini yazdirin.

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bir tam sayi giriniz");
		int sayi = scan.nextInt();

		pozitifNegatif(sayi);// girilen sayi argumentinin pozitif yada negatif oldugunu yazdirsin
		tekMiCiftMi(sayi);
		
		if (sayi>100) {
			yuzdenBuyuk(sayi);
			
		} else {
			yuzdenKucuk(sayi);
		}
		scan.close();

	}

	public static void yuzdenKucuk(int sayi) {
		System.out.println(sayi%10);
		
	}

	public static void yuzdenBuyuk(int sayi) {//523
		int rakamlarToplami;
		rakamlarToplami=sayi%10;//3
		sayi/=10;//52
		rakamlarToplami +=sayi%10;//2
		sayi/=10;//5
		rakamlarToplami +=sayi%10;
		System.out.println(rakamlarToplami);
		
		
		
	}

	public static void tekMiCiftMi(int sayi) {

		if (sayi % 2 == 0) {
			System.out.println("sayi cift");
		} else {
			System.out.println("sayi tek");
		}

	}

	public static void pozitifNegatif(int sayi) { // parametre yazarken data tipinide yazmaliyiz

		System.out.println(sayi > 0 ? "pozitif" : (sayi < 0 ? "negatif" : "pozitif veye negatif degil"));
	}

}
