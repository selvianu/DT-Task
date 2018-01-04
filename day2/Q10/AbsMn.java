package day2.Q10;

public abstract class AbsMn {
	// Abstract class can have main method but we cannot create instance for Abstract class.
	
	public static void display(String name) {
		System.out.println("Welcome " + name);
	}

	public static void main(String[] args) {
//Abstract class is extended in other class and the static method including main is invoked 
		AbsManmethod.display("niit");
		//AbsManmethod.main(args);
	}

}
