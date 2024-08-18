import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			String word = sc.next();
			StringBuilder sb = new StringBuilder(word);
			String drow = sb.reverse().toString();
			if(word.equals(drow)) {
				System.out.println("#"+t+" "+1);
			}else {
			System.out.println("#"+t+" "+0);}
		}
	}

}