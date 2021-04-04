package day42_abstractclasses;

public class IdariPersonel extends Personel {
	
	//extends Personel yazarak abstracte concrete bir child olusturdum
	//ve Java CTE verdi
	//cozum olarak urettigi 2 ihtimal var
	//1- Unimplament (uyarlanmamis) method lari uyarla
	//2- ya da Personel class indan abstract kelimesini kaldirir
	//bu class in calisabilmesi icin 2 sinden birini secmeliyiz

	public static void main(String[] args) {
		

	}

	@Override
	public void maasHesapla() {
		System.out.println("Idari personel maasi 4000 tl");
		
	}

	@Override
	public void mesaiBilgisi() {
		// TODO Auto-generated method stub
		
	}

}
