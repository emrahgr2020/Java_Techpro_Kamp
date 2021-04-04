package day18_whileLoop;

public class C6_WhileLoop6 {
	public static void main(String[] args) {

		//verilen sayinin asal olup olmadigini bulan bir program yazin
		//asal sayi : 1 ve kendisinden baska boleni olmayan 
		
		
		
		int sayi=23;
		
		String flag="Asal";//flag = bayrak bizim istedigimiz sartin gerceklesip gerceklesmedigini kontrol eder
		
		int bolen=2;
		
		while (bolen<sayi) {
			
			if(sayi%bolen==0) {
			flag="Asal sayi degildir";
			
			}
			bolen++;
		}
		
		System.out.println(flag);
		
	}
}
