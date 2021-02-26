package day08_ifelseif;

public class C2_NestedIf {

	public static void main(String[] args) {
		// verilen cinsiyet ve yas icin kisinin emekli olup olamaycagini
		// yazan java programi yaziniz
		//Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
		 //calisan erkekse 65 yasindan buyukse emekli olabilir.

		//Nested : ic ice
		
		String cinsiyet= "Kadin";
		int yas=70;
		
//		if (yas<0) {
//			System.out.println("yas negatif olamaz");
//		}else if (cinsiyet.equalsIgnoreCase("erkek") && yas>=65) {
//			System.out.println("Emekli olabilirsin");
//		}else if(cinsiyet.equalsIgnoreCase("erkek") && yas<65) {
//			System.out.println("Emekli olamazsiniz");
//		}else if(cinsiyet.equalsIgnoreCase("kadin") && yas>=60) {
//			System.out.println("Emekli olabilirsiniz");
//		}else if(cinsiyet.equalsIgnoreCase("kadin")&& yas<60) {
//			System.out.println("Emekli olamazsiniz");
//		}
//		
		
		
		System.out.println("Nested if ile sonuc");
		
		if (cinsiyet.equalsIgnoreCase("erkek")) {
			
			if(yas<0) {
				System.out.println("yas negatif olamaz");
			}else if (yas<60) {
				System.out.println("Emekli olamazsiniz");
			} else {
				System.out.println("Emekli olabilirsiniz");	
			}
			
		} else if(cinsiyet.equalsIgnoreCase("kadin")){
			
			if (yas<0) {
				System.out.println("yas 0 dan kucuk olamaz");
			} else if(yas<60){
				System.out.println("Bu yastaki kadin emekli olamaz");	
			}else {
				System.out.println("Bu kadin emekli olabilir");
			}

		}else {
			System.out.println("sistemde kayit bulunamdi");
		}
		
	}
	
	

}
