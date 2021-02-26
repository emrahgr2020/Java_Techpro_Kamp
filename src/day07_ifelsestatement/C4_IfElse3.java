package day07_ifelsestatement;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		// kulanicidan yasini isteyin
		//65 den buyuk ise "emekli olabilirsin" yoksa "emekli olamazsin" yazdirin

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen yasinizi giriniz");
		
		int yas=scan.nextInt();
		
		if (yas>=65) {
			System.out.println("Tebrikler Emekliligi hakettiniz artik olebilirsiniz");
		} else {
			System.out.println("Yazik size daha cook calismaniz lazim emeklilik icin");
		}
		scan.close();
	}

}
