package day03;

import java.util.Scanner;

public class C2_Scanner2 {
	
	
	public static void main(String[] args) {
		
		
		//kullanıcıdan ismini isteyip ilk harfini buyuk harf olarak yazdırın
		
		//mehmet==> basharfiniz:M
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen isminizi giriniz");
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		System.out.println("bas harfiniz : "+ ilkHarf);
		scan.close();
	}
	

}
