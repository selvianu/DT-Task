package toDoTask;

public class CompareArray {

	public static void main(String[] args) {

		int arr1[] = { 23, 85, 26, 10 };
		int arr2[] = { 2, 85, 0 ,4,6,5,1};
		if (arr1.length > arr2.length) {
			for (int i = 0; i < arr1.length; i++)
				System.out.println(arr1[i]);
		} else {
			for (int i = 0; i < arr2.length; i++)
				System.out.println(arr2[i]);

		}
	}

}
