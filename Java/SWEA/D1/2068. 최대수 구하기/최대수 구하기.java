import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int max = 0;
			for (int i = 0; i < 10; i++) {
				int a = sc.nextInt();
				if(a> max) {
					max = a;
				}
			}
			System.out.println("#"+t+" "+max);
		}
	}
}