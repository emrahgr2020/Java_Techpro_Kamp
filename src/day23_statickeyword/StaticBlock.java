package day23_statickeyword;

public class StaticBlock {

	
	static String isim;
	//static block class calistirildiginda ilk olarak calisir(main methoddan bile once calisir)
	//static block lar static blocklara deger atamak icin kullanilir
	static {
		isim="Mehmet";
		System.out.println(isim);
	}
	static {
		System.out.println("2. static block calisti");
	}
	
	public static void main(String[] args) {
		isim="Alican";
		System.out.println(isim);

	}

}
