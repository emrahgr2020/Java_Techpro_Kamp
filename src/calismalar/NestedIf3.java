package calismalar;

import java.util.Scanner;

public class NestedIf3 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alalim.
		// Eger sayi 0' dan buyuk esit ve 11'dan kucukse 2'ye bolunuyor mu diye kontrol
		// edelim.
		// Eger sayi 2 ye bolunuyorsa “0 ile 10 arasinda ki 2'ye bolunen sayi”
		// yazdiralim.
		// Eger 2' ye bolunmuyorsa “0 ile 10 arasinda 2'ye bolunmeyen sayi” yazdiralim

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();

		if (sayi >= 0 && sayi < 11) {
			if (sayi % 2 == 0) {
				System.out.println("0 ile 10 arrasindaki 2'ye bolunen sayi");
			} else {
				System.out.println("0 ile 10 arrasindaki 2'ye bolunmeyen sayi");
			}
		} else {
			System.out.println("Lutfen pozitif bir sayi giriniz");
		}
		
		scan.close();
	}

}
