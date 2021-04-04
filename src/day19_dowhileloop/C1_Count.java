package day19_dowhileloop;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		// kullanicidan bir cumle ve bir harf isteyin
		// while loop kullanarak umlede istenen harf kac kez kullanilmis bulunuz
		// program Case Sensitive olsun

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle = scan.nextLine();
		System.out.println("Lutfen saymak istediginiz harfi giriniz");
		String harf=scan.next().substring(0, 1);//String olarak harfi alir
		
		int count=0;//baslangicta 0
		
		int index=0;//baslangic
		
		while (index<cumle.length()) {//kodu index e gore yaptik
			if (cumle.subSequence(index, index+1).equals(harf)) {
				count++;	//dogru ise 1 artar
			} 
			index++;//artis
			
			
		}
		System.out.println("Cumlede "+ harf+" harfi "+count + " defa kullanilmis");
		scan.close();
	}
	

}
