package day11_stringmanipulations;

public class C2_CharAt {

	public static void main(String[] args) {
		// charAt(index) 
		//scan.next.charAt(0) //0. index deki karakteri verir
		//index sifirdan baslar
		
		
		String str = "Java cok guzel";
		
		System.out.println(str.charAt(0)); //J
		
		System.out.println(str.charAt(5));// c

		System.out.println(str.charAt(13));//l
		
		// kelimenin uzunlugu son index + 1 dir
		//son index kelimenin uzunlugu(length) - 1 dir
		
		
		//System.out.println(str.charAt(14));
	}

}
