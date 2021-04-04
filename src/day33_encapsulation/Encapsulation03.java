package day33_encapsulation;

public class Encapsulation03 {

	public static void main(String[] args) {
		// Encapsulation02 clasindAKIclass member a ulasmaya calisalim
		//

		Encapsulation02 obj1=new Encapsulation02();
		Encapsulation02 obj2=new Encapsulation02();
		
		//Biz erisim yetkisini ikiye ayiriyoruz
		//1- okuyabilme
		//2- degistirip kullanabilme
		
		System.out.println(obj1.sayi);//
		obj1.sayi=25;
		System.out.println(obj1.sayi);//25
		
		System.out.println(obj2.sayi);//100
		
		obj1.setTcNo("98765432");
		//System.out.println(obj1.setTcNo("11111222");); set () methodu olkumaya izin vermez
		
		
		System.out.println(obj1.getOkulIsmi());//Yildiz Koleji
		
		obj1.setHesapNo(546789);
		// Bir Calss içinde class member oluşturuken bunu diğer class lar ile
		// ne oranda paylaşacağımıza karar veririz
		// 1- Herkes okuyabilsin ve obje üzerinden değer atayıp kullanbilsin ==> public
		// 2 - Herkes okuyabilsin ama kimse obje izerinden de olsa değiştiremesin Private ==> Public get();
		// 3 - İlk atadığım değeri kimse goremesin Private ==> Public set ()
		
	}

}
