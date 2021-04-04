package day42_abstractclasses;

public class Isci extends Personel{

	public static void main(String[] args) {
		Isci isci1=new Isci();
		isci1.maasHesapla();//isciler icin maas 5000 tl
		isci1.mesaiBilgisi();//isciler gunluk 8 saat calisir
		isci1.isim="Pumeysa";//abstract parent class daki variable lari istersem kullanabilirim
		System.out.println(isci1.isim);//Pumeysa
		//System.out.println(isim);
		isci1.ozelSigorta();//abstract parent class daki concrete methodu istersem kullanirim
							//Bu personel ozel sigorta kapsamindadir
							//bu methodu override etmedik ama parent-child ilskisi ile kullanabildik
	}

	@Override
	public void maasHesapla() {
		// parent class daki abstract method u imlement (uyarlama) etti
		//1- sen abstract bir class i parent edindi isen mutlaka oradaki
		//abstract medhodu implement etmelisin
		//2- parent class daki methodda body olmadigi icin onu kullanmanin anlami yok
		//biz child class da body olan method (concrete) kullanip islem yapmaliyiz
		System.out.println("isciler icin maas 5000 tl");
		
	}

	@Override
	public void mesaiBilgisi() {
		System.out.println("isciler gunluk 8 saat calisir");
		
	}

}
