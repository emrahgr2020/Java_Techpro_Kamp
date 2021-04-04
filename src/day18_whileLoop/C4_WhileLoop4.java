package day18_whileLoop;

import java.util.Scanner;

public class C4_WhileLoop4 {

	public static void main(String[] args) {
		//Soru 4) Kullanicidan baslangic ve bitis haflerini alin ve 
		//baslangic harfinden baslayip bitis harfinde biten tum harfleri 
		//buyuk harf olarak ekrana yazdirin. Kullanicinin hata yapmadigini farz edin.

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen baslangic harfi giriniz");
		char basHarf= scan.next().toUpperCase().charAt(0);
		System.out.println("Lutfen bitis harfi giriniz");
		char sonHarf= scan.next().toUpperCase().charAt(0);
		
		
		for (char i = basHarf; i <=sonHarf; i++) {
			System.out.print(i+" ");
			
		}
		
		// while loop ile yapalim
		
		System.out.println(" ");
		
		// baslangic degeri var basHarf
		
		while (basHarf <=sonHarf) {
			System.out.print(basHarf+ " ");
			
			basHarf++;
			
		}
		scan.close();
	}

}
