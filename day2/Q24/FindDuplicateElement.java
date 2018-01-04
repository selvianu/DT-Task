package day2.Q24;

public class FindDuplicateElement {
	public static void main(String args[])

	{
		int[] my_array = { 158, 45, 96, 45, 0, 26,26 };

		for (int i = 0; i < my_array.length - 1; i++) {
			for (int j = i + 1; j < my_array.length; j++) {
				if ((my_array[i] == my_array[j]) && (i != j)) {
					System.out.println("Duplicate Element : " + my_array[j]);
				}
			}
		}
	}

}
