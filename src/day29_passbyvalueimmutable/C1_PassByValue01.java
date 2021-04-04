package day29_passbyvalueimmutable;

public class C1_PassByValue01 {

	public static void main(String[] args) {
		/*Soru : Verilen bir fiyat icin %10 indirim yapan bir method olusturun.
		  - Method’da indirim uygulanan fiyati yazdirin
		  - Method Call sonrasi original fiyati yazdirin ve method’da yapilan degisikligin  
		  orginal degeri degistirip degistirmedigini kontrol edin.
		*/
		
		
		
		double fiyat=100;
		
		indirimUygula(fiyat);//method call
		System.out.println("method call sonrasi fiyat : "+ fiyat);//100
		
		
		
	}

	public static void indirimUygula(double fiyat) {//klon fiyat geliyor buraya
		//method icinde olan method icinde kalir
		
		fiyat=fiyat*0.90;//buradaki fiyat klon oldugundan burada kalir sadece
		
		System.out.println("%10 indirimli fiyat : "+fiyat*0.90);//81
		System.out.println(fiyat-10);//80
		
	}

}
