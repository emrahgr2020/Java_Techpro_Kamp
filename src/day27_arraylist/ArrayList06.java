package day27_arraylist;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayList06 {

	public static void main(String[] args) {
		//Verilen listeyi Arraye nasil cevirilir
		
		
		List<String> list=new ArrayList<>();

		
		list.add("Ali");
		list.add("Veli");
		String arr[]=list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
	}

}
