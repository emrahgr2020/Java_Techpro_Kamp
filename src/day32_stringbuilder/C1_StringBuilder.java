package day32_stringbuilder;

public class C1_StringBuilder {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Rumeysa");
		System.out.println(sb1);// Rumeysa

		sb1.append(" ").append("Cetinturk");// verilen SB in sonuna istedigimiz String degerini ekler
		System.out.println(sb1);// Rumeysa Cetinturk
		
		sb1.append("Javayi cok sever", 6, 10);//6 dan baslar 10 a kadar 10 dahil degil
				//Baska bir String den istedigimiz bolumu SB in sonuna ekler
		System.out.println(sb1);//Rumeysa Cetinturk cok

		System.out.println(sb1.length());//21 uzunluk bilgisini verir
		System.out.println(sb1.capacity());//23 (7+16) kapasite bilgisini verir
		
		
		System.out.println(sb1.charAt(1));//u  SB in istedigimiz index de olan karekter bilgisini verir
		
		sb1.charAt(5);//Bize bilgi getiren methodlar SB i degistirmez
		System.out.println(sb1);//Rumeysa Cetinturk cok
		
		sb1.delete(17, 21);//SB in istedigimiz index leri arasindaki kismini siler
		System.out.println(sb1);//Rumeysa Cetinturk
		
		sb1.deleteCharAt(16);//SB in istedigimiz karekterini siler
		System.out.println(sb1);//Rumeysa Cetintur
		
		String isim="Rumeysa Cetintur";
		
		System.out.println(sb1.equals(isim));// data turleri farkli oldugu icin icerigin kiyaslanmasi mumkun degil
											//False
		StringBuilder sb2= new StringBuilder("Rumeysa Cetintur");
		System.out.println(sb1 == sb2);// false
		System.out.println(sb1.equals(sb2));//false SB da equels methodu string den farkli calisir
											//ancak ayni obje ile kiyaslandiginda true verir
											//String deki == gibi calisir
		
		System.out.println(sb1.indexOf("Cetin"));//8
		System.out.println(sb1.indexOf("e", 6));//6 dan sonra olan 'e'  yani 9
		
		System.out.println(sb1.indexOf("Kazim"));//yoksa -1
		
		sb1.insert(7, " ");//istedigimiz index den itibaren istenilenStringi eklememizi saglar
		System.out.println(sb1);//Rumeysa  Cetintur  bosluk 2 oldu
		
		String cumle="Merhaba dunya";
		
		
		sb1.insert(0, cumle, 0, 8); // sb1.insert(0, null, 0, 0)
									// 0: SB a hangi index den itibaren eklenecek 
									// cumle: hangi String den eklenecek
									// 0: cumle nin hangi index inden baslanacak
									// 8: bitis index i 
		
		System.out.println(sb1);//Merhaba Rumeysa  Cetintur
		
		
		System.out.println(sb1.lastIndexOf("t"));//22 t ni en son kullanildigi index
		
		System.out.println(sb1.lastIndexOf("a", 22));//14  istenilen index in oncesine bakar
		
		sb1.replace(8, 16, "Seher");//SB in baslangic ve bitis index leri arasindaki kismi
									//verilen String ile degistirir
		System.out.println(sb1);//Merhaba Seher Cetintur
		
		
		sb1.reverse();
		System.out.println(sb1);//rutniteC reheS abahreM ters cevirme
		
		sb1.reverse();
		
		sb1.setCharAt(10, 'k');
		System.out.println(sb1);//Merhaba Seker Cetintur
		
		System.out.println(sb1.subSequence(8, 13));//Seker SB in istedigimiz bolumunu verir
		
		System.out.println(sb1.substring(8));//Seker Cetintur
											//baslangic index inden sonuna kadar
		
		StringBuilder sb3=new StringBuilder("Java cok guzel");
		StringBuilder sb4=new StringBuilder("Java cok guzel");
		
		System.out.println(sb3.equals(sb4));//false
		//iceriklerinin esit olup olmadigina bakmak icin String deki equels methodu nu kullanalim
		
		sb3.toString().equals(sb4.toString());//true Stringe cevirdik
		
		
		System.out.println(sb3.toString().concat(" Insanin sevdikce sevesi geliyor"));//Java cok guzel Insanin sevdikce sevesi geliyor
		
		
		System.out.println(sb1.length()); //22
		System.out.println(sb1.capacity());//48
		
		sb1.trimToSize();//SB icin hazirlanan fazlaliklari siler
						//lengt ile capasity i esit hale getirir
		System.out.println(sb1.length()); //22
		System.out.println(sb1.capacity());//22
		
		
		System.out.println(sb3.compareTo(sb4));//tum karekterlerinin esitligini kontreol eder 0 ise esit
	}

}
