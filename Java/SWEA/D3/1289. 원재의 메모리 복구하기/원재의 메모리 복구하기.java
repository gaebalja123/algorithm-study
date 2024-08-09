import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc =1;tc<=T;tc++) {
			
			String mem = sc.next();
			
			int cnt = 0;
			if(mem.charAt(0)=='1') {
				cnt++;
			}
			for(int i =0;i<mem.length()-1;i++) {
				
				if(mem.charAt(i)!=mem.charAt(i+1)) {
					cnt++;
				}
				
			}	
				System.out.println("#"+tc+" "+cnt);
		}
	}
}