package day2.Q13;

public class StaticOverloadEx {
	public static void A() {
		System.out.println("Method A");
	}

	public static void A(String name) {
		System.out.println("Method A overloaded");
	}

	public static void main(String[] args) {

		StaticOverloadEx.A();
		StaticOverloadEx.A("niit");
	}

}
