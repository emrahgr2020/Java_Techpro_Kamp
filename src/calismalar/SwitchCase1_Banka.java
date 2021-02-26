package calismalar;

import java.util.Scanner;

public class SwitchCase1_Banka {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int bakiye= 1000;
		int islem;
		
		System.out.println("1: Bakiye goruntuleme");
		System.out.println("2: Para Yatirma");
		System.out.println("3: Para cekme");
		System.out.println("4: Sistemden cikis");
		
		islem=scan.nextInt();
		
		switch (islem) {
			
		case 1 :
			System.out.println("Bakiyeniz : " + bakiye+ " tl dir.");
			break;
			
		case 2 :
			System.out.println("Ne kadar yatirmak istiyorsunuz");
			int miktar = scan.nextInt();
			
			bakiye +=miktar;
			System.out.println("Yeni bakiyeniz : " + bakiye +" tl dir");
			break;
			
		case 3 :
			System.out.println("Ne kadar cekmek istiyorsunuz");
			miktar = scan.nextInt();
			
			bakiye -=miktar;
			System.out.println("Yeni bakiyeniz : " + bakiye +" tl kaldi");
			break;
			
		case 4 :
			System.out.println("Sistemden cikiliyor...");
			break;
			
		default :
			System.out.println("Hatali islem");
			
		}
		
		scan.close();

	}
}
