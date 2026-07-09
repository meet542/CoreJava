package in.co.rays;

public class Armstrong {

	public static void main(String args[]) {

		String num = "153";
		int len = num.length();
		int number = Integer.parseInt(num);
		int temp = number;
		int rem;
		int sum = 0;

		while (temp > 0) {

			rem = temp % 10;

			sum += (int) Math.pow(rem, len);

			temp /= 10;

		}

		if (number == sum) {
			System.out.println("Armstrong");
		} else {
			System.out.println("not Armstrong");
		}
	}

}
