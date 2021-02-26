package day04;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		//modulus operatoru bolme isleminde kalanı veriri
		
		
		//15 tek mi cift mi? 15/2 kalan=1 tek 
		//25 3 e bolunur mu? 25/3 kalan=1 
		//herhangi bir sayinin 7 ile bolunebildigini kontrol etmek icin 
		//modulus islemini kullaniriz
		
		int kalan = 15 % 4;
		System.out.println(kalan); //3
		
		System.out.println(26 % 8); //2
		
		//856 sayisini birler basamagi kacitir? 6
		
		int sayi=856;
		int birlerBasamagi= sayi % 10 ;
		System.out.println("Sayinin birler basamagi : " + birlerBasamagi);

		//856 sayisinin 10 lar basamagi kactir
		//bunun icin birler basamagindan kurtulmak lazim
		//birler basamagindan kurtulmak icin ise sayiyi 10'a bolecegiz
		
		
		sayi/=10; //85
		System.out.println("on'a bolundukten sonra sayinin degeri : " + sayi);
		
		int onlarBasamagi = sayi % 10;
		
		System.out.println("Onlar Basamagi :" + onlarBasamagi);
		
		//yuzler basamagini bulmak icin bir kere daha ayni islemi yapiyorum
		sayi /=10;//bu satirla onlar basamagindan da kurtulurum
		
		System.out.println("2.defa 10'a boldukten sonra " + sayi);
		
		
		
		
		
		
	}

}
