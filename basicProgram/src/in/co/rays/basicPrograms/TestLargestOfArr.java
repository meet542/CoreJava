package in.co.rays.basicPrograms;

public class TestLargestOfArr {
	public static void main(String[] args) {
		int[] arr = { -1, 20, 46, -32, 72, 89, 49, 0, 55 };
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
