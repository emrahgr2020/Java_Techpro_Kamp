
package day30_datetime;

import java.time.LocalDateTime;

public class C3_LocalDateTime {

	public static void main(String[] args) {
		//
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);//2021-03-19T22:05:14.130089100
		
		System.out.println(ldt.toString());//2021-03-19T22:06:31.817435400
		String time=ldt.toString();//degeri String e cevirir
		
		
	 
		System.out.println(time.startsWith("2021"));//true
		

	}

}
