package in.co.rays;

public class generateRandom {
	public static void main(String[] args) {
		
		int number;
		
		for(int i=1;i<=5;i++){
			number = (int)(Math.random() * 100) + 1;
			System.out.print(number + " ");
		}
	}
}
