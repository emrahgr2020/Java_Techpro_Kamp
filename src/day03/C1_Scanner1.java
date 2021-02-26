package day03;

import java.util.Scanner;

public class C1_Scanner1 {

	public static void main(String[] args) {
		
		
		Scanner scan =new Scanner (System.in);
		
		System.out.println("Lutfen Adinizi giriniz");
		
		String name = scan.nextLine();
		
		System.out.println("Lutfen soyisminizi giriniz");
		
		String surName=scan.nextLine();
		System.out.println("Isminiz : "+ name);
		System.out.println("Soyisminiz : "+surName);
		System.out.println("Kursumuza Kaydiniz alinmistir, Tesekkur ederiz: ");
		scan.close();
	}
	

}
