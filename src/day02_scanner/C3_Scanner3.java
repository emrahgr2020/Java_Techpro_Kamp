package day02_scanner;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		//kullanıcıdan ismini ve soy ismini alıp ve aralarında bir bosluk birakarak
		//isim ve soyisim yazdırın
		
		
		
		Scanner scan =new Scanner (System.in);
		System.out.println("lutfen isminizi giriniz");
		String name = scan.nextLine(); //sadece next secilirse kullanıcı birden fazla kelime girerse de ilk kelimeyi alır
									// eger kullanıcının girdigi tum yazıyı almak istiyorsak nextLine() secmeliyiz
		
		System.out.println("lutfen soy isniminzi giriniz");
		String surname=scan.nextLine();
		System.out.println(name+" "+surname);
		scan.close();
		
		

	}

}
