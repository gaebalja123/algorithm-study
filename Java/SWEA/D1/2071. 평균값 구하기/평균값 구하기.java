import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int sum = 0;
			int avg = 0;
			for (int i = 0; i < 10; i++) {
				
				sum +=sc.nextInt();
				
				avg = (int) Math.round(sum / (double) 10);
			}
			System.out.println("#"+t+" "+avg);
		}
	
		
	}
}