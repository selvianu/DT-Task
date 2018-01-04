package day2.Q14;

public class superEx1 extends superEx {
	public static void show() {
		System.out.println("show overide");
	}

	public void display() {
		System.out.println("display override");
	}

	public static void main(String[] args) {
		superEx s = new superEx();
		superEx1 s1 = new superEx1();
		superEx2 s2 = new superEx2();

		s.display();
		superEx.show();
		superEx1.show();
		s1.display();
		superEx2.show();//child class extending super class static method
		s2.display();//child class object invoking non static method of super class.
		

	}
}
