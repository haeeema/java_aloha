package Day02;

public class Ex14_WhileSum {
	public static void main(String[] args) {
		int sum = 0;
		int a = 1;
		
		while ( a <= 100) {
			sum += a++;
		}
		
		System.out.println(sum);
	}
}
