package day07_ifelsestatement;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		// kullanicidan bir karakter girmesini isteyin
		//harf oluo olmadigini yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		
			System.out.println("Lutfen bir karekter giriniz");
			
			
		char karekter= scan.next().charAt(0);
		
		if((karekter>='a' && karekter<='z') || (karekter>='A' && karekter<='Z')) {
			System.out.println("girilen karekter harf");
		}	else {
			System.out.println("girilen karekter harf degil");
		}
		
		scan.close();

	}

}
