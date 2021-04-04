package day34_Inheritance;

public class Muhasebe extends Personel {

	//Muhasebe class inin personel classinin child class i oldugunu
	//declare etmek icin class ismine extends keyword ile 
	//perent class i yazariz
	
	public int saatUcreti;
	public String statu;
	public int maas;
	
	
	
	public int maasHesapla() {
		
		maas=30*8*saatUcreti;
		return maas;
	}
	
	
}
