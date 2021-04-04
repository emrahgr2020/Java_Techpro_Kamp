package day13;

class C3_StartsWithIsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="Her gun Java olsa";
		System.out.println(str.startsWith("H"));// true
		
		System.out.println(str.startsWith("Her ")); //true
		
		System.out.println(str.startsWith("g", 4)); //true
		
		System.out.println(str.startsWith("Java", 7));//false
		
		System.out.println(str.isEmpty());//false   bos mu?
		
		String str2="";
		System.out.println(str2.isEmpty());//true
		
		//String str3 =null; //null bir deger degildir
		
		//System.out.println(str3.isEmpty()); //RTE
				
		
		
	}

}
