package day18_whileLoop;

import java.util.Scanner;

public class C5_WhileLoop5 {

	public static void main(String[] args) {
		// Soru 6 ) Kullanicidan bir poziitf tam sayi alin ve bu sayiyi tam bolen
		// sayilari ve toplam kac tane olduklarini ekranda yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bolenleri bulmak icin pozitif bir tam sayi giriniz");
		int sayi=scan.nextInt();

		int bolen=1;
		int count=0;
		
		while (bolen<=sayi) {
			
			if(sayi%bolen==0) {
				count++;//boldukce arttir
				System.out.println(bolen);
				
				
			}
			bolen++;
			
			
		}
		System.out.println(sayi+"sayisinin bolenleri: "+count +" adettir");
		
		//bolenleri su sekilde yazdirin
		
		//1- 1
		//2- 2
		//4- 3
		//5- 4
		
		bolen=1;
		count=0;
		
		while (bolen<=sayi) {
			
			if(sayi%bolen==0) {
				count++;//boldukce arttir
				System.out.println(count+"- "+ bolen);
				
				
			}
			bolen++;
			
			
		}
		
		scan.close();
	}

}
