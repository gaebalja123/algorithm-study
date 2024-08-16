import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T =sc.nextInt();
		
		for(int tc =1; tc <=T;tc++) {
			
			int N = sc.nextInt();
			//2 3 5 7 11
			int[] cnt = new int[5];
			loop1 : while(N>1) {
				if(N%2==0) {
					cnt[0]++;
					N = N/2;
				}else {
				break loop1;
				}
			}
				
			loop2 : while(N>1) {
				if(N%3==0) {
					cnt[1]++;
					N = N/3;
				}else {
					break loop2;
				}
			}
			
			loop3 : while(N>1) {
				if(N%5==0) {
					cnt[2]++;
					N = N/5;
				}else {
					break loop3;
				}
			}
			
			loop4 : while(N>1) {
				if(N%7==0) {
					cnt[3]++;
					N = N/7;
				}else {
					break loop4;
				}
			}
			
			loop5 : while(N>1) {
				if(N%11==0) {
					cnt[4]++;
					N = N/11;
				}else {
					break loop5;
				}
			}
			System.out.print("#"+tc+" ");
			for (int i = 0; i < cnt.length; i++) {
				System.out.print(cnt[i]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}