package day12_stringmanupalation;

public class C2_EqualseIgnoreCase {

	public static void main(String[] args) {
		// equalseIgnoreCase() methos'u karsilastirdigi stringlere
		//case sensitive(byuyk kucuk harf duarliligi) olmaksizin bakar.
		//Stringler ayni ise true, ayni degilse false doner
		
		
		String str1= "Ali Can";
		String str2="ali CAN";
		System.out.println(str1.equals(str2)); //false
		System.out.println(str1.equalsIgnoreCase(str2));//true
		
		

	}

}
