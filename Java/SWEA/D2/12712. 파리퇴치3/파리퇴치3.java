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
			// 상 하 좌 우
			int[] tr = {-1,1,0,0};
			int[] tc = {0,0,-1,1};
			
			// 좌상 우상 좌하 우하
			int[] xr = {-1,-1,1,1};
			int[] xc = {-1,1,-1,1};
			
			int max = 0;
			int sumt;
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					sumt =arr[r][c];
					for (int i = 0; i < 4; i++) {
						for (int m = 1; m < M; m++) {
							int nr = r + tr[i]*m;
							int nc = c + tc[i]*m;
							if(nr >= 0 && nc >= 0 && nr < N && nc < N) {
							sumt += arr[nr][nc];
							}
						}
						
					}
				if(sumt>max)
					max = sumt;
				}
			}
			
			//x자
			int sumx;
			for (int r = 0; r < N; r++) {
				for (int c = 0; c < N; c++) {
					sumx =arr[r][c];
					for (int i = 0; i < 4; i++) {
						for (int m = 1; m < M; m++) {
							int nr = r + xr[i]*m;
							int nc = c + xc[i]*m;
							if(nr >=0  && nc >= 0 && nr < N && nc < N)
								sumx += arr[nr][nc];
							
						}
						
					}
					if(sumx>max)
						max = sumx;
				}
			}
		System.out.println("#"+t+" "+max);
		}
	}

}
