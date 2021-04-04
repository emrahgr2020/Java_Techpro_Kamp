package day20_scope;

import java.util.Scanner;

public class Scope1 {

	public int sayi;// class in icinde fakat main methodun disinda olusturulan
				// ve static olmayan variable lara INSTANCE(Object) variable denir
				// class lavel de olusturuldugu icin classin her yerinden belli sartlarla
				// kullanilabilir
				// Instance variable lar object e bagli olarak calisir(ogretmen adi veya
				// ogrencinin notu)
	public String isim = "Mehmet";
	public String soyIsim;// default deger null
	boolean izindeMi;// default deger false
	char ilkHarf;// default bosluk

	public static void main(String[] args) {

		// System.out.println(sayi); //static olmayan bir variable a static method
		// icinden ulasamayiz
		// main methodumuz static oldugu icin main method icerisinden
		// static olmayan variable veya method lara direk ulasamayiz
		// instance bir variable a main method icerisinden ulasmak istedigimizde
		// OBJECT olusturmaliyiz

		Scanner scan = new Scanner(System.in);// bu javada standaryt obje olusturma formudur
		// class ismi obje ismi obje olusturma keyword class ismi ()

		Scope1 obj1 = new Scope1();
		System.out.println(obj1.sayi);// buna deger atamadik java default deger verdi 0
		// instance variable ler olusturuldugunda biz istersek deger atayabiliriz
		System.out.println(obj1.isim);
		System.out.println(obj1.soyIsim);// buna deger atamadik java default deger verdi null
		// instance variable lara eger biz deger atamaz isek Java Default deger atar

		Scope1 obj2 = new Scope1();
		obj2.isim = "Muslum";
		obj2.soyIsim = "Baba";

		System.out.println(obj2.isim + " " + obj2.soyIsim);// Muslum baba
		System.out.println(obj1.isim + " " + obj1.soyIsim);// Mehmet null
		System.out.println(obj2.izindeMi);// false
		System.out.println(obj2.ilkHarf);// space

		Scope1 obj3 = new Scope1();

		obj3.isim = "Ferdi";
		obj3.soyIsim = "Tayfur";
		obj3.izindeMi = true;
		System.out.println(obj3.isim + " " + obj3.soyIsim + " " + obj3.izindeMi); // Ferdi Tayfur true
		scan.close();
	}

	public static void staticMethod() {

	}

	public void method() {
		System.out.println(sayi);// bu method static olamdigi icin intance variablelere direk ulasabilir
		sayi = sayi + 20;//ve bu method

	}

}
