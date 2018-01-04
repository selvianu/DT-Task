package day2.Q20;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {

		numberSorting();

		stringSort();

	}

	public static void stringSort() {
		int n;
		String temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of names you want to enter:");
		n = s.nextInt();
		String names[] = new String[n];
		System.out.println("Enter all the names:");
		for (int i = 0; i < n; i++) {
			names[i] = s.nextLine();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (names[i].compareTo(names[j]) > 0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		System.out.print("Names in Sorted Order:");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(names[i] + ",");
		}
		System.out.print(names[n - 1]);
	}

	public static void numberSorting() {
		int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };

		Arrays.sort(arr);
		System.out.println("Sorted Number Array: ");
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
