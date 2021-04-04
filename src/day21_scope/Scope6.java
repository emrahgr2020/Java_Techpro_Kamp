package day21_scope;

public class Scope6 {
	public int num1;//access modifier public yapilinca her yerden ulasilabilir
	public String name = "Ali";//acces modifier yazilmadigi icin default acces modifier gecerlidir
						//sadece paket icinde kullanilabilir 
	public static void main(String args){ 
	  
		add();
	//product (5);
	}
	public static void add(){
	//num1 ++;//static olmayan(instance) num1 static bir method icinden kullanamaz
	int num2 = 6;
	char letter;
	System.out.println("Do addition ");
	}
	public void product(int num3){
	name = "Veli";
	//num2++;//ustteki methodda olusturulmus local variable dir
	System.out.println(num3 * num3);
	} 
	
}


