package calismalar;

import java.util.Scanner;

public class SwitchCase_IfElse_Hesapmakinesi {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen Islem Yapmak Istediginiz Birinci Sayiyi Giriniz : ");
		
		
		double sayi1= scan.nextDouble();
		
		System.out.println("Lutfen Islem Yapmak Istediginiz Ikinci Sayiyi Giriniz : ");
		double sayi2 = scan.nextDouble();
		
		System.out.println("Lutfen Yapmak Istediginiz Islemi Giriniz : 1- Toplama, 2- Cikartma,  3- Carpma, 4- Bolme");
		int islem = scan.nextInt();
		
		/*switch (islem) {
		
		case 1:
			System.out.println("Islem sonucu :" + (sayi1 + sayi2));
			break;
		case 2:
			System.out.println("Islem sonucu :" + (sayi1 - sayi2));
			break;
		case 3:
			System.out.println("Islem sonucu :" + (sayi1 * sayi2));
			break;
		case 4:
			System.out.println("Islem sonucu :" + (sayi1 / sayi2));
			break;
			
			default :
				System.out.println("Hatali islem...   Lutfen tekrar deneyiniz...");*/
				
			if (islem==1) {
				System.out.println("Islem sonucu :" + (sayi1 + sayi2));
			} else if(islem==2) {
				System.out.println("Islem sonucu :" + (sayi1 - sayi2));
			}else if(islem==3) {
				System.out.println("Islem sonucu :" + (sayi1 * sayi2));
			}else if(islem==4) {
				System.out.println("Islem sonucu :" + (sayi1 / sayi2));
			}else {
				System.out.println("Hatali islem...   Lutfen tekrar deneyiniz...");
			}
				
			scan.close();
				
				
		}

	}


