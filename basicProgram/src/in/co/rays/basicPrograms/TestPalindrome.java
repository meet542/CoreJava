package in.co.rays.basicPrograms;

public class TestPalindrome {

	public static void main(String[] args) {

		int number = 123321;
		int temp = number;
		int rem;
		int rev = 0;

		while (number > 0) {
			rem = number % 10;

			rev = (10 * rev) + rem;

			number /= 10;
		}

		if (temp == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not Palindrome");
		}

	}

}
