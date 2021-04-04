package day19_dowhileloop;

import java.util.Scanner;

public class C3_DoWhileLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sayi=0;
		
		do {
			
			
			System.out.println("Lutfen pozitif bir tam sayi giriniz");
			sayi = scan.nextInt();
			
		}while(sayi<=0);//sart true olunca her seferinde basa tekrar donecek
						//istemedigim durum burasi
		
		System.out.println("aferin");// sart false olunca burayi yazdiracak

		scan.close();
	}

}
