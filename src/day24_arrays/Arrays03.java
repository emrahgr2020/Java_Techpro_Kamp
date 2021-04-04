package day24_arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.

		int count = 0;
		int arr[] = {1,2,3,4,5,6};

		for (int i = 0; i < arr.length; i++) {
			count += arr[i];
		}
		System.out.println(count);
		
		//verilen arrayin tum elemanlarini toString methodu olmadan 
		//yan yana ve aralarinda bir bosluk olsun
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
