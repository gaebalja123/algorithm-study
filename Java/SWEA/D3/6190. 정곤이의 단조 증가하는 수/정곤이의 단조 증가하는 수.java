import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc =1; tc <= T; tc++) {
			int N = sc.nextInt();
			List<Integer> list = new ArrayList<>(N);
			
			for(int i =0; i<N;i++) {
				list.add(sc.nextInt());
			}
			
			int max =-1;
			for(int i =0; i<N-1;i++) {
				for(int j =i+1; j<N;j++) {
					
					// 두 수의 합을 곱하기만 하고 : 조회 =O(1)
					int mul = list.get(i) * list.get(j);
					
					// 바로 단조인지 체크: 9번만 보면됨 = O(1)
					//  - 단조라면 최대값인지 체크 :O(1)
					if(danjo(mul)&&mul>max) {
						max = mul;
					}					
					// 두 수의 합을 곱해서 리스트에 저장.	
				}
			}
			System.out.println("#"+tc+" "+max);
		}
		
	}
	static boolean danjo(int num) {
		while(num>0) {
			int b = num%10;
			num /= 10;
			int s = num%10;
			if(b<s) {
				return false;
			}
		} 
		return true;
	}
}