package calismalar;

import java.util.Scanner;

public class WhileCalismalari1 {

	public static void main(String[] args) {
		//1. 1 den 100e kadar olan cift sayilari yazdirma
		//2.negatif bir deger girilene kadar kullanicidan girisleri kabul eden
		//ve girilen degerlerden tek sayilari toplayan program
		
		//3. girilen sayiya kadar olan 2 nin kuvvetleri 
		
		
		
		
		/* Ornek 1
		int i=1;
		
		while (i<100) {
			
			if (i%2 == 0) {
				System.out.println(i);
			}
			
			i++;
			
		}
		 */
		
		
		/*Ornek2
		Scanner scan=new Scanner(System.in);
		int toplam = 0;
		int input;
		
		while (true) {
			System.out.println("Lutfen sayi giriniz");
			input=scan.nextInt();
			
			if (input<0) {
				System.out.println("Program Bitti Negatif sayi girdiniz!!");
				break;
			} 
			if(input%2==1) {
				//toplam = toplam+input;
				toplam +=input;
			}
		}
		System.out.println("Girilen tek sayilarin toplami : "+ toplam);
		scan.close();
		*/
		
		
		Scanner scan=new Scanner(System.in);
		int input,toplam=0;
		do {
			System.out.print("Lutfen sayi giriniz : ");
			input=scan.nextInt();
			if(input%2==0) {
				toplam +=input;
			}
		}while(input>0);
		
		System.out.println("girilen cift sayilar toplami : "+toplam);
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Scanner scan=new Scanner(System.in);
		System.out.println("Sayi giriniz: ");
		int input =scan.nextInt();
		int k=1;
		
		while(k<=input) {
			System.out.println(k);
			k=k*2;
			
		}
		scan.close();
		*/
		
			
		
	}
	

}
