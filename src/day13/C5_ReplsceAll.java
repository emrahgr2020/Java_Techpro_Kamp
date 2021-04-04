package day13;

public class C5_ReplsceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Java ogren, mutlu ol,Java candir 12345";
		
		System.out.println(str.replace("Java", "Hava"));

		//replaceAll() methodu replace () medhoduna benzer ama 2 farki var
		//1- replace methodu char kabul eder replaceAll kabul etmez
		//replaceAll() methodu regexp kullanimina izin vereir
		
		System.out.println(str.replaceAll("\\w", "*")); //tum harf ve rakamlar yeine * yazacak
		System.out.println(str.replaceAll("\\W", "*")); //w nun tersi
		System.out.println(str.replaceAll("\\d", ".")); //sayilari . yapar
		System.out.println(str.replaceAll("\\D", "."));//d nin tersi
		System.out.println(str.replaceAll("\\s", "&"));//bosluklari degistirir
		System.out.println(str.replaceAll("\\S", "&"));//s nin tersi
		
	}

}
