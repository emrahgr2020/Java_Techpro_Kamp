package day21_scope;

public class Scope3 {

	public static void main(String[] args) {
		int sayi=10;
		//1-bir method icinde olusturulan variable, sadece o method icinde kullanilabilir
		//1-System.out.println(isim);
		
		
		int sayi2; //2-bir local variable deger atanmadan da olusturulabilir
		//System.out.println(sayi2); //2- ancak ilk deger atanmasi yapilmayan variable ler kullanilmaz
		//sayi++; //2-ilk deger atanmadigi icin arttirma azaltma da yapilmaz
		
		//2- Java deger atamasi olmadan local variable olusturmasina izin verir ileride deger atanacak diye bekler
		sayi2=15; //2-olusturma ayri satirda (11. satir) deger atamasiayri satirda (16 satir) yapilabilir
		//3- birden fazla medhodun oldugu class larda her method da kullanmamiz gerekir
		//3- ortak variableler varsa class level da variable olusturmaliyim
		//3- ortak variable class in yapisina bagli olarak instance veya static olabilir
	}
	public static void staticMethod() {
		String isim="Hasan";
		//1-System.out.println(isim); bu kurala main method icerisinde olusturulan variableler de dahildir
		
	}
	
	public void method() {
		boolean isTrue=true;
		//1-System.out.println(isim); bu kural static olan veya olmayan tum methodlar icin gecerlidir
		
	}

}
