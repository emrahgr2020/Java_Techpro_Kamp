package calismalar;

import java.util.Scanner;

public class NestedIf2 {

	public static void main(String[] args) {
		// Kullanicidan bir sifre girmesiniz isteyin.
		// sifre 4 basamakli ise cift olup olmadigini kontrol edelim.
		// Cift sayi ise ekrana sifre dogru yazdiralim.
		// Tek ise tekrar deneyiniz yazdirin
		// sifre 4 basamakli degil ise ekrana tekrar deneyiniz yazdiralim.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sifre giriniz");
		int sifre = scan.nextInt();

		if (sifre >= 1000 && sifre < 10000) {
			if (sifre % 2 == 0) {
				System.out.println("Sifre dogrudur");
			} else {
				System.out.println("Tekrar deneyiniz");
			}
		} else {
			System.out.println("Lutfen tekrar deneyiniz...");
		}

		scan.close();
	}

}
