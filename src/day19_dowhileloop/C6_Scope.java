package day19_dowhileloop;

public class C6_Scope {

	//bir class icerisinde olusturulan variable lerin nerede gecerli oldugu
	//ve nereden kullanilabildigini o variablenin Scope u belirler
	
	// google java da scope nedir?
	
	
	public static void main(String[] args) {
		int sayi=10;
		denemeMethod();
		sayi++;
		System.out.println(sayi);

	}

	public static void denemeMethod() {
		
		
	}

}
