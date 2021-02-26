package day11_stringmanipulations;

public class C1_Concatenation {

	public static void main(String[] args) {
		// Concatenation : java da + islemi yapilirken eger toplanan ifadelerdenbiri veya
		//her ikisi String ise java toplama degil BIRLESTIRME yapar
		
		
		System.out.println(15+20 + "Merhaba");//35Merhaba

		System.out.println("Merhaba" + 15 + 20);//Merhaba1520
		System.out.println("Merhaba"+ (15+20));//Merhaba35
		System.out.println("Merhaba" + 15*20);//Merhaba300
		
		
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println(str1+" "+ str2);//Hello World
		
		System.out.println(str1.concat(str2));//HalloWorld
		System.out.println(str1.concat(" ").concat(str2));
		System.out.println(str1.concat(" "+ str2));
	}

}
