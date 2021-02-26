package day09_ternary;

public class C1_Ternary1 {

	public static void main(String[] args) {
		
		// ternary islemi bir sonuc dondurdugunden 
		//bir variable olusturup ona assign etmeliyiz
		int sayi= 101;
		String sonuc = sayi % 2 == 0 ? "cift sayi " : "tek sayi";
		System.out.println(sonuc);

		
		//ben bir variable 'a assing etmek istemez isem
		//syso icine yazabilirim
		
		System.out.println(sayi % 2 == 0 ? "cift sayi " : "tek sayi");
		
		//basina aciklama yazmak istersem 
		//ternary operatorunu paranteze almam gerekiyor
		System.out.println("islem sonucu : "+ (sayi % 2 == 0 ? "cift sayi " : "tek sayi"));
	}

}
