package calismalar;

import java.util.Scanner;

public class DaireninAlanHacimHesabi {

	public static void main(String[] args) {
		int r;
		double alan, hacim, pi=3.14;
		
		Scanner scan =new Scanner(System.in);
		System.out.print("Dairenin yaricapini giriniz: ");
		r=scan.nextInt();
		alan=2*pi*r;
		hacim=pi*(r*r);
		System.out.println("Dairenin alani : " + alan);
		System.out.println("Dairenin hacmi : " + hacim);
		
scan.close();
	}

}
