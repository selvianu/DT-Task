package day2.Q1;

public abstract class Emp {
	int id;
	int age;

	Emp(int id, int age) {
		this.id = id;
		this.age = age;
	}

	public void displayAge(int age) {
		System.out.println("the age of the employee is: " + age);
	}

}
