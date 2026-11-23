package october;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 1, 33, 56, 7, 4, 777, 353, 64 };
		System.out.println("Original array list : " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("sorted Arrays List: " + Arrays.toString(arr));
	}
}
