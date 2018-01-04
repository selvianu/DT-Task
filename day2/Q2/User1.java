package day2.Q2;

public abstract class User1 implements User {

	@Override
	public abstract void A();

	@Override
	public void B() {
		System.out.println("method B Implemented in Non Abstract method");
	}

}
