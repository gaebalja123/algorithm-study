import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {
	
	public static void main(String[] args) throws IOException {
		// 버퍼드리더로 입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 테스트 케이스 수 입력, 최초 1회만
		int TC = Integer.parseInt(br.readLine());
		
		
		for(int j =1; j<=TC;j++) {
			// 테스트 케이스마다 합 초기화 필요
			int sum = 0;
			// 테스트 케이스마다 K번 부르기 때문에 이 위치
			int K = Integer.parseInt(br.readLine());
			// 테스트 케이스마다 stack 초기화 필요
			Stack<Integer> stack = new Stack<>();
			
			// K번 반복!
			for(int i =0; i<K;i++) {
				//지출 부르기!
				int money = Integer.parseInt(br.readLine());
				//0이 아니면 stack에 저장!
				if(money != 0) {
					stack.push(money);
				
				// 0이면 이전 부른 것 삭제!	
				}else {
					stack.pop();
					}
				
				}
			// stack 비울 때까지 sum에 더하기!
			while (!stack.isEmpty()) {
				int value = stack.pop();
				sum += value;
				
			}
			// sum 출력!
			System.out.println("#"+j+" "+sum);
		}	
			
	}
}