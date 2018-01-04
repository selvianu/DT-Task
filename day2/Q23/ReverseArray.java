package day2.Q23;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String args[]) {
		int[] my_array1 = { 52, 85, 0, 59, 23, 10, 100, 192 };
		System.out.println("Original array : " + Arrays.toString(my_array1));
		for (int i = 0; i < my_array1.length / 2; i++) {
			int temp = my_array1[i];
			my_array1[i] = my_array1[my_array1.length - i - 1];
			my_array1[my_array1.length - i - 1] = temp;
		}
		System.out.println("Reverse array : " + Arrays.toString(my_array1));
	}
}
