import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int tc = 1; tc<=10;tc++) {
			int T = sc.nextInt();
			int N = sc.nextInt();
			int M = sc.nextInt();
		
			int result = power(N,M);
			System.out.println("#"+tc+" "+result);
		}
		
	}
	
	
	static int power(int ground, int hat) {
		if(hat == 0)
			return 1;
		return ground * power(ground, hat-1);
	}
}