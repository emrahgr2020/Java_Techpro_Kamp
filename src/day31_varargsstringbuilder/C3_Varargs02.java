package day31_varargsstringbuilder;

public class C3_Varargs02 {

	public static void main(String[] args) {
		// Istedogimiz kadar sayi girdigimizde tum sayilari toplayan bir method yazalim
		//Var --- variety cesitlilik  args----argumants
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,6,8,10,2,-12);
		

	}

	public static void toplama(int... var) { //data turunden sonra  ... varags kullanacagimiz anlamina geliyor
		int toplam=0;
			
		for(int each : var) {
			toplam+=each;
		}
		System.out.println("toplam = " + toplam);
		
	}

}
