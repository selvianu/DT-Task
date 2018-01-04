package day2.Q11;

public class DemoStatiC {

	static String name;
	static {
		// static block is executed only once:
		// the first time when we create the object of that class or the first time you
		// access a static member of that class
		name = "NIIT";
		name2 = "Chennai";

		System.out.println("Demo for Static Block");
	}
	static String name2;

	public static void main(String args[]) {

		System.out.println(name);
		System.out.println(name2);
	}
}
		