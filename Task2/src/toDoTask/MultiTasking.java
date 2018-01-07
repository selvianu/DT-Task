package toDoTask;

public class MultiTasking implements Runnable {
	public void run() {
		System.out.println("task one");
	}

	public static void main(String args[]) {
		MultiTasking t1 = new MultiTasking();

		MultiTasking1 t2 = new MultiTasking1();
		Thread t3 = new Thread(t1);

		t2.start();
		t3.start();
	}

}
