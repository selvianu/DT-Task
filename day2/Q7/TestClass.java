package day2.Q7;

public class TestClass {

	public static void main(String[] args) {
		AbsDemo ad=new AbsDemo();// abstract class cannot be instantiated
		
		InterDemoImpl il=new InterDemoImpl();
		il.A();
		il.no=50; // variable initialized in interface is final can't be changed.
	}

}
