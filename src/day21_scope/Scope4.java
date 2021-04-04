package day21_scope;

public class Scope4 {

	public static void main(String[] args) {


		for (int i = 0; i < 5; i++) {
			String isim = "Ayse";
			System.out.println(i+" "+ isim);
		}

		//System.out.println(isim);// loop icinde olusturulan variableler loop a ozeldir 
		//ve loop disinda kullanilmaz 
		for (int i = 0; i < 5; i++) {
			System.out.print(i+" ");
		}
		//System.out.println(i);
		
		int count=0;// methoda ait local variabledir
					//deger atamadan kullanmaya calisirsaniz CTE alirsiniz
		while(count<5) {
			System.out.println(count);
			count++;
			
			
		}
	}

}
