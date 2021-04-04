package day21_scope;

public class Scope2 {

	public static void main(String[] args) {
		//Static variableler icin object olusturma ihtiyaci yoktur
		//Baska bir Class dan static variablelere ulasmak istedigimizde
		//ulasmak istedigimiz class in adi .static variable adi yazmamiz yeterlidir
		System.out.println(Scope1.okulAdi);
		System.out.println(Scope1.okulId);//Java Run Time programdir
											//Scope2 class i calistirildiginda Scope1 classi calismaz
											// dolayisi ile en basta olusturulan veya atanan degerler gecerli olur
		
		Scope1.okulAdi="Mehmet Koleji";
		System.out.println(Scope1.okulAdi);//Mehmet koleji
		
		Scope1.staticMethod();
		System.out.println(Scope1.okulId);
		System.out.println(Scope1.okulAdi);
	}										
	
	

}
