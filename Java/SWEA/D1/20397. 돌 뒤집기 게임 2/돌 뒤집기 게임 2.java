import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] arr = new int[N+1];
			
			for (int i = 1; i <= N; i++) {
				arr[i] = sc.nextInt();
			}
			
			for (int i = 0; i <M; i++) {
				int order = sc.nextInt();
				int width = sc.nextInt();
				
				for (int j = 1; j <= width ; j++) {
					if((order-j > 0)&&(order+j <= N))
						if(arr[order-j] == arr[order+j]) {
							arr[order-j]^=1;
							arr[order+j]^=1;
						}
				}
				
			}
			System.out.print("#"+t+" ");
			for (int i = 1; i <= N; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}

}