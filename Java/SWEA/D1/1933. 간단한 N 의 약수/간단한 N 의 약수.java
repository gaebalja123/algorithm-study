import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= N; i++) {
			if(N%i==0) {
				sb.append(i).append(" ");
			}
		}
		System.out.println(sb.toString());
	}
}