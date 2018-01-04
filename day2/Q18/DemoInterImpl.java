package day2.Q18;

import java.util.Scanner;

public class DemoInterImpl implements DemoInter {

	Scanner sc = new Scanner(System.in);
	String name;

	@Override
	public void get() {
		System.out.println("Enter student name");
		name = sc.nextLine();
	}

	@Override
	public void display() {
		System.out.println("student name is: " + name);
	}

	public static void main(String[] args) {
		DemoInterImpl d = new DemoInterImpl();
		d.get();
		d.display();
	}

}
