package toDoTask;

public class FibSeries {
	public static long fib(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {

			System.out.println(i + ": " + fib(i));
			if (fib(i) > 200) {
				break;
			}
		}
	}

}
