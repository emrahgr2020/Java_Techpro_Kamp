package day31_varargsstringbuilder;

public class C6_StringBuilder01 {

	public static void main(String[] args) {
		StringBuilder sb1= new StringBuilder();//bos bir SB olusturur
		System.out.println("sb1 " + sb1);
		
		StringBuilder sb2=new StringBuilder("Mehmet");//icinde mehmet degeri olan bir string builder olusturur
		System.out.println("sb2 " + sb2);
		
		StringBuilder sb3=new StringBuilder(10);//10 kapasitesi olan bir sb uretir
		System.out.println("sb3 " + sb3);
		
		sb1.append(" Hoca");
		System.out.println("sb1 append:  " + sb1);// Hoca
		
		sb2.append(" Hoca");
		System.out.println("sb2 append:  " + sb2);//Mehmet Hoca
		
		sb3.append(" Hoca");
		System.out.println("sb3 append:  " + sb3);//Hoca
		
		
		System.out.println("sb1 uzunluk "+sb1.length());//5 " Hoca"
		System.out.println("sb1 kapasite"+sb1.capacity());//16 bir deger yazmadigimiz icin default deger verlir
		
		System.out.println("sb2 uzunluk "+sb2.length());//11 Mehmet Hoca
		System.out.println("sb2 kapasite"+sb2.capacity());//22 basta biz 6 olusturduk 16 da default verdi
		
		System.out.println("sb3 uzunluk "+sb3.length());//5 " Hoca"
		System.out.println("sb3 kapasite"+sb3.capacity());//10
		//capacity  hafiza yonetimi icin onemli
		//kod yazilirken sabit uzunluk veya makx uzunluk belli ise 3. method ile olusturarak HAFIZA KULLnimini optimize edebiliriz
		
		
		
		
		
	}

}
