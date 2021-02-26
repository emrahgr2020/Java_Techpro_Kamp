package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		//scanner ile kullaniciden bilgi alabiliriz
		//3 adimda scanner isimini olusturuyoruz
		//1. ASİMDA sCANNER OLUSTURACAGİZ
		//
		
		Scanner scan = new Scanner(System.in);
		
		//new javada ne zaman new kelimesini gorseniz yeni bir object olusturuyoruz demektir
	
		//parametrenin icine yazilan degerlere parametre diyoruz ve Scanner için System.in yazmamiz gerekir
		//bir kod yazdigimizda kkodun altinda kirmizi cizgi olusuyorsa veya satir numarasi
		//olankisimda kirmizi x olusuyorsa birsey yanlis demektir.
		//java.util java'nin bizim cin hazirladigi bir kutuphanedir, ihtiyacimiz oldugunda
		//class a import etmemiz yeterlidir
		//scan olusturdugumuz Scanner objesine verdigimiz isdimdir , farkli isimler de verebiliriz
		//ancak scan ismi tum programciler tarafında kullanilan bir isimdir
		//kodumuzun anlasilması ve rahat okunmasi icin scan ismini kullanmayi tavsiye eidlir
		
		
		
		//2. adim kullaniciya bir mesaj yazin
		
		System.out.println("Karenin bir kenar uznlugunu girin");
		// 3. adim kullanicinin konsala girdigi degeri programimiza alacagiz
		//ve bir variable olusturup bu degeri atayacagiz
		// kullanicidan bir kenar uzunlugu istedigim icinkullanici
		//kucuk bir sayi da girebilir buyuk bir sayi da girebilir veya virgullu sayi da yazabilir
		
		
		double kenar = scan.nextDouble();
		
		System.out.println("girdiginiz kenar uzunluguna sahip karenin alani= "+kenar*kenar);
		
		
		scan.close();
	}

}
