package day15_methodCreation;

public class C3_MedhodOverloading {

	public static void main(String[] args) {

		// Java da ayin isimle birden fazlamethod olusturulursa buna overloading denir
		// overloading yapabilmek icin Method Signature larinin frkli olmASI GEREKIR
		// Method Signature = isim + parametre sayisi + parametre data turu
		// birbirini kapsayan data turleri oldugunda Java en optimum cozumleri uretir
		//(Tamammen uyan varsa o medhodu calistirir
		//Tamamamen uyan yoksa da en fazla uyan methodu calistirir
		//Eger kapsayan bir method da bulamazsa Java CTE verir

		toplama(2, 5);

	}

	public static void toplama(int sayi1, int sayi2) {
		System.out.println("integer method sonucu : " + (sayi1 + sayi2));
	}

	public static void toplama(double sayi1, double sayi2) {
		System.out.println("double method sonucu : " + (sayi1 + sayi2));
	}

	public static void toplama(int sayi1, double sayi2) {
		System.out.println("integer/double method sonucu : " + (sayi1 + sayi2));
	}



	public static void toplama(double sayi1, int sayi2) {
		System.out.println("double/intiger method sonucu : " + (sayi1 + sayi2));
	}

	public static void toplama(char char1, char char2) {
		System.out.println("char method sonucu : " + (char1 + char2));
	}

	public static void toplama(String str1, String str2) {
		System.out.println("String method sonucu : " + (str1 + str2));
	}

}
