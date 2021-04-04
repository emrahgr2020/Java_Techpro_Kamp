package calismalar;

public class StringDemo1 {

	public static void main(String[] args) {
	
		String mesaj = "Bugun hava cok guzel 123 -?";
		System.out.println(mesaj);
		
		/*
		 * System.out.println(mesaj.length());
		 * System.out.println(mesaj.concat(" Yasasin!"));//birlestirmek
		 * System.out.println(mesaj.startsWith("b"));
		 * 
		 * char[]karakterler=new char[5]; mesaj.getChars(0, 5, karakterler, 0);
		 * System.out.println(karakterler); System.out.println(mesaj.endsWith("?"));
		 * System.out.println(mesaj.charAt(4)); System.out.println(mesaj.replace(' ',
		 * '-')); System.out.println(mesaj.replaceAll("\\s", "*"));// \\w, \\W, \\s,
		 * \\S, \\d, \\D System.out.println(mesaj.substring(2,5));
		 * System.out.println(mesaj.indexOf("a"));
		 * System.out.println(mesaj.lastIndexOf("a"));
		 */
		
		System.out.println(mesaj.replace("Bugun", "??"));
		System.out.println(mesaj.replace("a", "A"));
		
		for(String kelime :mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
	System.out.println(mesaj.toLowerCase());
	System.out.println(mesaj.toUpperCase());
	//System.out.println(mesaj.trim());
		

	}

}
