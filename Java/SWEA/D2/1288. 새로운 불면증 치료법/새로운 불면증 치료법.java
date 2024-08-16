import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			
			int N =sc.nextInt();
			Set<Integer> set = new HashSet<Integer>();
			
			int k = 0;
			
			int num = N;
			
			while(!(set.size()==10)) {
				String str =  Integer.toString(num);
				
				for (int i = 0; i < str.length(); i++) {
					set.add(str.charAt(i)-'0');
				}
				num += N;
				k++;
			}
			System.out.println("#"+t+" "+(k*N));
			
		}
	}
}