package day15_methodCreation;

public class C4_ForLoop1 {

	public static void main(String[] args) {
		// 5 defa Hello World yazdirin
		
		/*
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		*/
		
		//bunun yerine loop kullaniyoruz
		//ne yapacagimizi javaya soyluyoruz , kac kerede yapmasi gerektiginide soyluyoruz
		//tum loop larda 3 seyi yazmak zorundayiz
		//1-- baslangic degeri
		//2-- bitis degeri
		// 3-- kacar kacar artis degeri
		for(int i=1 ; i<=5; i++) {
			System.out.println("Hello World");
		}
		
		//Not : eger sart kismi bizim artisimiza gore hep true verirse loop sonsuz donguye girer
		//loop da artis degeri pozitif oldugu gib negetif de olnbilir i--
		//artis degeri 1 olmak zorunda degil farkli da olamaz
		//eger loop un sarti hic true olmaz ise loop body hic devreye girmez
	}

}
