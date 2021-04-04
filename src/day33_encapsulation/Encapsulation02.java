package day33_encapsulation;

public class Encapsulation02 {
	private String okulIsmi = "Yildiz Koleji";
	//Okul ismi baska class lardan okunmasini ama deger atanamamasini istiyorsak 
	//getter() methodu olusturuyoruz
	private String tcNo="12345678901";
	private int hesapNo=5554321;
	
	//Obje olusturarak deger atanip kullanilmasini istedigimiz ama 
	//ilk atadigimiz degerin gorunmemesini istiyorsak  setter()
	//methodu kullaniriz
	public int sayi=100;
	
	
	public static void main(String[] args) {
		//eger ulasmak istedigim class uyeleri (class member) public
		//degil ise baska package lerden ulasmak 
		//icin ekstra islem yapmak gerekir

		//Yapabilecegimiz islemlerden 1. Encapsulation(Data saklama)
		//bu class da kimse ile paylasmak istemedigimiz variable ve methodlar olusturalim
		
		//Private yapinca guvenlik konusunu halletmis olduk an
		//Ancak class uyelerinin private olmasi OOP konsepte aykiri
		//Encapsulation class imizda olusturdugumuz class uyelerine 
		//kimlerin ne oranda ulasabilecegini bellirlemek icin yaoilir
		
	}


	public String getOkulIsmi() {
		return okulIsmi;
	}


	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}


	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
	}

	
}
