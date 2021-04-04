package day33_encapsulation;

import day20_scope.Scope1;
import day21_scope.Scope6;

public class Encapsulation01 {

	public static void main(String[] args) {
		// OOP concept
		//Object Oriented Programing
		//Bir proje kapsamindaki class larda olusturulan variable ve methodlarin
		//baska class larda tekrar tekrar yazilmasi , var oldugu class dan obje olusturarak
		//bu variable ve methodlarin istedigi kadar kullanilmasidir (reusulibility)
		
		
		//scop6 class indaki variable ve methodlara ulasmak istiyorum
		//bunun icin scop6 class indan obje uretmeliyiz
		
		Scope6 obj1 = new Scope6();
		obj1.num1=10;
		System.out.println(obj1.num1);//10
		obj1.add();
		
		//deneme methodunu main method icinden cagirabilirmiyim
		//deneme(); methodu static olmadigi icin direk cagirilamaz
		//bunun yerine icinde oldugumuz class dan bir obje uretip onun uzerinden 
		//static olmayan methodlari da cagirabiliriz
		
		Encapsulation01 obj3 = new Encapsulation01();
		obj3.deneme();
	}
	public void deneme() {
		// Projemiz kapsaminda bulunana tum class lardan public variable ve methodlara istedigim yerden
		//obje ureterek ulasabilirim
		//eger ulasmak istedigim class uyeleri (class member) public degil ise baska package lerden ulasmak 
		//icin ekstra islem yapmak gerekir
		Scope1 obj2 = new Scope1();
		//esitligin sol tarafi declaration
		//declaration 2 parcadir ilk parca Data turu, ikinci kisim ise isim
		//non primitive le icin data turu ayni zamanda class ismi olabilir
		//esitligin saginda ise deger, iki parcadan olusur ilki new keyword u , ikincisi de 
		//constructor dur
		//hangi class dan obje uretmek istersek o class in constractor unu kullaniriz
		
		obj2.isim="Ahmet";
		obj2.soyIsim="Ozcelik";
		obj2.sayi=20;
		obj2.method();
		
		//demekki ben istedigim class dan obje uretip oradaki public class uyelerine ulasabilirim
	}

}
