import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc =1;tc<=T;tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i =0;i<N;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			// for문 - 2번째 값부터 끝까지
			for(int i = 1;i<arr.length;i++) {
				// 1. key 값(현재) 저장
				int key = arr[i];
				// 현재 값의 이전 값을 나타내는 인덱스 설정
				int j = i -1;
				
				// j가 0이상, 현재 값(key)보다 이전 값(arr[j])이 크면
				while(j>=0 && arr[j]>key) {
					// 이전 요소를 오른쪽으로 이동
					arr[j+1] = arr[j];
					
					// 인덱스를 하나 감소해서 다시 반복
					j--;
				}
				// 옮길필요없으면 그 자리에 넣음
				arr[j+1] = key;
				
			}
			System.out.print("#"+tc+" ");
			for(int i =0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
}