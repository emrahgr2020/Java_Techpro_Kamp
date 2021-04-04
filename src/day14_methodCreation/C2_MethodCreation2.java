package day14_methodCreation;

public class C2_MethodCreation2 {

	public static void main(String[] args) {

		// Bir methodu calistirmak icin main methodun icinden cagirmamiz gerekir
		// Bir methodu cagirmak icin ise method adini ve parametrelere uygun
		// argumentlleri yazmaliyiz

		ortalama(85.2, 90.3); // method call

	}// mainethod sonu

	// bir method olusturmak istedigimizde Class in icinde ama main methodun
	// disinda bir alanda olusturmaliyiz. genel kullanimlar main method dan sonra
	// olur

	public static void ortalama(double sayi1, double sayi2) {

		System.out.println("girdiginiz iki sayini ortalamasi : " + (sayi1 + sayi2) / 2);
		// methodu olusturmak o methodu calistirmak icin yeterli degildir
		// olusturulan method main method icinden cagrilinca calisir

	}

}// Class sonu
