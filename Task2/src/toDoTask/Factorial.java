package toDoTask;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		System.out.println("Enter the numebr");

		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		int facNumber = 1;
		for (int i = 1; i < number; i++) {
			facNumber = facNumber * (i + 1);
		}
		System.out.println("factorial of " + number + " is: " + facNumber);
	}

}
