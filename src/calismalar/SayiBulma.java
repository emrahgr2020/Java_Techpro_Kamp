package calismalar;

public class SayiBulma {

	public static void main(String[] args) {

		int sayilar[] = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean varMi = false;

		for (int sayi : sayilar) {//dizilerin butun elemanlarini gezzmek icin
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Sayi mevcuttur");
		} else {
			System.out.println("Sayi mevcut degildir");
		}
	}

}
