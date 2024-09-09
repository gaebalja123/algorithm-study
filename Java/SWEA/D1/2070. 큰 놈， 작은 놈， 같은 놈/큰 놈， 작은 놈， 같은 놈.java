import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for (int t = 1; t <= T; t++) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			sb.append("#").append(t).append(" ").append(">").append("\n");
		}else if(a<b) {
			sb.append("#").append(t).append(" ").append("<").append("\n");
		}else {sb.append("#").append(t).append(" ").append("=").append("\n");
			}
		
		
		}
		System.out.println(sb.toString());
	}
}