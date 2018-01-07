package toDoTask;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("def");
		al.add("hge");
		System.out.println("Generics - String");
		for (String s1 : al) {
			System.out.println(s1);

		}
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(123);
		al1.add(456);
		System.out.println("Generics - Integer");
		for (Integer i1 : al1) {
			System.out.println(i1);

		}

		ArrayList<Float> al2 = new ArrayList<>();
		al2.add(123.25f);
		al2.add(89.20f);
		al2.add(15.2f);
		System.out.println("Generics - Float");
		for (Float f1 : al2) {
			System.out.println(f1);

		}

	}

}
