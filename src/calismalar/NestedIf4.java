package calismalar;

import java.util.Scanner;

public class NestedIf4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen cinsiyetiniz Kadin ise 'K', Erkek ise 'E' giriniz");
		char cinsiyet = scan.next().toUpperCase().charAt(0);
		System.out.println("Lutfen yasinizi giriniz");
		int yas=scan.nextInt();
		
		if (cinsiyet=='E') {
			if (yas>18) {
				System.out.println("Adam");
			} else {
				System.out.println("Erkek cocuk");
			}
		} else if(cinsiyet=='K') {
			if (yas>18) {
				System.out.println("Kadin");
			} else {
				System.out.println("Kiz cocuk");
			}
		}else {
			System.out.println("Lutfen dogru degerleri girriniz");
		}
		
		scan.close();
	}

}
