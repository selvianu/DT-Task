package day2.Q17;

public class Exenum {

	public enum dept {
		CSE, ECE, IT, Mech, EI, EEE
	}

	public static void main(String[] args) {

		for (dept d : dept.values()) {
			System.out.println(d);
		}
	}

}
