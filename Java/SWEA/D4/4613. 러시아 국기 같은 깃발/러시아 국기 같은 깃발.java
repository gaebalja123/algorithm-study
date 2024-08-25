import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			char[][] arr = new char[N][M];
			//System.out.println(sc.next());
			
			//배열 생성
			for (int r = 0; r < N; r++) {
				String str = sc.next();
				for (int c = 0; c < M; c++) {
					arr[r][c] = str.charAt(c);
					
				}
			}
			
			int min = Integer.MAX_VALUE;
			
			// 각 색의 행 인덱스를 w,b로 표기(r은 자동)
			//W의 범위 -> 처음부터 2줄 전까지 ( 인덱스 고려) => 0<= i <N-2
			for(int W = 0; W < N-2; W++) {
				//B의 범위 -> w 다음부터 1줄 전까지 (인덱스 고려) => w+1 <= b <N-1
				// W와 B의 범위를 정하면, R은 정할 수 있다.
				for(int B = W+1; B <N-1; B++) {
					//w와, b가 각각 정해진 상태에 대해서 바꿔야 할 칸의 개수를 선언
					// b조건이 바뀔 때마다 초기화
					int cnt = 0;
					// 흰색
					for(int w = 0; w <= W; w++) {
						for(int c = 0; c < M;c++) {
							if(arr[w][c] != 'W') {
								cnt++;
							}
						}
					}
					// 파란색
					for(int b = W+1; b <= B; b++) {
						for(int c = 0; c < M;c++) {
							if(arr[b][c] != 'B') {
								cnt++;
							}
						}
					}
					// 빨간색
					for(int r = B+1; r < N; r++) {
						for(int c = 0; c < M;c++) {
							if(arr[r][c] != 'R') {
								cnt++;
							}
						}
					}
					
					if(cnt<min) {
						min = cnt;
					}
					
				}
					
			}
		System.out.println("#"+t+" "+min);
		}
		
						
	}
}