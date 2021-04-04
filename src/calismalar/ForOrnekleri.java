package calismalar;

import java.util.Scanner;

public class ForOrnekleri {

	public static void main(String[] args) {
		// Asal sayi bulma
		
		Scanner scan=new Scanner(System.in);
		
		int input;
		boolean asal=true;
		do {
			System.out.println("Lutfen pozitif bir tam sayi giriniz");
			input=scan.nextInt();
		}while(input<2);
		
		for (int i = 2; i < input; i++) {
			if(input%i==0) {
				asal=false;
				break;
			}
		}
		if(asal) {//true ise asal=true
			System.out.println("Girilen sayi: "+ input+ " asaldir.");
		}else {//asal=false
			System.out.println("Girilen sayi: "+ input+ " asal degildir.");
		}
		
scan.close();
	}

}
