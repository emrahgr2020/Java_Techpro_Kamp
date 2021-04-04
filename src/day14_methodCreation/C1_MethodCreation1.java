package day14_methodCreation;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
		
		
		String str="Java cok guzel";
		//1--Java methodlarin sadece ismine degil, isim + paremetre lere bakar
		//sadece parametre sayisi degil parametre lerin data tiplerine de bakar
		
		str.endsWith("el"); //bu medhodun gorevi gidip kelimenin son kismini kontrol etmek
							//bu medhodu kullanmak icin bu medhodun kontrol ettikten 
		                    // sonra bana rapor olarak ne getirdigini bilmem lazim (true/false)
		
		//2-- Bir medhod olusturdugumuzda medhod un ne yapacagima ve 
		//gorevi yaptiktan sonra bana ne dondurecegine bastan karar vermeliyiz
		
		//3-- Bir medhod olusturulurken "str.indexOf(String str, int fromIndex)" de oldugu gibi 
		//disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
		//deklare etmeliyiz
		
		// Medhodu calistirmak istedigimde (Medhod u cagirmak )parametre olarak 
		// declare edilen data tiplerine uygun degerler girmeliyiz
		// girilen bu degerlere ARGUMENT denir
		
		str.indexOf("va", 1); // 
		
	}

}
