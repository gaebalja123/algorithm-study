import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int answer;
		
		for (int t = 1; t <= T; t++) {
			answer = 0;
			int N = sc.nextInt();
			
			if(N%2==0) {
				answer= -N/2;
			}else {
				answer= N - N/2;
			}
			System.out.println("#"+t+" "+answer);
		}
	}

}