package in.co.rays.basicPrograms;

public class TestBinarySearch {
	public static void main(String[] args) {
		int[] arr = { 7, 6, 5, 4, 3, 2, 1 };
		int target = 7;
		int left = 0, right = arr.length - 1;
		int mid;
		boolean present = false;

		while (left <= right) {
			mid = (left + right) / 2;

			if (arr[mid] == target) {
				System.out.println(mid);
				present = true;
				break;
			}

			else if (arr[mid] > target) {
				left = mid + 1;
			}

			else {
				right = mid - 1;
			}
		}
		
		if(!present) {
			System.out.println(-1);
		}
	}

}
