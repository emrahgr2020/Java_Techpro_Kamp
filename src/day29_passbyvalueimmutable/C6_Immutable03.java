package day29_passbyvalueimmutable;

public class C6_Immutable03 {

	public static void main(String[] args) {
		// Atama yaildiginda ne olur

		String isim = "";
		for (int i = 0; i < 10; i++) {
			isim += i;
			System.out.println(isim);
		}
		System.out.println("===============");
		System.out.println(isim);
	}

}
