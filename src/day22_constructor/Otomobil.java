package day22_constructor;

public class Otomobil {

	public Otomobil(String renk){ //istersek constracter i parametreli olarak olusturabiliriz
		
	}
	
	//biz bir constracter olusturdugumuzda Java default u yok eder
	//dolasiyla biz bir constracter olusturdugumuzda mutlaka
	//default counstracter in yerine de bir counstracter yazmaliyiz
	
	public Otomobil() { //default constracter in yerine bunu yazmaliyiz
		
	}
	//ONEMLI NOT : Default constracter disinda baska bir constracter yazdiginda 
	//java defaultu yok ettigi icin MUTLAKA biz default yerine de constracter yazmaliyiz
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;

	public void yakit(String yakit) { // method
		System.out.println("Araba yakit olarak " + yakit + " kullanir");
	}

	public void vites(String vites) { // method
		System.out.println("Araba " + vites + " viteslidir");
	}

}
