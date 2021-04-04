package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\winter2021turkish\\src\\day39_exceptions\\File");
		//try-catch blogu exception ile handel etmekte kullanilir
		//throw keyword u ise sadece declaration dir , dolayisi ile 
		//throw kullanilan bir method da exception olusursakod BLOKE OLUR
		
		int k=0;
        
        while((k=fis.read())!=-1) { 
            System.out.print((char)k);
        }
		
		//Eger birden fazla exception icin throw keyword u kullanacak isek
        //yazacagimiz exceptionlarin arasindaki iliski ve siralama onemli olur
        //eger yazdigimiz exception lar arasinda parent child iliskisi varsa 
        //once chald exception yazilmalidir, aksi taktirde child exe. erisilemez olur
        
        //Eger yazacaklarimiz arasinda Parent-Child iliskisi varsa istersek
        //sadece Parent'i yazmamiz da yeterli olur
        //
		
		
	}

}
