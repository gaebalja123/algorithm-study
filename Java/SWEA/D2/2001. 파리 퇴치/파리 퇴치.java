import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[][] arr = new int[N][N];
			
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					arr[r][c] = sc.nextInt();
				}
			}
			
			int max = 0;
			int sum;
			for (int r = 0; r <= N-M; r++) {
				for (int c = 0; c <= N-M; c++) {
				sum =0;
					for (int i = 0; i < M; i++) {
						for (int j = 0; j < M; j++) {
						
						sum += arr[r+i][c+j];
						}
					}
				if(sum>max) {
					max = sum;
				}
				}
			}
			
			System.out.println("#"+t+" "+max);
		}
	}
}