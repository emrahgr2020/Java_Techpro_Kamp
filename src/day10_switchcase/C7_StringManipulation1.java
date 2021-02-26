package day10_switchcase;

public class C7_StringManipulation1 {
				//stringi degistirme

	public static void main(String[] args) {
		// String non-primitive data turlerindendir
		//non p data turleri value ile birlikte methodlara sahiptirler
		//methotlari kullanarak String i degistirmeye String manipulation 
		
		String str="Hello Word";

		System.out.println(str.toUpperCase());//HELLO WORLD
		
		System.out.println(str);//Hello World
		
		
		String str2=str.toUpperCase();
		System.out.println(str2);//Hello World
	}

}
