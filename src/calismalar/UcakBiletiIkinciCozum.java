package calismalar;

import java.util.Scanner;

public class UcakBiletiIkinciCozum {

	public static void main(String[] args) {
		/*
		 * km birim fiyati : 0.10$ 12 yasindan kucukse toplam fiyat %50 indirim 12 ve 24
		 * yas arasindaysa(24 dahil) 10% 65 yasindan buyukse 30% gidis donus alirsa20%
		 * bu kosullara gore ucak biletini hesaplayan program
		 */
		Scanner scan = new Scanner(System.in);
		int yas, km, tip;
		System.out.println("---------- EC havayolu sirketimize hos geldiniz... ----------");
		System.out.print("Lutfen km giriniz : ");
		km = scan.nextInt();
		System.out.print("\nLutfen yasinizi girtiniz : ");
		yas = scan.nextInt();
		System.out.print("\nLutfen tip giriniz (1- Tek yon, 2-Gidis Donus): ");
		tip = scan.nextInt();

		double normalFiyat;

		if (yas > 0 && km > 0 && (tip == 1 || tip == 2)) {
			normalFiyat = km * 0.10;

			if (yas < 12) {
				normalFiyat *= 0.5; // indirim orani hesaplama
			} else if (yas >= 12 && yas <= 24) {
				normalFiyat *= 0.90;
			} else if (yas >= 65) {
				normalFiyat *= 0.30;
			} else {
				normalFiyat = km * 0.10;
			}

			if (tip == 2) {
				normalFiyat *= 0.80;
				normalFiyat *= 2;
			}
			System.out.println("Bilet tutari : " + normalFiyat + " $");

		} else {
			System.out.println("Girdiginiz degerler eksik veya yanlis. Lutfen tekrar deneyiniz...");
		}
		scan.close();

	}
}
