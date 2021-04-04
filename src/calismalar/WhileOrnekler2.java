package calismalar;

import java.util.Scanner;

public class WhileOrnekler2 {

	public static void main(String[] args) {
		// Ornek1 : Faktoriyel hesaplama
		// Ornek 2: Harmonik sayilar
		// Ornek 3: yildizlar ile ucgen yapma
		// Ornek 4 :uslu sayi hesaplama

		// Ornek1
		// 5!=5*4*3*2*1
		/*
		 * Scanner scan =new Scanner (System.in);
		 * System.out.print("Lutfen faktoriyelini almak istediginiz sayiyi giriniz: ");
		 * int f=scan.nextInt(); int sonuc=1;
		 * 
		 * while(f>0) { sonuc *=f;//verilen deger azaldikca carpilir f--; }
		 * System.out.println(sonuc); scan.close();
		 */

		// oRNEK 2
		/*
		 * Scanner scan =new Scanner (System.in);
		 * System.out.print("Lutfen HARMONIK sayisi giriniz: "); double
		 * h=scan.nextDouble(); double harmonic=0.0;
		 * 
		 * while(h>0) { harmonic +=(1/h); h--; } System.out.println(harmonic);
		 */

		// Ornek3
		// *
		// **
		// ***

		/*
		 * Scanner scan =new Scanner (System.in); int star=scan.nextInt(); int i=1;
		 * while(i<=star) { int k=1; while(k<=i) { System.out.print("*"); k++; }
		 * System.out.println(); i++; scan.close();
		 * 
		 * }
		 */

		// ornek4
		Scanner scan = new Scanner(System.in);
		int sayi1, sayi2, sonuc=1,i=1;
		System.out.print("Ussu alinacak sayi : ");
		sayi1 = scan.nextInt();
		System.out.println("Us olacak sayi: ");
		sayi2 = scan.nextInt();
		
		//int i=1;
		while(i<=sayi2) {
			sonuc *=sayi1;
			i++;
		}
		System.out.println("Sonuc : "+sonuc);
scan.close();
	}

}
