import java.util.Scanner;

public class Solution {
	static int N;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();

		square(1);
		
	}
	
	static void square(int times) {
		//기저조건
		if(times > N+1) {
			System.out.println(sb.toString());
			return;
		}
		sb.append((int) Math.pow( 2, times-1)).append(" ");
		square(times+1);
	}
}