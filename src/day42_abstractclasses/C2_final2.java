package day42_abstractclasses;

public class C2_final2 extends C1_final {

	public static void main(String[] args) {
		System.out.println(C1_final.SAYI);

		//static bir variabe okul ismi gibi herkes icin aynidir
		
		
		//C1_final.SAYI=20;
		//sayi variable i final olarak tanimlandigi icin degistirilemez
		
		C2_final2 obj1= new C2_final2();
		obj1.deneme();
		
	}
	public void deneme() {
		System.out.println("Child class'daki overriding method");
	}
/*
	public void deneme2() {
		//Cannot override the final method from C1_final
	}
	*/
	
	//final class yaptigimizda inherit edilemez
}
