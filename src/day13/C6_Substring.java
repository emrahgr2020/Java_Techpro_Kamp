package day13;

public class C6_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str= "Her ders Java gibi olsa";
		
		//str in ilk 10 harfini * ile gizlyin, geriye kalanlar normal yazilsin
		
		System.out.println(str.substring(10));//10. index dahil (inclusive) sonuna kadar tum string
		
		System.out.println(str.substring(str.length()-10));//son 10 harfi yazdirin
		
		//ilk 10 karakteri almak
		System.out.println(str.substring(0, 10)); //substring(0, 10) yazildiginda 0 inclusive, 10 exclusive
												 // 0 dahil 10. dahil degil
		
		
		//11. karakterden sonuna kadar olan Stringi yazdirma
		
		
		System.out.println(str.substring(10));
		//str in ilk 10 harfini * ile gizlyin, geriye kalanlar normal yazilsin
		
		System.out.println("**********" + str.substring(10));
		
		System.out.println(str.substring(0, 10).replaceAll("\\D", "*")+str.substring(10));
		
		System.out.println(str.substring(10, 10)); // ""   baslangic index i olsun der ama bitis index i
													// olmasin der java son soyleneni yapar
		
		//System.out.println(str.substring(8, 7));//RTE
		
		System.out.println(str.substring(22));//length ()-1 ->son karekteri verir
		System.out.println(str.substring(23));//length()  -> bos
		//System.out.println(str.substring(24));//length den buyuk sayi yazarsak RTE
		
		//str in ilk 10 harfini * ile gizlyin, geriye kalanlar normal yazilsin
		
		String str3 = str.substring(0, 10);//str nin ilk 10 harfini aldik
		
		str3=str3.replaceAll("\\W", "a");
		System.out.println(str3);
		System.out.println(str3.replaceAll("\\w", "*")+str.substring(10));
		
	}

}
