package day2.Q18;

class Test {
	int x = 10;

	Test(int y) {
		System.out.println("base class constructor");

	}
}

public class superDemo extends Test {

	superDemo(int y) {
		super(50);
		System.out.println("derived class constructor");
	}

	int x = 100;

	public void display() {
		System.out.println("Subclass x value: " + x);
		System.out.println("Super class x value: " + super.x); // using super keyword invokes super class variable x
	}

	public static void main(String args[]) {
		superDemo d1 = new superDemo(50);
		d1.display();

	}
}
