import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		int sum = 0;
		for (int i = 0; i < N.length(); i++) {
			int a = Integer.parseInt(N.substring(i, i+1));
			sum +=a;
		}
		System.out.println(sum);
	}

}