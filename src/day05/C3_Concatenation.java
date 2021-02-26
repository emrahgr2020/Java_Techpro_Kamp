package day05;

public class C3_Concatenation {

	public static void main(String[] args) {
		// Concatenation (Birlestirme): javada birden fsazla String i + isareti 
		//ile toplarsaniz, java bu String leri yanyana yazar
		
		
		String str1 ="Java";
		String str2="Guzeldir";
		System.out.println(str1+" "+str2);
		
		
		System.out.println(str2+str1);
		
		
		
		
		
		int sayi1=5;
		int sayi2= 4;
		
		System.out.println(sayi1+sayi2);
		
		System.out.println(sayi1+sayi2+str1+str2);
		System.out.println(str1+str2+sayi1+sayi2);

		
		
		System.out.println(str1+str2+(sayi1 - sayi2));
		
		// verilen degiskenlerle 9 javaguzaldir yazin
		
		System.out.println(sayi1+sayi2+" "+str1+str2);
		
		System.out.println(str1+str2+sayi1*sayi2);
		
		
		
		
	}

}
