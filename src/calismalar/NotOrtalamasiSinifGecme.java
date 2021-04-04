package calismalar;

import java.util.Scanner;

public class NotOrtalamasiSinifGecme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int turkce, matematik, fenBilgisi, sosyalBilgisi, bedenEgitimi;
		double ortalama = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("Turkce ders notunu giriniz : ");
		turkce = scan.nextInt();
		System.out.print("\n Matematik ders notunu giriniz : ");
		matematik = scan.nextInt();
		System.out.print("\n Fen bilgisi ders notunu giriniz : ");
		fenBilgisi = scan.nextInt();
		System.out.print("\n Sosyal bilgisi ders notunu giriniz : ");
		sosyalBilgisi = scan.nextInt();
		System.out.print("\n Beden egitimi ders notunu giriniz : ");
		bedenEgitimi = scan.nextInt();

		ortalama = (turkce + matematik + fenBilgisi + sosyalBilgisi + bedenEgitimi) / 5;

		if (ortalama < 50) {
			System.out.println("sinifta kaldiniz");

		} else {
			System.out.println("tebrikler gectiniz");
		}
		System.out.println("ortalamaniz : " + ortalama);
		scan.close();
	}

}
