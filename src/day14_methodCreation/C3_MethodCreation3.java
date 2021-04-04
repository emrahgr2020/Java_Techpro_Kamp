package day14_methodCreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {
		// verilen 3 double sayinin ortalamasini alan bir method yazin
		// main method icinden cagirarak methodu calistirin

		ortalama(20, 30);//2.yi calistirir
		ortalama(10, 40, 80);//1.yi calistirir

	}// MM sonu

	public static void ortalama(double sayi1, double sayi2, double sayi3) {

		System.out.println((sayi1 + sayi2 + sayi3) / 3);
	}

	public static void ortalama(double sayi1, double sayi2) {

		System.out.println("girdiginiz iki sayini ortalamasi : " + (sayi1 + sayi2) / 2);

	}

}
// c sonu
