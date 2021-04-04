package day12_stringmanupalation;

public class C1_EqualsCiftEsittirFarki {

	public static void main(String[] args) {
		
		
		String str1 = "Ali Can";
		
		String str2 = str1 + "";//Ali Can
		System.out.println(str1 == str2);//hem stringe hem de adrese bakar
		
		System.out.println(str1.equals(str2));//sadece stringlere bakar
		
		
		
		
		String str3="Ali Can";
		System.out.println(str3==str1);
		System.out.println(str1.equals(str3));
	}

	
}
