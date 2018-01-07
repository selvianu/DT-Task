package toDoTask;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = { 56, 25, 10, 89, 30 };
		for (int i : arr) {
			System.out.println("the original array is :" + i);
		}
		int arr1 = 0;
		Arrays.copyOf(arr, arr1);
		for (int i : arr) {
			System.out.println("the copy array is :" + i);
		}

	}

}
