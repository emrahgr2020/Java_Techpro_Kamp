package day11_stringmanipulations;

public class C4_Equals {

	public static void main(String[] args) {
		// str.equals(str2) str ve str2 yi karsilastirir ve string olarak esit olup olmadiklarina
		//bakar sonuc olarak true veya false dondurur (sonuc)
		
		//bazi methodlarin yaptiklari islem ile dondurdukleri sonuc farkli olabilir
		//bir methoda git ali ismindeki elementi sil deriz;
		//o da gidip ali yi bulur ve siler
		

		
		String str = "Ali can";
		String str2 = "Ali can";
		
		//str ile str2 nin esit olup olmadigini yazdirin
		
		System.out.println(str.equals(str2) ? "Esit" : "Esit degil");
	}

}
