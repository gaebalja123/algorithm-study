import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 특정 숫자에 대해 가장 작은 경우를 찾고, 3가지 경우 증 최솟값을 구한다.
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] dp = new int[N + 1];
		dp[1] = 0;

		for (int i = 2; i <= N; i++) {
			int minCnt = Integer.MAX_VALUE;
			
			minCnt = Math.min(minCnt, dp[i - 1] + 1);

			if (i % 3 == 0)
				minCnt = Math.min(minCnt, dp[i / 3] + 1);
			
			if (i % 2 == 0)
				minCnt = Math.min(minCnt, dp[i / 2] + 1);
			
			dp[i] = minCnt;
		}
		System.out.println(dp[N]);
	}

}