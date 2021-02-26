package day10_switchcase;

import java.util.Scanner;

public class C2_Ternary {

	public static void main(String[] args) {
		
		//kullanicidan bir sayi alin
		//sayi cift ise "cift " yazdirin
		//degilse sayinin karesiniyazdirin
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bir tam sayi giriniz");
		int sayi= scan.nextInt();
		
		//eger ternary de iki durum icin farkli data tipleri donusu oluyorsa
		//yada mumkunse sonuclari ayni data tiplerine cevirmeye calisiriz
		
		//String sonuc = sayi%2==0 ? "cift" : sayi*sayi+"";
		
		System.out.println(sayi%2==0 ? "cift" : sayi*sayi);
		
		scan.close();
	}
}
