package toDoTask;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string to check whether it is palindrome or not");
		String str = s.nextLine();
		String revstring = "";

		for (int i = str.length() - 1; i >= 0; --i) {
			revstring += str.charAt(i);
		}
		// System.out.println(revstring);

		if (revstring.equalsIgnoreCase(str)) {
			System.out.println(revstring + " The string is Palindrome");
		} else {
			System.out.println(revstring + " Its Not a Palindrome");
		}
	}

}
