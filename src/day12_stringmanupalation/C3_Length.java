package day12_stringmanupalation;

import java.util.Scanner;

public class C3_Length {

	public static void main(String[] args) {
		// kullanicidan bir String girmesini isteyin
		//girilen stringin son harfini buyuk harf olarak yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir cumle giriniz giriniz");

		
		String str=scan.nextLine().toUpperCase();
	
		System.out.println("Girdiginiz cumlenin son harfi : " + str.charAt(str.length()-1));
		
		
		String str2 ="";
		System.out.println(str2.length());//0
		
		
		//String str3=null;//null hic demek
						//nermalde stringler "" icine yazilir ama null icin buna gerek yoktur
						//null case sensitive dir; dolayisi ile NULL veya Null yazilmaz
						//null bir deger degildir; sadece hicligi gosteren bir pointer dir
		
		
		//System.out.println(str3.length()); //RTE verir
		
		
		//System.out.println(str3.equals(str2));
		
		
		
		scan.close();
		
	}

}
