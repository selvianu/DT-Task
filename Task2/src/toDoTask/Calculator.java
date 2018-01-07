package toDoTask;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		char option = '+';
		Scanner s = new Scanner(System.in);
		System.out.println("enter ur option");
		option = s.next().charAt(0);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3;
		switch (option) {
		case '+': {
			num3 = num1 + num2;
			System.out.println("the sum of the given values :" + num3);
			break;
		}
		case '-': {
			num3 = num2 - num1;
			System.out.println("the difference of the given values :" + num3);
			break;
		}
		case '*': {
			num3 = num1 * num2;
			System.out.println("the product of the given values :" + num3);
			break;
		}
		case '/': {
			num3 = num2 / num1;
			System.out.println("the sum of the given values :" + num3);
			break;
		}
		}

	}

}
