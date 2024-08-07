import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
		public static void main(String[] args) throws NumberFormatException, IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			
			for(int tc = 1; tc<=T;tc++) {
				int N = Integer.parseInt(br.readLine());
				//1이 더 긴 것
				Queue<String> deck1 = new LinkedList<>();
				//2가 짧은 것
				Queue<String> deck2 = new LinkedList<>();
				
				String answer = "";
				
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				for(int i=0;i<N;i++) {
					if(i < Math.ceil(N/2.0)) {
						deck1.add(st.nextToken());
					} else {
						deck2.add(st.nextToken());					
					  }
				}

				while(!deck1.isEmpty()) {
					answer+=deck1.poll()+" ";
					if(deck2.isEmpty()) {
						break;
					}
					answer+=deck2.poll()+" ";
				}
				System.out.println("#"+tc+" "+answer);
		}
			
	}

}