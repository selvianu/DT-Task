package toDoTask;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		String input = s.nextLine();
		;
		char[] c = input.toCharArray();

		for (int i = c.length - 1; i >= 0; i--)
			System.out.print(c[i]);
	}

}
