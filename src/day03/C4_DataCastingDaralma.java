package day03;

public class C4_DataCastingDaralma {

	public static void main(String[] args) {
		// double bir degisken ousturalım ve bunu int ve sonra byte a cevir
		
		double numDouble = 131.56;
		
		int numInt = (int)numDouble;
		
		System.out.println("integer degisken degeri : " + numInt);
		
		byte numByte = (byte)numInt;
		
		System.out.println("byte degisken degeri : " + numByte);

	}

}
