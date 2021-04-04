package calismalar;

import java.util.Scanner;

public class UcakBIletiHesaplama {

	public static void main(String[] args) {
		/*
		 * km birim fiyati : 0.10$ 12 yasindan kucukse toplam fiyat %50 indirim 12 ve 24
		 * yas arasindaysa 10% 65 yasindan buyukse 30% gidis donus alirsa20% bu
		 * kosullara gore ucak biletini hesaplayan program
		 */
		Scanner scan = new Scanner(System.in);
		int yas, km, tip;
		System.out.println("---------- EC havayolu sirketimize hos geldiniz... ----------");
		System.out.print(" Lutfen km giriniz : ");
		km = scan.nextInt();
		System.out.print("\n Lutfen yasinizi girtiniz : ");
		yas = scan.nextInt();
		System.out.print("\nLutfen tip giriniz (1- Tek yon, 2-Gidis Donus): ");
		tip = scan.nextInt();

		double normalFiyat, biletFiyati, sonBiletFiyati;

		if (yas > 0 && km > 0 && (tip == 1 || tip == 2)) {
			normalFiyat = km * 0.10;

			if (yas < 12) {
				biletFiyati = normalFiyat * 0.5;
				if (tip == 1) {
					System.out
							.println("12 yasindan kucuk cocugunuzun tek yonlu bileti toplam : " + biletFiyati + "  $");
				} else {
					sonBiletFiyati = biletFiyati * 0.8;
					System.out.println("Gidis-Donus icin 12 yasindan kucuk cocugunuzun bileti toplam : "
							+ (sonBiletFiyati * 2) + "  $");
				}

			} else if (yas >= 12 && yas <= 24) {
				biletFiyati = normalFiyat * 0.9;
				if (tip == 1) {
					System.out.println("12 ile 24 yaslari arasindaki cocugunuzun tek yonlu bileti toplam : "
							+ biletFiyati + "  $");
				} else {
					sonBiletFiyati = biletFiyati * 0.8;
					System.out.println("Gidis-Donus icin 12 ile 24 yaslari arasindaki  cocugunuzun bileti toplam : "
							+ (sonBiletFiyati * 2) + "  $");
				}

			} else if (yas > 65) {
				biletFiyati = normalFiyat * 0.7;
				if (tip == 1) {
					System.out.println("65 yasindan buyuk kisinin bileti toplam : " + biletFiyati + "  $");
				} else {
					sonBiletFiyati = biletFiyati * 0.8;

					System.out.println("Gidis-Donus icin 65 yasindan buyuk kisinin bileti toplam : "
							+ (sonBiletFiyati * 2) + "  $");
				}
			} else if (yas > 24 || yas < 65) {
				normalFiyat = km * 0.10;
				if (tip == 1) {
					System.out.println("25 ve 65 yaslari arasindaki kisinin bileti toplam : " + normalFiyat + "  $");
				} else {
					System.out.println("Gidis-Donus icin 25 ve 65 yaslari arasindaki kisinin bileti toplam : "
							+ (normalFiyat * 2) + "  $");
				}
			}

			System.out.println(
					"---------- EC havayolarini tercih ettiginiz icin tesekkur ederiz. Iyi gunler dileriz... ----------");
		} else {

			System.out.println("Lutfen gecerli bilgiler giriniz");
			scan.close();
		}

	}

}
