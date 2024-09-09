import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			String str = sc.next();
			
			int year = Integer.parseInt(str.substring(0, 4));
			int month = Integer.parseInt(str.substring(4, 6));
			int day = Integer.parseInt(str.substring(6, 8));
			
			List<Integer> d31 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
			List<Integer> d30 = Arrays.asList(4, 6, 9, 11);
			
			if(year>0&&month<=12&&month>0) {
				if(d31.contains(month) && day<=31) {
					System.out.println("#"+t+" "+str.substring(0,4)+"/"+str.substring(4,6)+"/"+str.substring(6,8));
				}else if(d30.contains(month) && day<=30) {
					System.out.println("#"+t+" "+str.substring(0,4)+"/"+str.substring(4,6)+"/"+str.substring(6,8));				
				}else if(month ==2 && day<=28) {
					System.out.println("#"+t+" "+str.substring(0,4)+"/"+str.substring(4,6)+"/"+str.substring(6,8));									
				}else {System.out.println("#"+t+" "+-1);}
			}else {System.out.println("#"+t+" "+-1);}
		}
	
		
	}
}