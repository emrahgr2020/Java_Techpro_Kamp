package day07_ifelsestatement;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		//kullanicidan bir tam sayi isteyin
		// sayi pozitif ise " sayi pozitif yazdirin"
		//sayi yuzden kucukse "kucuk sayi yazdirin"
		//sayi binden buyukse "buyuk sayi "yAZDIRIN
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen bir tam sayi giriniz");
		
		int sayi= scan.nextInt();
		
		
		if (sayi>0) {
			System.out.println("girilen sayi pozitif");
			
		}
		
		if (sayi<0) {
			System.out.println("girilen sayi negatir");
		}
		
		if (sayi<100) {
			System.out.println("ve kucuktur.");
		}
		
		if (sayi>1000) {
			System.out.println("ve buyuktur.");
		}
		
		scan.close();
	}

}
