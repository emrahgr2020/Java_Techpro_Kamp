package day21_scope;

public class Scope1 {

	static int okulId = 1201;
	static String okulAdi = "Yildiz koleji";
	static boolean acikMi;

	
	//static variableler class level de olusturuldugu icin classin her yerinde kullanilabilirler
	//instance variable lar static olmayan method larda direk kullanilabiliyor iken static methodlarda
	//obje olusturularak kullanilabiliyordu
	//static variable ler ister static isterse static olmayan tum method lardan direk kullanilabilir
	public static void main(String[] args) {
		System.out.println(okulId + " " + okulAdi + " " + acikMi);// 1201 Yildiz Koleji false
		okulId = 1202;
		acikMi=true;
		staticMethod();
		System.out.println(okulId + " " + okulAdi + " " + acikMi);
	}

	public static void staticMethod() {
		System.out.println(okulId + " " + okulAdi + " " + acikMi);// 1202 Yildiz Koleji true
		okulId=1203;
	}

	public void method() {
		okulId=1205;
	}

}
