package toDoTask;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueue {

	public static void main(String[] args) {
		Deque d1 = new ArrayDeque<String>();
		d1.add("chennai");
		d1.add("Delhi");
		d1.add("Mumbai");

		for (Object object : d1) {
			System.out.println(object);
		}

	}

}
