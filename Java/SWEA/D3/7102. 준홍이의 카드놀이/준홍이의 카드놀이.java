import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc =1;tc<=T;tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] sumCount = new int[N+M+1];
			sumCount[0] = 0;
			
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=M;j++) {
				  
				  sumCount[i+j]++;
				}
			
			}			
	
		int Max= Arrays.stream(sumCount).max().getAsInt();
		
		System.out.print("#"+tc+" ");
		for(int i =0;i<N+M;i++) {
			if(sumCount[i]==Max) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		}
	}

}