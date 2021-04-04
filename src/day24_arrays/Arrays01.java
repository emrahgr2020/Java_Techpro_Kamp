package day24_arrays;

import java.util.Arrays;

public class Arrays01 {
	public static void main(String[] args) {
		
		
		int sayi=10;
		int sayi2=20;
		int sayi3=30;
		String isim ="Ali";
		
		//Javada birden fazla elemani koyabileceginiz (store)objeler vardir
		//bu gun bunlardan ilkini ogrenecegiz
		
		int arr[]= {10,20,30};//int[] arr seklinde de kullanabilir
							  // BU ornekte Array in elemanlarini direk yazdigim icin 
							  // uzunluk belirtmeye ihtiyac kalmadi
							  // bu  kullanimda maksimum eleman sayisi (length) yazdigimiz eleman sayisidir
							  
		System.out.println(arr);//Array bir objedir
								//Eger direk Arrayi yazdirmak isterseniz Java ref i yazdirir
		
		System.out.println(Arrays.toString(arr));//[10, 20, 30]
		
		String takim[] = new String[5];// [null, null, null]
		System.out.println(Arrays.toString(takim));
		
		takim[0]="Ali";
		System.out.println(Arrays.toString(takim));// [Ali, null, null]
		takim[2]="Hasan";
		takim[1]="Veli";
		System.out.println(Arrays.toString(takim));// [Ali, Veli, Hasan]
		
		//takim[3]="Mehmet";//Java run time programdir, dolayisi ile array programi calistirinca 
							//olusturulur. 36. satirda syntax olarak hata olmadigindan CTE olmaz
							//Program calistiginda 3.index olmadigindan RTE verir
		
		//Array deki bir elemani update etme
		//veli nin yerine kemal gelsin
		takim[1]="Kemal";
		System.out.println(Arrays.toString(takim));// [Ali, Kemal, Hasan]
		
		//Bir array in uzunlugunu nasil bulabiliriz
		System.out.println(takim.length); //3
										//String deki length() idi Array de langth
		
		//Array deki son elemani Mehmet yapin
		
		takim[takim.length-1]="Mehmet";// En son olan i degistirecek her zaman 
		System.out.println(Arrays.toString(takim));
		
		//ortadaki elemani Can yapalim
		//Efer Arrayin eleman sayisi tek ise ortadaki elemani Can yapalim
		
		if (takim.length%2==1) {
			int ortaIndex = (takim.length-1)/2;//orta indexi bulmak icin
			takim [ortaIndex]="Can";
		}
		System.out.println(Arrays.toString(takim));
		
		
		
	}

}
